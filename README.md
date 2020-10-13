run `java -jar target\benchmarks.jar -prof gc`
results
```
Benchmark                                                              (size)    Mode      Cnt         Score       Error   Units
EncoderBenchmark.standard                                               SMALL  sample  1242327      7568.757 ±   504.091   ns/op
EncoderBenchmark.standard:standard·p0.00                                SMALL  sample               1200.000               ns/op
EncoderBenchmark.standard:standard·p0.50                                SMALL  sample               4200.000               ns/op
EncoderBenchmark.standard:standard·p0.90                                SMALL  sample               5200.000               ns/op
EncoderBenchmark.standard:standard·p0.95                                SMALL  sample               5496.000               ns/op
EncoderBenchmark.standard:standard·p0.99                                SMALL  sample              17600.000               ns/op
EncoderBenchmark.standard:standard·p0.999                               SMALL  sample             656752.640               ns/op
EncoderBenchmark.standard:standard·p0.9999                              SMALL  sample            5092737.024               ns/op
EncoderBenchmark.standard:standard·p1.00                                SMALL  sample           63635456.000               ns/op
EncoderBenchmark.standard:·gc.alloc.rate                                SMALL  sample        3     16876.982 ± 15567.406  MB/sec
EncoderBenchmark.standard:·gc.alloc.rate.norm                           SMALL  sample        3     18912.820 ±     1.751    B/op
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space                       SMALL  sample        3     16984.177 ± 20148.650  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space.norm                  SMALL  sample        3     19025.003 ±  7094.976    B/op
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space                   SMALL  sample        3         0.276 ±     0.487  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space.norm              SMALL  sample        3         0.309 ±     0.257    B/op
EncoderBenchmark.standard:·gc.count                                     SMALL  sample        3       123.000              counts
EncoderBenchmark.standard:·gc.time                                      SMALL  sample        3        88.000                  ms
EncoderBenchmark.standard                                              MEDIUM  sample  1168448      6943.506 ±   221.997   ns/op
EncoderBenchmark.standard:standard·p0.00                               MEDIUM  sample               3000.000               ns/op
EncoderBenchmark.standard:standard·p0.50                               MEDIUM  sample               5096.000               ns/op
EncoderBenchmark.standard:standard·p0.90                               MEDIUM  sample               6096.000               ns/op
EncoderBenchmark.standard:standard·p0.95                               MEDIUM  sample               6496.000               ns/op
EncoderBenchmark.standard:standard·p0.99                               MEDIUM  sample              16096.000               ns/op
EncoderBenchmark.standard:standard·p0.999                              MEDIUM  sample             275968.000               ns/op
EncoderBenchmark.standard:standard·p0.9999                             MEDIUM  sample            2448839.475               ns/op
EncoderBenchmark.standard:standard·p1.00                               MEDIUM  sample           30343168.000               ns/op
EncoderBenchmark.standard:·gc.alloc.rate                               MEDIUM  sample        3     17321.737 ±  6117.869  MB/sec
EncoderBenchmark.standard:·gc.alloc.rate.norm                          MEDIUM  sample        3     20584.740 ±     0.986    B/op
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space                      MEDIUM  sample        3     17373.760 ±  8861.711  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space.norm                 MEDIUM  sample        3     20645.069 ±  5169.821    B/op
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space                  MEDIUM  sample        3         0.348 ±     1.126  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space.norm             MEDIUM  sample        3         0.414 ±     1.491    B/op
EncoderBenchmark.standard:·gc.count                                    MEDIUM  sample        3       156.000              counts
EncoderBenchmark.standard:·gc.time                                     MEDIUM  sample        3        89.000                  ms
EncoderBenchmark.standard                                                 BIG  sample  1108559     25400.314 ±   383.783   ns/op
EncoderBenchmark.standard:standard·p0.00                                  BIG  sample              21184.000               ns/op
EncoderBenchmark.standard:standard·p0.50                                  BIG  sample              22272.000               ns/op
EncoderBenchmark.standard:standard·p0.90                                  BIG  sample              23296.000               ns/op
EncoderBenchmark.standard:standard·p0.95                                  BIG  sample              24288.000               ns/op
EncoderBenchmark.standard:standard·p0.99                                  BIG  sample              58752.000               ns/op
EncoderBenchmark.standard:standard·p0.999                                 BIG  sample             515584.000               ns/op
EncoderBenchmark.standard:standard·p0.9999                                BIG  sample            3512631.296               ns/op
EncoderBenchmark.standard:standard·p1.00                                  BIG  sample           51118080.000               ns/op
EncoderBenchmark.standard:·gc.alloc.rate                                  BIG  sample        3      9092.443 ±  1508.929  MB/sec
EncoderBenchmark.standard:·gc.alloc.rate.norm                             BIG  sample        3     45650.467 ±     3.312    B/op
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space                         BIG  sample        3      9174.451 ±  3205.813  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Eden_Space.norm                    BIG  sample        3     46060.476 ± 11092.691    B/op
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space                     BIG  sample        3         0.323 ±     1.038  MB/sec
EncoderBenchmark.standard:·gc.churn.PS_Survivor_Space.norm                BIG  sample        3         1.620 ±     5.011    B/op
EncoderBenchmark.standard:·gc.count                                       BIG  sample        3       163.000              counts
EncoderBenchmark.standard:·gc.time                                        BIG  sample        3        90.000                  ms
EncoderBenchmark.withCloseAndRelease                                    SMALL  sample  1396264       836.310 ±   107.060   ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.00          SMALL  sample                500.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.50          SMALL  sample                600.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.90          SMALL  sample                600.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.95          SMALL  sample                700.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.99          SMALL  sample                700.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.999         SMALL  sample              19680.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.9999        SMALL  sample             442041.088               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p1.00          SMALL  sample           27131904.000               ns/op
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate                     SMALL  sample        3      7274.705 ±  5323.424  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate.norm                SMALL  sample        3       904.073 ±     0.186    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space            SMALL  sample        3      7329.033 ±  6542.575  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space.norm       SMALL  sample        3       910.611 ±   165.411    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space        SMALL  sample        3         0.291 ±     1.342  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space.norm   SMALL  sample        3         0.036 ±     0.171    B/op
EncoderBenchmark.withCloseAndRelease:·gc.count                          SMALL  sample        3       175.000              counts
EncoderBenchmark.withCloseAndRelease:·gc.time                           SMALL  sample        3        89.000                  ms
EncoderBenchmark.withCloseAndRelease                                   MEDIUM  sample  1343486      2877.905 ±   109.585   ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.00         MEDIUM  sample               2100.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.50         MEDIUM  sample               2400.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.90         MEDIUM  sample               2500.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.95         MEDIUM  sample               2600.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.99         MEDIUM  sample               3500.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.999        MEDIUM  sample              63520.832               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.9999       MEDIUM  sample             762522.931               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p1.00         MEDIUM  sample           14794752.000               ns/op
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate                    MEDIUM  sample        3      4904.697 ±   344.229  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate.norm               MEDIUM  sample        3      2536.282 ±     0.168    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space           MEDIUM  sample        3      4964.870 ±   516.275  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space.norm      MEDIUM  sample        3      2567.401 ±   213.382    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space       MEDIUM  sample        3         0.197 ±     1.073  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space.norm  MEDIUM  sample        3         0.102 ±     0.561    B/op
EncoderBenchmark.withCloseAndRelease:·gc.count                         MEDIUM  sample        3       127.000              counts
EncoderBenchmark.withCloseAndRelease:·gc.time                          MEDIUM  sample        3        77.000                  ms
EncoderBenchmark.withCloseAndRelease                                      BIG  sample  1172404     23765.922 ±   183.083   ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.00            BIG  sample              20672.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.50            BIG  sample              21600.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.90            BIG  sample              22496.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.95            BIG  sample              23072.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.99            BIG  sample              50944.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.999           BIG  sample             366592.000               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p0.9999          BIG  sample            1568845.824               ns/op
EncoderBenchmark.withCloseAndRelease:withCloseAndRelease·p1.00            BIG  sample           19070976.000               ns/op
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate                       BIG  sample        3      5693.537 ±   619.550  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.alloc.rate.norm                  BIG  sample        3     27100.606 ±     0.954    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space              BIG  sample        3      5857.821 ±  3192.046  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Eden_Space.norm         BIG  sample        3     27880.071 ± 12267.127    B/op
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space          BIG  sample        3         0.185 ±     0.779  MB/sec
EncoderBenchmark.withCloseAndRelease:·gc.churn.PS_Survivor_Space.norm     BIG  sample        3         0.879 ±     3.722    B/op
EncoderBenchmark.withCloseAndRelease:·gc.count                            BIG  sample        3       139.000              counts
EncoderBenchmark.withCloseAndRelease:·gc.time                             BIG  sample        3        77.000                  ms
```
