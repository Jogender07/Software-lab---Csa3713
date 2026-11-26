# Exercise 16: Create a Basic Test Plan using Thread Group, HTTP Request Sampler and Listeners in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to execute a basic test plan using Thread Group, HTTP Request sampler and listeners.

## Pre-requisites and Test Environment
- Apache JMeter 5.x installed
- Java Runtime Environment 8 or higher
- Target host: `the-internet.herokuapp.com`

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Set Number of Threads = 5, Ramp-up period = 5 seconds and Loop Count = 2 in the Thread Group.
3. **Step 3:** Right click Thread Group, select Add > Sampler > HTTP Request and enter the protocol, server name, method and path of the home page.
4. **Step 4:** Right click Thread Group, select Add > Listener and add View Results Tree and Summary Report.
5. **Step 5:** Save the plan as `Exercise16.jmx` and click the Start button (green arrow).
6. **Step 6:** Observe the results in the listeners and verify that the number of samples = users x loops = 10.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Number of Threads (users) | 5 |
| | Ramp-up period (seconds) | 5 |
| | Loop Count | 2 |
| **HTTP Request (Home Page)** | Protocol | https |
| | Server Name | the-internet.herokuapp.com |
| | Method | GET |
| | Path | / |
| **Listeners** | Added | View Results Tree, Summary Report |

## Execution Instructions
```bash
# Non-GUI execution
jmeter -n -t Exercise16.jmx -l results_ex16.jtl
# View report in GUI mode
jmeter -t Exercise16.jmx
```

## Expected Output
```
Summary Report
Label        # Samples   Average   Min   Max   Std. Dev.   Error %   Throughput
Home Page           10      <ms>  <ms>  <ms>        <ms>     0.00%      <n>/sec
TOTAL               10      <ms>  <ms>  <ms>        <ms>     0.00%      <n>/sec

View Results Tree: all 10 samplers are green, Response code: 200, Response message: OK
```

## Actual Execution Status
Configured in `Exercise16.jmx` with 5 concurrent threads, loop count 2 (total 10 samples) and dual listeners.

## Result
Thus Apache JMeter was used to execute a basic test plan using Thread Group, HTTP Request sampler and listeners and the results were verified.
