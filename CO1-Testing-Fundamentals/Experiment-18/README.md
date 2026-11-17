# Exercise 18: Configure HTTP Request Defaults and HTTP Header Manager for REST API Requests in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to configure HTTP Request Defaults and HTTP Header Manager for REST API requests.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Set Number of Threads = 2, Ramp-up period = 2 seconds and Loop Count = 1.
3. **Step 3:** Add Config Element > HTTP Request Defaults and enter the protocol and the server name once for the whole plan.
4. **Step 4:** Add Config Element > HTTP Header Manager and add the headers `Content-Type` and `Accept` as `application/json`.
5. **Step 5:** Add two HTTP Request samplers (`GET /posts/1` and `GET /users/1`) and leave the server name empty because it is taken from the defaults.
6. **Step 6:** Add View Results Tree and Summary Report, run the plan and verify the JSON response of both requests.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Users / Ramp-up / Loops | 2 / 2s / 1 |
| **HTTP Request Defaults** | Protocol / Server Name | https / jsonplaceholder.typicode.com |
| **HTTP Header Manager** | Content-Type / Accept | application/json / application/json |
| **HTTP Request 1** | Method / Path | GET /posts/1 |
| **HTTP Request 2** | Method / Path | GET /users/1 |

## Execution Instructions
```bash
jmeter -n -t Exercise18.jmx -l results_ex18.jtl
```

## Expected Output
```
Summary Report
Label          # Samples   Error %
GET /posts/1           2     0.00%
GET /users/1           2     0.00%
TOTAL                  4     0.00%

View Results Tree (GET /users/1) : Response code 200, the response body is a JSON object
containing "id": 1 and "name": "Leanne Graham".
```

## Actual Execution Status
Configured with centralized HTTP Defaults and JSON Headers targeting JSONPlaceholder REST API.

## Result
Thus Apache JMeter was used to configure HTTP Request Defaults and HTTP Header Manager for REST API requests and the results were verified.
