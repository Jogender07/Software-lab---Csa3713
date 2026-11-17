# Experiment 100: Spike Testing with Synchronizing Timer Using Apache JMeter

## 1. Aim
To use Apache JMeter to perform spike testing using the Synchronizing Timer.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Set Number of Threads = 50, Ramp-up = 10 seconds and Loop Count = 3. The users are created gradually, but the timer will release them together.
3. Add an HTTP Request for the home page of the application under test.
4. Right click the HTTP Request, select Add > Timer > Synchronizing Timer, enter Number of Simulated Users to Group by = 50 and Timeout in milliseconds = 10000. All 50 users wait at the timer and then send the request at the same moment (spike).
5. Add Aggregate Report and Graph Results, run the plan and observe the response time of the requests sent in the spike.
6. Check whether the system recovers: the response time of the third spike must be similar to that of the first spike and error percentage must stay within criteria.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-up / Loops | 50 users / 10s ramp-up / 3 loops |
| **HTTP Request** | Protocol / Host / Path | http / localhost:8080 / `/` |
| **Synchronizing Timer**| Group by / Timeout | 50 users / 10000 ms |

## 4. Test Plan Deliverables
- [Exercise100.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-100/Exercise100.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise100.jmx -l results/ex100.jtl
```

## 6. Expected Output
```
Aggregate Report (expected sample count = 50 users x 3 loops = 150, sent as 3 spikes of 50 requests)
Label    # Samples   Average   90% Line   99% Line   Error %
Home           150      <ms>       <ms>       <ms>       <%>
TOTAL          150      <ms>       <ms>       <ms>       <%>
```

## 7. Actual Execution Status
- Synchronizing Timer instantaneous user burst spike test verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to perform spike testing using the Synchronizing Timer and the results were verified.
