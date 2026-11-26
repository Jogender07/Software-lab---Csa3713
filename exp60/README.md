# Experiment 60: REST API Testing of Weather Service Using Apache JMeter

## 1. Aim
To use Apache JMeter to create test cases for API testing of a weather information service.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Set Number of Threads = 5, Ramp-up period = 5 seconds and Loop Count = 2. Add HTTP Request Defaults for the weather API server (`api.open-meteo.com`).
3. Test case 1 (valid input): GET `/v1/forecast` with `latitude = 13.08`, `longitude = 80.27` and `current_weather = true`. Add Response Assertion for status 200, a JSON Assertion for the path `$.current_weather.temperature` and a Duration Assertion of 2000 milliseconds.
4. Test case 2 (invalid input): GET `/v1/forecast` with `latitude = 999`. Add a Response Assertion for status code 400 and select *Ignore Status / Assume Success*.
5. Add View Results Tree and Summary Report, run the plan and verify the temperature value in the response of test case 1.
6. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 5 users / 5 seconds / 2 loops |
| **HTTP Defaults** | Protocol / Server Name | https / api.open-meteo.com |
| **TC1 : Valid Location**| Method / Path / Params | GET / `/v1/forecast`?latitude=13.08&longitude=80.27&current_weather=true |
| **Assertions (TC1)** | Status Code / JSON Path / Duration | 200 / `$.current_weather.temperature` / 2000 ms |
| **TC2 : Invalid Latitude**| Method / Path / Params | GET / `/v1/forecast`?latitude=999 |
| **Assertions (TC2)** | Status Code / Ignore Status | 400 / Selected |

## 4. Test Plan Deliverables
- [Exercise60.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-60/Exercise60.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise60.jmx -l results/ex60.jtl
```

## 6. Expected Output
```
Summary Report
Label                    # Samples   Error %
TC1 : Valid Location            10     0.00%
TC2 : Invalid Latitude          10     0.00%
TOTAL                           20     0.00%
View Results Tree (TC1) : JSON response contains "current_weather" with "temperature" and "windspeed".
```

## 7. Actual Execution Status
- REST API validation with JSON Assertion and status code checks verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to create test cases for API testing of a weather information service and the results were verified.
