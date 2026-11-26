# Exercise 19: Simulate User Think Time using the Constant Timer in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to simulate user think time using the Constant Timer.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Set Number of Threads = 5, Ramp-up period = 5 seconds and Loop Count = 3.
3. **Step 3:** Add an HTTP Request sampler for the home page (`GET /`).
4. **Step 4:** Right click the sampler, select Add > Timer > Constant Timer and set Thread Delay = 2000 milliseconds. The timer pauses every user for 2 seconds before the request.
5. **Step 5:** Add the Summary Report listener and run the plan once with the timer enabled. Disable the timer (right click > Disable) and run the plan again.
6. **Step 6:** Compare the throughput of both runs: the throughput is lower when the think time is used because the users behave like real users.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Number of Threads (users) | 5 |
| | Ramp-up period (seconds) | 5 |
| | Loop Count | 3 |
| **HTTP Request (Home Page)** | Protocol / Server Name | https / the-internet.herokuapp.com |
| | Method / Path | GET / |
| **Constant Timer** | Thread Delay (milliseconds) | 2000 |

## Execution Instructions
```bash
jmeter -n -t Exercise19.jmx -l results_ex19.jtl
```

## Expected Output
```
Summary Report (timer enabled)
Label       # Samples   Error %   Throughput
Home Page          15     0.00%   <lower value>/sec

Summary Report (timer disabled)
Label       # Samples   Error %   Throughput
Home Page          15     0.00%   <higher value>/sec
```

## Actual Execution Status
Configured with 2000ms Constant Timer demonstrating think time impact on realistic user pacing and throughput.

## Result
Thus Apache JMeter was used to simulate user think time using the Constant Timer and the results were verified.
