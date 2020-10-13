run `java -jar target\benchmarks.jar -prof gc`
results
```
Benchmark                                                                Mode      Cnt         Score      Error   Units
EncoderBenchmark.standard                                              sample  1280563      6510.422 ±  334.351   ns/op
EncoderBenchmark.standard:standard·p0.00                               sample               1500.000              ns/op
EncoderBenchmark.standard:standard·p0.50                               sample               4600.000              ns/op
EncoderBenchmark.standard:standard·p0.90                               sample               5496.000              ns/op
EncoderBenchmark.standard:standard·p0.95                               sample               5800.000              ns/op
EncoderBenchmark.standard:standard·p0.99                               sample              14400.000              ns/op
EncoderBenchmark.standard:standard·p0.999                              sample             301568.000              ns/op
EncoderBenchmark.standard:standard·p0.9999                             sample            1701772.493              ns/op
EncoderBenchmark.standard:standard·p1.00                               sample           34078720.000              ns/op
EncoderBenchmark.standard:·gc.alloc.rate                               sample        3     17759.874 ± 2080.518  MB/sec
EncoderBenchmark.standard:·gc.alloc.rate.norm                          sample        3     19184.768 ±    0.729    B/op
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space                      sample        3     17988.991 ± 3146.870  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space.norm                 sample        3     19432.133 ± 1953.533    B/op
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space                  sample        3         0.304 ±    0.676  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space.norm             sample        3         0.329 ±    0.744    B/op
EncoderBenchmark.standard:·gc.count                                    sample        3       162.000             counts
EncoderBenchmark.standard:·gc.time                                     sample        3        90.000                 ms
EncoderBenchmark.withCloseAndRelease                                   sample  1871035      1049.055 ±   74.039   ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.00         sample                800.000              ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.50         sample                800.000              ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.90         sample                900.000              ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.95         sample                900.000              ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.99         sample               1000.000              ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.999        sample              19680.000              ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.9999       sample             341504.000              ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p1.00         sample           28999680.000              ns/op
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate                    sample        3      6342.247 ± 3263.750  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate.norm               sample        3      1176.103 ±    0.169    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space           sample        3      6412.271 ± 2942.775  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space.norm      sample        3      1189.192 ±  211.657    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space       sample        3         0.279 ±    0.562  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space.norm  sample        3         0.052 ±    0.127    B/op
EncoderBenchmark.withCloseAndRelease:·gc.count                         sample        3       171.000             counts
EncoderBenchmark.withCloseAndRelease:·gc.time                          sample        3        89.000                 ms
```
