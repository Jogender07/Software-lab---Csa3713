# Exercise 39: Control the Flow of a Test Plan using Loop, Once Only and If Controllers in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to control the flow of a test plan using the Loop, Once Only and If controllers.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Add Config Element > User Defined Variables with the variable `run = yes`. Set Number of Threads = 1 and Loop Count = 2 in the Thread Group.
3. **Step 3:** Add Logic Controller > Once Only Controller with the HTTP Request `GET /login` inside it. It runs only in the first iteration.
4. **Step 4:** Add Logic Controller > Loop Controller (Loop Count = 3) with the HTTP Request `GET /checkboxes` inside it.
5. **Step 5:** Add Logic Controller > If Controller with the condition `${__jexl3("${run}" == "yes")}` (select Interpret Condition as Variable Expression) and the HTTP Request `GET /dropdown` inside it.
6. **Step 6:** Add Summary Report and run the plan. Change run to no and run again to see that the If Controller skips its request.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **User Defined Variables** | run | yes |
| **Thread Group** | Threads / Ramp / Loops | 1 / 1s / 2 |
| **Once Only Controller** | Child | HTTP Request GET /login |
| **Loop Controller** | Loop Count / Child | 3 / HTTP Request GET /checkboxes |
| **If Controller** | Condition / Child | `${__jexl3("${run}" == "yes")}` / HTTP Request GET /dropdown |

## Execution Instructions
```bash
jmeter -n -t Exercise39.jmx -l results_ex39.jtl
```

## Expected Output
```
Summary Report (run = yes)
Label      # Samples
/login             1      (Once Only Controller)
/checkboxes        6      (3 per iteration x 2 iterations)
/dropdown          2      (1 per iteration x 2 iterations)
TOTAL              9

With run = no the /dropdown request is skipped and the total becomes 7.
```

## Actual Execution Status
Configured in `Exercise39.jmx` validating conditional routing and iteration control.

## Result
Thus Apache JMeter was used to control the flow of a test plan using the Loop, Once Only and If controllers and the results were verified.
