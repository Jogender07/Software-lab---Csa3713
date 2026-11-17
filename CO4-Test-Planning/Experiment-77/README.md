# Experiment 77: REST API Testing with HTTP POST and JSON Payload

## 1. Aim
To use Apache JMeter to perform POST request testing with a JSON payload for valid and invalid endpoints.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1. Add HTTP Request Defaults and the HTTP Header Manager with Content-Type = application/json.
3. Add an HTTP Request POST /posts. Select Body Data and enter the JSON payload of the new record.
4. Add a Response Assertion for the response code 201 (created) and a JSON Assertion that checks that the path $.id exists.
5. Add an HTTP Request POST /invalid-endpoint with the same payload, a Response Assertion for the code 404 and select *Ignore Status*.
6. Add View Results Tree and Summary Report, run the plan and verify the behaviour of the service for valid and invalid endpoints.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 3 users / 3 seconds / 1 loop |
| **HTTP Defaults** | Protocol / Server Name | https / jsonplaceholder.typicode.com |
| **Header Manager** | Header | Content-Type: application/json |
| **Valid POST** | Method / Path / Payload | POST / `/posts` / `{"title":"CSA37", "body":"JMeter POST test", "userId":1}` |
| **Valid Assertions**| Assertions | Response code 201, JSON path `$.id` exists |
| **Invalid POST** | Method / Path / Payload | POST / `/invalid-endpoint` / same payload |
| **Invalid Assertion**| Assertions | Response code 404 (Ignore Status = true) |

## 4. Test Plan Deliverables
- [Exercise77.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-77/Exercise77.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise77.jmx -l results/ex77.jtl
```

## 6. Expected Output
```
Summary Report
Label                     # Samples   Error %
POST /posts (Valid)               3     0.00%
POST /invalid-endpoint            3     0.00%
TOTAL                             6     0.00%
View Results Tree: Response code 201 and response body contains "id": 101.
```

## 7. Actual Execution Status
- REST API POST payload validation plan created and verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to perform POST request testing with a JSON payload for valid and invalid endpoints and the results were verified.
