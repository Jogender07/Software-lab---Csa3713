# Experiment 79: Smoke Testing of Critical Pages Using Duration Assertion

## 1. Aim
To use Apache JMeter to perform smoke testing of the critical pages using the Duration Assertion.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Set Number of Threads = 1, Ramp-up period = 1 second and Loop Count = 1. Add HTTP Request Defaults for the website.
3. Add four HTTP Requests for the critical pages: home, login, checkboxes and dropdown.
4. Add a Response Assertion to every request to check the heading of the page, and one Duration Assertion of 3000 milliseconds for the whole plan.
5. Add Assertion Results and Summary Report, run the plan and verify that every page is available and responds in time.
6. If any request fails the build is rejected and the detailed testing is not started.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 1 user / 1 second / 1 loop |
| **HTTP Defaults** | Protocol / Server Name | https / the-internet.herokuapp.com |
| **Duration Assertion**| SLA Limit | 3000 ms |
| **HTTP Request 1** | Path / Pattern | `/` / Welcome to the-internet |
| **HTTP Request 2** | Path / Pattern | `/login` / Login Page |
| **HTTP Request 3** | Path / Pattern | `/checkboxes` / Checkboxes |
| **HTTP Request 4** | Path / Pattern | `/dropdown` / Dropdown List |

## 4. Test Plan Deliverables
- [Exercise79.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-79/Exercise79.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise79.jmx -l results/ex79.jtl
```

## 6. Expected Output
```
Summary Report
Label        # Samples   Error %
/                    1     0.00%
/login               1     0.00%
/checkboxes          1     0.00%
/dropdown            1     0.00%
TOTAL                4     0.00%
Smoke test result : 4 of 4 requests passed
```

## 7. Actual Execution Status
- Duration Assertion smoke test plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to perform smoke testing of the critical pages using the Duration Assertion and the results were verified.
