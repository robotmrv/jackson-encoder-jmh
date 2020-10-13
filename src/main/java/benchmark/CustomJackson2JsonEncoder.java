package benchmark;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import org.springframework.core.ResolvableType;
import org.springframework.core.codec.CodecException;
import org.springframework.core.codec.EncodingException;
import org.springframework.core.codec.Hints;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.log.LogFormatUtils;
import org.springframework.http.codec.json.Jackson2CodecSupport;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.lang.Nullable;
import org.springframework.util.MimeType;

import java.io.IOException;
import java.util.Map;

public class CustomJackson2JsonEncoder extends Jackson2JsonEncoder {


    public CustomJackson2JsonEncoder(ObjectMapper mapper,
                                     MimeType... mimeTypes) {
        super(mapper, mimeTypes);
    }

    //mostly copy of super method but with close and release
    @Override
    public DataBuffer encodeValue(Object value, DataBufferFactory bufferFactory,
                                  ResolvableType valueType, @Nullable MimeType mimeType, @Nullable Map<String, Object> hints) {

        ObjectWriter writer = createObjectWriter(valueType, mimeType, hints);
        ByteArrayBuilder byteBuilder = new ByteArrayBuilder(writer.getFactory()._getBufferRecycler());
        try {
            JsonEncoding encoding = getJsonEncoding(mimeType);

            logValue(hints, value);

            //close to release bytes
            try (JsonGenerator generator = writer.getFactory().createGenerator(byteBuilder, encoding)) {
                writer.writeValue(generator, value);
            }
            catch (InvalidDefinitionException ex) {
                throw new CodecException("Type definition error: " + ex.getType(), ex);
            }
            catch (JsonProcessingException ex) {
                throw new EncodingException("JSON encoding error: " + ex.getOriginalMessage(), ex);
            }
            catch (IOException ex) {
                throw new IllegalStateException("Unexpected I/O error while writing to byte array builder", ex);
            }

            byte[] bytes = byteBuilder.toByteArray();
            DataBuffer buffer = bufferFactory.allocateBuffer(bytes.length);
            buffer.write(bytes);
            return buffer;
        } finally {
            //release bytes
            byteBuilder.release();
        }
    }

    private ObjectWriter createObjectWriter(ResolvableType valueType, @Nullable MimeType mimeType,
                                            @Nullable Map<String, Object> hints) {

        JavaType javaType = getJavaType(valueType.getType(), null);
        Class<?> jsonView = (hints != null ? (Class<?>) hints.get(Jackson2CodecSupport.JSON_VIEW_HINT) : null);
        ObjectWriter writer = (jsonView != null ?
                getObjectMapper().writerWithView(jsonView) : getObjectMapper().writer());

        if (javaType.isContainerType()) {
            writer = writer.forType(javaType);
        }

        return customizeWriter(writer, mimeType, valueType, hints);
    }

    private void logValue(@Nullable Map<String, Object> hints, Object value) {
        if (!Hints.isLoggingSuppressed(hints)) {
            LogFormatUtils.traceDebug(logger, traceOn -> {
                String formatted = LogFormatUtils.formatValue(value, !traceOn);
                return Hints.getLogPrefix(hints) + "Encoding [" + formatted + "]";
            });
        }
    }
}
