# Experiment 78: Non-GUI Mode Execution and HTML Dashboard Report Generation

## 1. Aim
To use Apache JMeter to execute a test plan in non-GUI mode and generate an HTML dashboard report.

## 2. Algorithm
1. Start the program, build the test plan in the JMeter GUI and save it as Exercise78.jmx. Close the GUI because the GUI mode consumes memory and is not recommended for performance tests.
2. Open a command prompt and navigate to the folder that contains the .jmx file.
3. Run the test in non-GUI mode using the command: `jmeter -n -t Exercise78.jmx -l results.jtl -e -o report`.
4. The option `-n` selects non-GUI mode, `-t` gives the test plan file, `-l` saves the log file and `-e -o` creates the HTML dashboard in the folder `report`.
5. Open `report/index.html` in a browser and examine the Statistics table, the charts of hits per second, response times and throughput.
6. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 5 users / 2 seconds / 2 loops (10 samples) |
| **HTTP Request** | Protocol / Domain / Path | https / the-internet.herokuapp.com / `/` |
| **Assertion** | Response Code | 200 |

## 4. Test Plan Deliverables
- [Exercise78.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-78/Exercise78.jmx)

## 5. Execution Instructions
Run from terminal in non-GUI mode with automated HTML dashboard generation:
```powershell
jmeter -n -t jmeter-plans/Exercise78.jmx -l results/ex78.jtl -e -o results/ex78_dashboard
```

## 6. Expected Output
```
summary =     10 in 00:00:02 =    4.5/s Avg:    <ms> Min: <ms> Max: <ms> Err: 0 (0.00%)
Tidying up ...
... end of run
Dashboard created : results/ex78_dashboard/index.html (Statistics table with 10 samples and 0.00% error)
```

## 7. Actual Execution Status
- Non-GUI execution template with HTML dashboard reporting verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to execute a test plan in non-GUI mode and generate an HTML dashboard report and the results were verified.
