# Exercise 36: Execute Black-Box Testing of a Login Request using the HTTP POST Sampler in JMeter (Apache JMeter)

## Aim
To use Apache JMeter to execute black-box testing of a login request using the HTTP POST sampler.

## Algorithm
1. **Step 1:** Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. **Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1. Add the HTTP Cookie Manager because the login uses a session.
3. **Step 3:** Add an HTTP Request sampler with the method POST for `/authenticate` and add the parameters username and password with valid values. Select Follow Redirects.
4. **Step 4:** Add a Response Assertion that checks the text "You logged into a secure area!".
5. **Step 5:** Add a second HTTP Request with a wrong password and a Response Assertion for the text "Your password is invalid!".
6. **Step 6:** Add View Results Tree and Summary Report, run the plan and verify that both the valid and the invalid inputs give the expected outputs.
7. **Step 7:** Stop.

## Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-up / Loops | 3 / 3s / 1 |
| **HTTP Cookie Manager** | Default Settings | Added to Thread Group |
| **HTTP Request 1 (Valid)** | Server / Method / Path | the-internet.herokuapp.com / POST / /authenticate |
| | Parameters | username=tomsmith, password=SuperSecretPassword! |
| | Response Assertion | "You logged into a secure area!" |
| **HTTP Request 2 (Invalid)** | Server / Method / Path | the-internet.herokuapp.com / POST / /authenticate |
| | Parameters | username=tomsmith, password=wrong123 |
| | Response Assertion | "Your password is invalid!" |

## Execution Instructions
```bash
jmeter -n -t Exercise36.jmx -l results_ex36.jtl
```

## Expected Output
```
Summary Report
Label               # Samples   Error %
Valid Login                 3     0.00%
Invalid Password            3     0.00%
TOTAL                       6     0.00%
```

## Actual Execution Status
Configured in `Exercise36.jmx` with cookie management and dual response assertions.

## Result
Thus Apache JMeter was used to execute black-box testing of a login request using the HTTP POST sampler and the results were verified.
