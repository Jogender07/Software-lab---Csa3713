# Experiment 99: Automated JTL Analysis and Test Completion Evaluation (Python)

## 1. Aim
To analyse a JMeter JTL result file using a Python program and to decide the test completion criteria.

## 2. Algorithm
1. Start the program, run any plan in non-GUI mode and store the samples in `results.jtl` in CSV format (the default format).
2. Write the Python program `analyse.py` that reads the file using `csv.DictReader` and collects the columns `timeStamp`, `elapsed` and `success`.
3. Write the function `percentile()` that returns the 90th and 95th percentile of the response times.
4. Calculate total samples, failed samples, error percentage, average, minimum and maximum response time and throughput (`samples / duration`).
5. Compare the values with the completion criteria (error <= 1% and 95th percentile <= 2000 ms) and print MET or NOT MET.
6. Run `python analyse.py` and decide whether the performance test can be closed.
7. Stop.

## 3. Program & Test Artifacts
- Script: [analyse.py](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-99/analyse.py)
- Sample Log: [results.jtl](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-99/results.jtl)

## 4. Execution Instructions
```powershell
python analyse.py
```

## 5. Expected Output
```
Total samples    : 200
Failed samples   : 2
Error percentage : 1.00 %
Average (ms)     : 412
Minimum (ms)     : 120
Maximum (ms)     : 746
90th percentile  : 566 ms
95th percentile  : 614 ms
Throughput       : 9.99 requests/second
Completion criteria (error <= 1 % and 95th percentile <= 2000 ms) : MET
```

## 6. Actual Execution Status
- Automated statistical log analysis and SLA evaluation verified.
- Status: **VERIFIED**.

## 7. Result
Thus the JTL result file was analysed using the Python program and the test completion criteria were decided and verified.
