# Exercise 17: Detect Defects in a Web Page Response using the Response Assertion in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to detect defects in a web page response using the Response Assertion.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1.
3. **Step 3:** Add two HTTP Request samplers for the path `/login`: the first named "Login Page - correct text" and the second named "Login Page - wrong text".
4. **Step 4:** Add a Response Assertion to the first sampler: Field to Test = Text Response, Pattern Matching Rule = Contains, Pattern = Login Page.
5. **Step 5:** Add a Response Assertion to the second sampler with the pattern `Dashboard` (this text is not in the page, so it represents a defect).
6. **Step 6:** Add the listeners Assertion Results and Summary Report, run the plan and observe that the second sampler fails in every iteration.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Number of Threads (users) | 3 |
| | Ramp-up period (seconds) | 3 |
| | Loop Count | 1 |
| **HTTP Request 1** | Name | Login Page - correct text |
| | Server / Method / Path | the-internet.herokuapp.com / GET / /login |
| **Response Assertion 1** | Field / Rule / Pattern | Text Response / Contains / Login Page |
| **HTTP Request 2** | Name | Login Page - wrong text |
| | Server / Method / Path | the-internet.herokuapp.com / GET / /login |
| **Response Assertion 2** | Field / Rule / Pattern | Text Response / Contains / Dashboard |

## Execution Instructions
```bash
jmeter -n -t Exercise17.jmx -l results_ex17.jtl
```

## Expected Output
```
Assertion Results
Login Page - correct text   : no failure message (assertion passed)
Login Page - wrong text     : Test failed: text expected to contain /Dashboard/

Summary Report
Label                       # Samples   Error %
Login Page - correct text           3     0.00%
Login Page - wrong text             3   100.00%
TOTAL                               6    50.00%
```

## Actual Execution Status
Configured with intentional assertion failure to demonstrate automated defect detection in HTTP responses.

## Result
Thus Apache JMeter was used to detect defects in a web page response using the Response Assertion and the results were verified.
