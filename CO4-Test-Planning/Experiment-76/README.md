# Experiment 76: Organizing Test Plans with Variables, Defaults, and Listeners

## 1. Aim
To use Apache JMeter to create and organise a test plan using variables, defaults and listeners and save it as a .jmx file.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Click the Test Plan, enter name and comments describing purpose, scope and author of the plan.
3. Add User Defined Variables (protocol and host) and HTTP Request Defaults that use these variables so that the environment can be changed at one place.
4. Set Number of Threads = 2, Ramp-up period = 2 seconds and Loop Count = 2 and add three HTTP Requests with meaningful names.
5. Add the listeners View Results Tree and Summary Report. Select File > Save Test Plan as and save the plan as ContentSite.jmx.
6. Run the plan and verify that the number of samples = 2 x 2 x 3 = 12.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Test Plan Name** | Content Site Test Plan |
| **User Defined Variables**| protocol / host | https / jsonplaceholder.typicode.com |
| **HTTP Defaults** | Protocol / Server | ${protocol} / ${host} |
| **Thread Group** | Threads / Ramp-Up / Loops | 2 users / 2 seconds / 2 loops |
| **HTTP Request 1** | Name / Method / Path | Get Posts / GET / `/posts` |
| **HTTP Request 2** | Name / Method / Path | Get Users / GET / `/users` |
| **HTTP Request 3** | Name / Method / Path | Get Comments / GET / `/comments?postId=1` |

## 4. Test Plan Deliverables
- [ContentSite.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-76/ContentSite.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise76.jmx -l results/ex76.jtl
```

## 6. Expected Output
```
Summary Report
Label           # Samples   Error %
Get Posts               4     0.00%
Get Users               4     0.00%
Get Comments            4     0.00%
TOTAL                  12     0.00%
```

## 7. Actual Execution Status
- Parameterized JMeter XML plan created and verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to create and organise a test plan using variables, defaults and listeners and save it as a .jmx file and the results were verified.
