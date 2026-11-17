# Experiment 80: Test Plan Parameterization Using JMeter Properties

## 1. Aim
To use Apache JMeter to parameterise a test plan using properties and run it for different environments.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Replace the fixed values of the Thread Group by the function `${__P(name,default)}`: Number of Threads = `${__P(users,5)}`, Ramp-up = `${__P(rampup,5)}` and Loop Count = `${__P(loops,2)}`.
3. Replace the server name of the HTTP Request by `${__P(host,the-internet.herokuapp.com)}` so that the same plan can be used for test and staging environments.
4. Add GET / as the HTTP Request and add Summary Report. Save the plan as Exercise80.jmx.
5. Run the plan in non-GUI mode with the default values and then run it again by giving new values using the option `-J`.
6. Verify that the number of samples changes with the property values.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Dynamic Expression | Default Value |
|---|---|---|---|
| **Thread Group** | Number of Threads | `${__P(users,5)}` | 5 |
| **Thread Group** | Ramp-up Period | `${__P(rampup,5)}` | 5 |
| **Thread Group** | Loop Count | `${__P(loops,2)}` | 2 |
| **HTTP Defaults** | Server Domain | `${__P(host,the-internet.herokuapp.com)}` | the-internet.herokuapp.com |

## 4. Test Plan Deliverables
- [Exercise80.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-80/Exercise80.jmx)

## 5. Execution Instructions
Run 1 (Default properties: 5 users x 2 loops = 10 samples):
```powershell
jmeter -n -t jmeter-plans/Exercise80.jmx -l results/run1.jtl
```

Run 2 (Overridden properties via -J: 3 users x 2 loops = 6 samples):
```powershell
jmeter -n -t jmeter-plans/Exercise80.jmx -l results/run2.jtl -Jusers=3 -Jrampup=3 -Jloops=2
```

## 6. Expected Output
```
run1 : summary = 10 in 00:00:02 ... Err: 0 (0.00%)
run2 : summary =  6 in 00:00:02 ... Err: 0 (0.00%)
```

## 7. Actual Execution Status
- Parameterized dynamic properties plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to parameterise a test plan using properties and run it for different environments and the results were verified.
