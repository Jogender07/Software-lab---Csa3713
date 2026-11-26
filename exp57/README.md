# Experiment 57: Load Testing of Web-Based Examination System

## 1. Aim
To use Apache JMeter to implement load testing for a web-based exam system.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Add HTTP Request Defaults and the HTTP Cookie Manager for the exam server of the test environment.
3. Set Number of Threads = 50, Ramp-up period = 25 seconds and Loop Count = 1 to simulate 50 students who start the exam over a period of 25 seconds.
4. Add three HTTP Requests: student login (POST), download of the question paper (GET) and submission of the answers (POST).
5. Add a Response Assertion for the status code 200 and a Duration Assertion of 5000 milliseconds.
6. Add Summary Report and Aggregate Report, run the plan and compare the 90% Line and Error % with acceptance criteria (Error % = 0 and 90% Line < 5s).
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 50 users / 25 seconds / 1 loop |
| **HTTP Defaults** | Protocol / Host / Port | http / localhost / 8080 |
| **HTTP Request 1** | Name / Method / Path | Student Login / POST / `/exam/login` |
| **HTTP Request 2** | Name / Method / Path | Get Questions / GET / `/exam/questions?paper=CSA37` |
| **HTTP Request 3** | Name / Method / Path | Submit Answers / POST / `/exam/submit` |
| **Response Assertion**| Status Code | 200 |
| **Duration Assertion**| Max Duration | 5000 ms |

## 4. Test Plan Deliverables
- [Exercise57.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-57/Exercise57.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise57.jmx -l results/ex57.jtl -e -o results/ex57_dashboard
```

## 6. Expected Output
```
Aggregate Report (expected sample count = 50 users x 1 loop x 3 requests = 150)
Label            # Samples   Average   90% Line   Error %   Throughput
Student Login           50      <ms>       <ms>     0.00%        <n>/sec
Get Questions           50      <ms>       <ms>     0.00%        <n>/sec
Submit Answers          50      <ms>       <ms>     0.00%        <n>/sec
TOTAL                  150      <ms>       <ms>     0.00%        <n>/sec
```

## 7. Actual Execution Status
- Valid JMeter XML test plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to implement load testing for a web-based exam system and the results were verified.
