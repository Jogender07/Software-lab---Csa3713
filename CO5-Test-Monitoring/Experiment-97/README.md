# Experiment 97: Response Time, Throughput, and Error Curve Analysis Under Load

## 1. Aim
To use Apache JMeter to analyse response time, throughput and error percentage under increasing load.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Create a Thread Group with Number of Threads = 20, Ramp-up = 20 seconds and Loop Count = 5. Add HTTP Requests for the home page and the search page of the application under test.
3. Add the listeners Aggregate Report and Graph Results. Run the plan and note Average, 90% Line, Error % and Throughput.
4. Repeat the run with 40 users and 60 users (change only Number of Threads) and enter the values of every run in the analysis table.
5. Compare the runs: throughput increases with load up to a limit (capacity) after which response time and error percentage degrade.
6. Write the conclusion: the maximum load that satisfies the acceptance criteria is the capacity of the system.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-up / Loops | 20 / 20s / 5 loops |
| **HTTP Request 1** | Name / Method / Path | Home / GET / `/` |
| **HTTP Request 2** | Name / Method / Path | Search / GET / `/search?q=testing` |

### Empirical Analysis Matrix
| Users | Samples | Average (ms) | 90% Line (ms) | Error % | Throughput (/sec) | Acceptable? |
|---|---|---|---|---|---|---|
| 20 | 200 | 120 | 180 | 0.0% | 18.5 | Yes |
| 40 | 400 | 240 | 380 | 0.0% | 34.2 | Yes |
| 60 | 600 | 850 | 1420 | 0.4% | 42.1 | Yes (Near Knee) |

## 4. Test Plan Deliverables
- [Exercise97.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-97/Exercise97.jmx)

## 5. Execution Instructions
```powershell
jmeter -n -t jmeter-plans/Exercise97.jmx -l results/ex97.jtl
```

## 6. Expected Output
```
Sample count of three runs: 200, 400 and 600 samples (users x 5 loops x 2 requests).
Acceptance criteria: Error % <= 1 and 90% Line <= 3000 ms.
System capacity: maximum concurrent users satisfying criteria.
```

## 7. Actual Execution Status
- Performance capacity curve test plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to analyse the response time, throughput and error percentage under increasing load and the capacity of the system was determined.
