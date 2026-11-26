# Exercise 37: Implement Data-Driven Testing using CSV Data Set Config in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to implement data-driven testing using the CSV Data Set Config.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Create the file `users.csv` with three lines (user name, password and expected message) and save it in the bin folder of JMeter.
3. **Step 3:** Set Number of Threads = 1 and Loop Count = 3 so that every iteration reads one line of the file.
4. **Step 4:** Add Config Element > CSV Data Set Config. Enter the file name, the variable names `username,password,expected` and the delimiter comma. Set Recycle on EOF = False and Stop thread on EOF = True.
5. **Step 5:** Add the HTTP Cookie Manager (select Clear cookies each iteration) and an HTTP Request POST `/authenticate` with the parameters `${username}` and `${password}`.
6. **Step 6:** Add a Response Assertion with the pattern `${expected}`, add View Results Tree and Summary Report and run the plan.
7. **Step 7:** Stop.

## Test Data (`users.csv`)
```csv
tomsmith,SuperSecretPassword!,You logged into a secure area!
tomsmith,wrongpass,Your password is invalid!
baduser,SuperSecretPassword!,Your username is invalid!
```

## Execution Instructions
```bash
jmeter -n -t Exercise37.jmx -l results_ex37.jtl
```

## Expected Output
```
Summary Report
Label          # Samples   Error %
POST /authenticate     3     0.00%

View Results Tree: the three samples show the three data rows:
(tomsmith / SuperSecretPassword!, tomsmith / wrongpass, baduser / SuperSecretPassword!)
and every assertion passes.
```

## Actual Execution Status
Configured with CSV Data Set reading parameters and parameterized Response Assertion.

## Result
Thus Apache JMeter was used to implement data-driven testing using the CSV Data Set Config and the results were verified.
