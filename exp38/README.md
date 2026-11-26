# Exercise 38: Correlate Dynamic Values using the JSON Extractor in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to correlate dynamic values using the JSON Extractor.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1.
3. **Step 3:** Add an HTTP Request `GET /uuid` that returns a new random id in the JSON response.
4. **Step 4:** Right click the sampler, select Add > Post Processors > JSON Extractor and extract the value using the JSON path `$.uuid` into the variable `uid`.
5. **Step 5:** Add a second HTTP Request `GET /anything/${uid}` that uses the extracted value in its path, and add a Response Assertion with the pattern `${uid}`.
6. **Step 6:** Add View Results Tree, run the plan and verify that the id returned by the first request is used in the path of the second request.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Users / Ramp-up / Loops | 3 / 3s / 1 |
| **HTTP Request 1** | Server / Path | httpbin.org / GET /uuid |
| **JSON Extractor** | Var Name / Path / Match / Default | uid / $.uuid / 1 / NOT_FOUND |
| **HTTP Request 2** | Path | GET /anything/${uid} |
| **Response Assertion** | Pattern (Contains) | ${uid} |

## Execution Instructions
```bash
jmeter -n -t Exercise38.jmx -l results_ex38.jtl
```

## Expected Output
```
View Results Tree
Request 1 : GET https://httpbin.org/uuid                 -> {"uuid": "<random-id>"}
Request 2 : GET https://httpbin.org/anything/<random-id> -> Response code 200
Response Assertion : passed (the response contains the extracted id)

Summary Report : # Samples = 6, Error % = 0.00%
```

## Actual Execution Status
Configured correlation extracting dynamic `$.uuid` and validating downstream in `/anything/${uid}`.

## Result
Thus Apache JMeter was used to correlate dynamic values using the JSON Extractor and the results were verified.
