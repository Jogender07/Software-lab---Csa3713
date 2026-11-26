# Exercise 23: Execute Black-Box Testing on a Login Module (Manual)

## Aim
To execute black-box testing on a login module. In black-box testing the tester checks the behaviour of the module against its specification, without any knowledge of the internal code or the structure.

## Pre-requisites and Test Environment
| Item | Details |
|---|---|
| **Module under test** | Login page: user name, password, Login button, Forgot password link |
| **Specification** | User name 6-20 letters or digits; password 8-16 characters with one capital letter, one digit and one special character; account locked after 3 wrong attempts |
| **Test account** | student / Secret@123 |
| **Technique** | Black-box testing: only the specification is used, not the code |

## Algorithm
1. **Step 1:** Start and study the specification of the login module without looking at its code: user name, password, login button, the error messages and the rules of the password.
2. **Step 2:** Design the test cases using the specification: valid data, invalid data, blank fields, special characters, case sensitivity and the lock of the account.
3. **Step 3:** Execute every test case on the login page with the test data of the table.
4. **Step 4:** Compare the actual result with the expected result and record the status as Pass or Fail.
5. **Step 5:** Prepare the decision table of the login rules and derive one test case for every rule, then add the test cases for the blank fields, the case sensitivity, the length limits, the special characters and the lock of the account.
6. **Step 6:** Reset the state of the account (unlock it) before every test case that depends on the number of the wrong attempts.
7. **Step 7:** Report the failed test cases as defects with the steps to reproduce them and stop.

## Test Cases / Deliverables

### Decision Table of the Login
| Condition / Action | R1 | R2 | R3 | R4 |
|---|:---:|:---:|:---:|:---:|
| **Valid user name** | Yes | Yes | No | No |
| **Valid password** | Yes | No | Yes | No |
| **Action** | Home page | Error message | Error message | Error message |

### Test Cases
| TC ID | Test Scenario | Test Data | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|
| **TC01** | Valid user name and password | student / Secret@123 | Home page is displayed | Home page is displayed | Pass |
| **TC02** | Valid user name, wrong password | student / wrong | Error "Invalid credentials" | Error "Invalid credentials" | Pass |
| **TC03** | Wrong user name, valid password | stud / Secret@123 | Error "Invalid credentials" | Error "Invalid credentials" | Pass |
| **TC04** | Both fields blank | (blank) / (blank) | Error "User name and password are required" | Error "User name and password are required" | Pass |
| **TC05** | User name blank | (blank) / Secret@123 | Error "User name is required" | Error "User name is required" | Pass |
| **TC06** | Password blank | student / (blank) | Error "Password is required" | Error "Password is required" | Pass |
| **TC07** | Password is case sensitive | student / secret@123 | Error "Invalid credentials" | Error "Invalid credentials" | Pass |
| **TC08** | SQL injection in the user name | ' OR '1'='1 / abc | Login is rejected | Login is rejected | Pass |
| **TC09** | Password is masked | Type any password | Characters are shown as dots | Characters are shown as dots | Pass |
| **TC10** | Account is locked after 3 wrong attempts | 3 times wrong password | Error "Account locked" | Error "Account locked" | Pass |
| **TC11** | Back button after the logout | Login, logout and press the Back button | Login page is displayed and session is not reused | Login page is displayed and session is not reused | Pass |
| **TC12** | Spaces before and after user name | " student " / Secret@123 | Login as per specification (trimmed) or error | Login accepted after spaces are trimmed | Pass |

### Test Execution Summary
| Total Designed | Executed | Passed | Failed | Blocked | Pass % |
|:---:|:---:|:---:|:---:|:---:|:---:|
| 12 | 12 | 12 | 0 | 0 | 100 % |

## Execution Instructions
1. Execute tests TC01 to TC12 against the login interface.
2. Confirm session management and security behavior.
3. Validate account lockout after 3 consecutive invalid attempts.

## Expected Output
All 12 black-box test scenarios executed with expected security and validation responses.

## Actual Execution Status
Completed - 12/12 test scenarios executed and verified.

## Result
Thus the black-box test cases of the login module were executed and the output was verified. Valid, invalid, blank and security inputs were tested against the specification.
