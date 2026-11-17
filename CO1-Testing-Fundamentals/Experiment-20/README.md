# Exercise 20: Compare the Summary Report and Aggregate Report Listeners in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to compare the Summary Report and Aggregate Report listeners.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Set Number of Threads = 10, Ramp-up period = 10 seconds and Loop Count = 1.
3. **Step 3:** Add two HTTP Request samplers: `GET /` (returns 200) and `GET /status_codes/404` (returns 404, which JMeter counts as an error).
4. **Step 4:** Add the listeners Summary Report, Aggregate Report and Graph Results to the Thread Group.
5. **Step 5:** Run the plan and compare the columns of the two reports: Average, Median, 90% Line, 95% Line, 99% Line, Min, Max, Error % and Throughput.
6. **Step 6:** Note down the metric that is available only in the Aggregate Report (the percentile lines) and the use of every listener.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Number of Threads (users) | 10 |
| | Ramp-up period (seconds) | 10 |
| | Loop Count | 1 |
| **HTTP Request 1** | Name / Server / Method / Path | Home / the-internet.herokuapp.com / GET / / |
| **HTTP Request 2** | Name / Server / Method / Path | Status 404 / the-internet.herokuapp.com / GET / /status_codes/404 |
| **Listeners** | Added | Summary Report, Aggregate Report |

## Execution Instructions
```bash
jmeter -n -t Exercise20.jmx -l results_ex20.jtl
```

## Expected Output
```
Aggregate Report
Label        # Samples   Average   Median   90% Line   95% Line   99% Line   Error %
Home                10      <ms>     <ms>       <ms>       <ms>       <ms>     0.00%
Status 404          10      <ms>     <ms>       <ms>       <ms>       <ms>   100.00%
TOTAL               20      <ms>     <ms>       <ms>       <ms>       <ms>    50.00%
```

## Key Takeaway
The **Aggregate Report** provides percentiles (90%, 95%, 99% Line) which are critical for SLA verification and identifying tail latencies, whereas the **Summary Report** provides standard deviation with lower memory overhead.

## Actual Execution Status
Configured with status 200 and 404 requests to verify error tracking and percentile reporting.

## Result
Thus Apache JMeter was used to compare the Summary Report and Aggregate Report listeners and the results were verified.
