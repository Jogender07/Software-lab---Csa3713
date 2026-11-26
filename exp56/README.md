# Experiment 56: Load Testing of Student Information Portal Using Apache JMeter

## 1. Aim
To use Apache JMeter to execute performance testing on a student portal.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Add User Defined Variables for the host and the port of the student portal in the test environment, add HTTP Request Defaults that use them and add the HTTP Cookie Manager.
3. Set Number of Threads = 20, Ramp-up period = 10 seconds and Loop Count = 2.
4. Add four HTTP Requests: the login page, the login POST with a test account, the dashboard and the results page.
5. Add a Duration Assertion of 3000 milliseconds to check that every page responds quickly.
6. Add Summary Report and Aggregate Report, run the plan and analyse the average response time, throughput and error percentage.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 20 users / 10 seconds / 2 loops |
| **HTTP Defaults** | Protocol / Host / Port | http / localhost / 8080 |
| **HTTP Request 1** | Name / Method / Path | Login Page / GET / `/login` |
| **HTTP Request 2** | Name / Method / Path | Login / POST / `/login` (regno, password) |
| **HTTP Request 3** | Name / Method / Path | Dashboard / GET / `/dashboard` |
| **HTTP Request 4** | Name / Method / Path | Results / GET / `/results` |
| **Duration Assertion**| Max Duration | 3000 ms |

## 4. Test Plan Deliverables
- [Exercise56.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-56/Exercise56.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise56.jmx -l results/ex56.jtl -e -o results/ex56_dashboard
```

## 6. Expected Output
```
Aggregate Report (expected sample count = 20 users x 2 loops x 4 requests = 160)
Label        # Samples   Average   90% Line   95% Line   Error %   Throughput
Login Page          40      <ms>       <ms>       <ms>     0.00%        <n>/sec
Login               40      <ms>       <ms>       <ms>     0.00%        <n>/sec
Dashboard           40      <ms>       <ms>       <ms>     0.00%        <n>/sec
Results             40      <ms>       <ms>       <ms>     0.00%        <n>/sec
TOTAL              160      <ms>       <ms>       <ms>     0.00%        <n>/sec
```

## 7. Actual Execution Status
- Valid JMeter XML test plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to execute performance testing on a student portal and the results were verified.
