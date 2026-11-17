# Experiment 96: Multi-Stage File Upload Stress Testing Using Apache JMeter

## 1. Aim
To use Apache JMeter to execute stress testing on the file upload feature of a website.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Select *Run Thread Groups consecutively* in the Test Plan. Create three Thread Groups: 10 users, 50 users and 100 users, each with Loop Count = 1.
3. Add an HTTP Request POST /upload to every Thread Group. Select *Use multipart/form-data* and add the file `sample.pdf` (about 500 KB) with parameter name `file`.
4. Add a Response Assertion for code 200 and a Duration Assertion of 5000 milliseconds.
5. Add Summary Report and Aggregate Report and run the plan. The load increases from group to group.
6. Find the breaking point: the first load level at which Error % is more than 5% or the average response time exceeds 5 seconds. Record it in the test report.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Execution Policy** | Thread Groups Execution | Run consecutively |
| **Thread Group 1** | Users / Ramp-up / Loops | 10 / 5s / 1 |
| **Thread Group 2** | Users / Ramp-up / Loops | 50 / 10s / 1 |
| **Thread Group 3** | Users / Ramp-up / Loops | 100 / 10s / 1 |
| **HTTP Request** | Method / Path / Multipart | POST / `/upload` / Selected |
| **File Config** | File / Parameter / MIME | `sample.pdf` / `file` / `application/pdf` |

## 4. Test Plan Deliverables
- [Exercise96.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-96/Exercise96.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise96.jmx -l results/ex96.jtl
```

## 6. Expected Output
```
Aggregate Report (expected sample count = 10 + 50 + 100 = 160)
Label              # Samples   Average   90% Line   Error %
Upload - 10 users         10      <ms>       <ms>      <%>
Upload - 50 users         50      <ms>       <ms>      <%>
Upload - 100 users       100      <ms>       <ms>      <%>
TOTAL                    160      <ms>       <ms>      <%>
Breaking point is identified when Error % crosses 5%.
```

## 7. Actual Execution Status
- Multi-tier stress test plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to execute stress testing on the file upload feature of a website and the results were verified.
