# Experiment 59: Multi-Step Ticket Booking Flow Using Transaction Controller

## 1. Aim
To use Apache JMeter to execute end-to-end testing of a ticket booking flow using the Transaction Controller.

## 2. Algorithm
1. Start Apache JMeter (`jmeter.bat` or `jmeter.sh`) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.
2. Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1. Add HTTP Request Defaults for the demo flight booking site and the HTTP Cookie Manager.
3. Add Logic Controller > Transaction Controller named `Book_Flight` and select *Generate parent sample*.
4. Add three HTTP Requests inside the controller: the home page (GET), the flight search (POST /reserve.php) and the flight selection (POST /purchase.php) with their parameters.
5. Add Response Assertions: "Welcome to the Simple Travel Agency!", "Choose This Flight" and "Purchase Flight" for the three requests.
6. Add Summary Report, run the plan and verify that the whole booking flow is reported as one transaction.
7. Stop.

## 3. Test Plan Configuration
| Element | Property | Value |
|---|---|---|
| **Thread Group** | Threads / Ramp-Up / Loops | 3 users / 3 seconds / 1 loop |
| **HTTP Defaults** | Protocol / Server | https / blazedemo.com |
| **Transaction Controller**| Name / Generate Parent Sample | `Book_Flight` / Selected |
| **HTTP Request 1** | Method / Path | GET / `/index.php` |
| **HTTP Request 2** | Method / Path | POST / `/reserve.php` (Paris -> Buenos Aires) |
| **HTTP Request 3** | Method / Path | POST / `/purchase.php` (Flight 43, $472.56) |
| **Response Assertions**| Assertions | Matches respective page text patterns |

## 4. Test Plan Deliverables
- [Exercise59.jmx](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-59/Exercise59.jmx)

## 5. Execution Instructions
Run via JMeter CLI:
```powershell
jmeter -n -t jmeter-plans/Exercise59.jmx -l results/ex59.jtl
```

## 6. Expected Output
```
Summary Report
Label         # Samples   Error %
Book_Flight           3     0.00%
TOTAL                 3     0.00%
(Only parent transaction is shown because Generate parent sample is selected.)
```

## 7. Actual Execution Status
- Valid multi-step Transaction Controller test plan verified.
- Status: **VERIFIED**.

## 8. Result
Thus Apache JMeter was used to execute end-to-end testing of a ticket booking flow using the Transaction Controller and the results were verified.
