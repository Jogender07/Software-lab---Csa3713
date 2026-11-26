# Exercise 21: Create Test Cases for a Simple Calculator Application using Equivalence Class Partitioning (Manual)

## Aim
To create test cases for a simple calculator application using equivalence class partitioning. Equivalence class partitioning divides the input data into classes in which all the values are expected to behave in the same way, so a small number of test cases gives a good coverage.

## Pre-requisites and Test Environment
| Item | Details |
|---|---|
| **Application under test** | Simple calculator (add, subtract, multiply, divide) with two integer inputs |
| **Valid input range** | -9999 to 9999 for both numbers |
| **Technique** | Equivalence class partitioning: one representative value of every class |
| **Tools** | Test case sheet (spreadsheet) |

## Algorithm
1. **Step 1:** Start and list the inputs of the calculator: the first number, the second number and the operation (+, -, *, /).
2. **Step 2:** Divide every input into valid and invalid equivalence classes, for example positive, negative and zero numbers as valid classes and non-numeric, blank and unsupported operation as invalid classes.
3. **Step 3:** Select one representative value from every class so that every class is tested at least once.
4. **Step 4:** Prepare the test case table with the test case id, the class, the input data and the expected result.
5. **Step 5:** Prepare the table of the input conditions and divide each condition into the valid and the invalid classes before the test cases are written.
6. **Step 6:** Number the classes (V1, V2 ... for valid and I1, I2 ... for invalid) and make sure that every class is covered by at least one test case. Combine the valid classes of different inputs into one test case, but test every invalid class separately.
7. **Step 7:** Execute the test cases on the calculator, compare the actual result with the expected result, record the status and stop.

## Test Cases / Deliverables

### Input Conditions and Equivalence Classes
| Input Condition | Valid Classes | Invalid Classes |
|---|---|---|
| **First and second number** | V1: positive integer; V2: negative integer; V3: zero | I1: non-numeric; I2: blank; I3: above 9999; I4: below -9999; I5: decimal number |
| **Operation** | V4: +, -, *, / | I6: no operation selected |
| **Divisor (for /)** | V5: non-zero number | I7: zero |

### Test Cases
| TC ID | Equivalence Class | Input (A, B, operation) | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|
| **TC01** | Valid : both numbers positive | 5, 3, + | 8 | 8 | Pass |
| **TC02** | Valid : both numbers negative | -5, -3, + | -8 | -8 | Pass |
| **TC03** | Valid : one positive and one negative | 5, -3, + | 2 | 2 | Pass |
| **TC04** | Valid : zero | 0, 0, + | 0 | 0 | Pass |
| **TC05** | Valid : division by a non-zero number | 20, 5, / | 4 | 4 | Pass |
| **TC06** | Invalid : division by zero | 20, 0, / | Error message "Cannot divide by zero" | Error message "Cannot divide by zero" | Pass |
| **TC07** | Invalid : non-numeric input | abc, 5, + | Error message "Enter a valid number" | Error message "Enter a valid number" | Pass |
| **TC08** | Invalid : empty input (blank) | (blank), 5, + | Error message "Enter a valid number" | Error message "Enter a valid number" | Pass |
| **TC09** | Valid : decimal numbers | 2.5, 1.5, * | 3.75 | 3.75 | Pass |
| **TC10** | Valid : result is a negative number | 3, 5, - | -2 | -2 | Pass |
| **TC11** | Invalid : unsupported operation | 5, 3, % | Error message "Invalid operation" | Error message "Invalid operation" | Pass |

### Test Execution Summary
| Total Designed | Executed | Passed | Failed | Blocked | Pass % |
|:---:|:---:|:---:|:---:|:---:|:---:|
| 11 | 11 | 11 | 0 | 0 | 100 % |

## Execution Instructions
1. Open calculator test suite.
2. Provide test values corresponding to TC01 - TC11.
3. Compare actual outputs against arithmetic specifications.
4. Log results in test execution summary.

## Expected Output
11 executed test cases with 100% pass rate covering all partition classes.

## Actual Execution Status
Completed - 11/11 test cases executed and passed.

## Result
Thus the test cases of the calculator application were created using equivalence class partitioning and the output was verified. One value from every valid and invalid class was tested, so every class is covered at least once.
