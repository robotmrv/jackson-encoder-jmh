package benchmark;

import benchmark.model.Pojo;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.springframework.core.ResolvableType;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.http.MediaType;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

//java -jar target\benchmarks.jar -prof gc
@Measurement(iterations = 3, time = 3)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 1)
@Warmup(iterations = 3, time = 2)
@BenchmarkMode(value = Mode.SampleTime)
@Threads(Threads.MAX)
public class EncoderBenchmark {
    public static final String FILTER_ID = "filter_id";

    @State(value = Scope.Benchmark)
    public static class BmState {

        CustomJackson2JsonEncoder customJsonEncoder;
        Jackson2JsonEncoder jsonEncoder;
        DataBufferFactory bufferFactory;
        ResolvableType resolvableType;
        Pojo data;

        @JsonFilter(FILTER_ID)
        private static class DynamicMixIn {}

        @Setup
        public void setup() {
            final Jackson2ObjectMapperBuilder mapperBuilder = new Jackson2ObjectMapperBuilder();
            ObjectMapper objectMapper = mapperBuilder.build();
            bufferFactory = new DefaultDataBufferFactory();
            customJsonEncoder = new CustomJackson2JsonEncoder(objectMapper);
            jsonEncoder = new Jackson2JsonEncoder(objectMapper);
            resolvableType = ResolvableType.forClass(Pojo.class);
            data = Pojo.fullPojoWithNChildren(5);
        }
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void withCloseAndRelease(Blackhole blackhole, BmState state) throws Throwable {
        blackhole.consume(state.customJsonEncoder.encodeValue(
                state.data,
                state.bufferFactory,
                state.resolvableType,
                MediaType.APPLICATION_JSON_UTF8,
                Collections.emptyMap()
        ));
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void standard(Blackhole blackhole, BmState state) throws Throwable {
        blackhole.consume(state.jsonEncoder.encodeValue(
                state.data,
                state.bufferFactory,
                state.resolvableType,
                MediaType.APPLICATION_JSON_UTF8,
                Collections.emptyMap()
        ));
    }
}
