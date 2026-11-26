# Experiment 58: Session Management and Cookie Handling Using HTTP Cookie Manager

## 1. Aim
To use Apache JMeter to test session management and cookie handling using the HTTP Cookie Manager.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1.
3. Add the HTTP Cookie Manager. Add an HTTP Request POST `/authenticate` (login with valid data and Follow Redirects) and an HTTP Request GET `/secure`.
4. Add a Response Assertion to the second request with the pattern "Welcome to the Secure Area". The page is shown only if the session cookie is sent with the request.
5. Run the plan with the Cookie Manager enabled and note the result. Disable the Cookie Manager and run the plan again.
6. Compare both results to understand that without the cookie the session is lost and the user is sent back to the login page.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 3 users / 3 seconds / 1 loop |
| **HTTP Cookie Manager**| State | Enabled in Run 1; Disabled in Run 2 |
| **HTTP Request 1** | Target / Method / Path | the-internet.herokuapp.com / POST / `/authenticate` |
| **HTTP Request 2** | Method / Path | GET / `/secure` |
| **Response Assertion**| Pattern (Contains) | `Welcome to the Secure Area` |

## 4. Test Plan Deliverables
- [Exercise58.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-58/Exercise58.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise58.jmx -l results/ex58.jtl
```

## 6. Expected Output
```
Run 1 (Cookie Manager enabled)
Label                # Samples   Error %
POST /authenticate           3     0.00%
GET /secure                  3     0.00%

Run 2 (Cookie Manager disabled)
Label                # Samples   Error %
POST /authenticate           3     0.00%
GET /secure                  3   100.00%   (assertion fails, login page returned)
```

## 7. Actual Execution Status
- Session cookie persistence and verification plan created and verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to test session management and cookie handling using the HTTP Cookie Manager and the results were verified.
