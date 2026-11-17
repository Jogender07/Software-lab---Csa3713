# Experiment 98: Soak Testing for Extended Duration and Stability Monitoring

## 1. Aim
To use Apache JMeter to perform soak testing for an extended duration and monitor the stability.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Set Number of Threads = 10, Ramp-up = 10 seconds and select Loop Count = Infinite. Select *Specify Thread lifetime* and enter Duration = 1800 seconds.
3. Add the HTTP Requests of the main user flow and a Constant Timer of 1000 milliseconds to simulate a steady load.
4. Add the listener Simple Data Writer and enter the filename `soak.jtl`. Do not use View Results Tree in a long test because it consumes memory.
5. Run the plan in non-GUI mode. While the test is running monitor memory (heap) and CPU of application server using JConsole or VisualVM.
6. After the run compare average response time and error percentage of the first 10 minutes with those of the last 10 minutes.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-up / Duration | 10 users / 10 seconds / 1800 seconds (30 mins) |
| **Loop Count** | Lifetime Policy | Infinite until duration elapsed |
| **Constant Timer** | Pacing Delay | 1000 ms between requests |
| **Listener** | Output Data Writer | `soak.jtl` |

## 4. Test Plan Deliverables
- [Exercise98.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-98/Exercise98.jmx)

## 5. Execution Instructions
Run soak test in non-GUI mode:
```powershell
jmeter -n -t jmeter-plans/Exercise98.jmx -l soak.jtl
```

## 6. Expected Output
```
Expected observations of a stable system:
Duration of test                  : 1800 seconds (stops automatically)
Average response time             : almost identical in first and last 10 minutes
Error %                           : 0.00% throughout test
Heap memory (JConsole)            : sawtooth pattern with GC, no continuous growth
```

## 7. Actual Execution Status
- 1800-second scheduled soak test plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to perform soak testing for an extended duration and monitor the stability and the results were verified.
