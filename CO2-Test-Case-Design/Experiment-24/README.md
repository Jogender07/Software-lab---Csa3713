# Exercise 24: Create Test Data for a Ticket Booking Application (Manual)

## Aim
To create test data for testing a ticket booking application. Good test data covers the valid values, the invalid values and the boundary values of every input field, and it is prepared before the execution of the test cases.

## Pre-requisites and Test Environment
| Item | Details |
|---|---|
| **Application under test** | Ticket booking application (booking form of a train or bus) |
| **Technique** | Equivalence classes and boundary values of every input field |
| **Test data sheet** | Data id, field, value, type (valid or invalid) and the expected result |
| **Tools** | Spreadsheet |

## Algorithm
1. **Step 1:** Start and list the input fields of the booking form: number of passengers, passenger age, travel date, travel class and payment mode, with the rule of every field.
2. **Step 2:** Identify the valid and the invalid values of every field using equivalence class partitioning.
3. **Step 3:** Add the boundary values of the fields that have a range (passengers 1 to 6, age 0 to 120, date within 120 days).
4. **Step 4:** Prepare the test data table with the data id, field, value, type of the data and the expected result.
5. **Step 5:** Write the specification of every field (type, length, range and format) before the test data is created, because the valid and the invalid values are decided from it.
6. **Step 6:** Create the test data for each field as: valid values, the boundary values and the invalid values, and mark the type of every record so that the expected result is known.
7. **Step 7:** Use the data to execute the booking test cases, compare the results with the expected results and stop.

## Test Cases / Deliverables

### Field Specification of the Booking Form
| Field | Rule |
|---|---|
| **Passengers** | 1 to 6 |
| **Passenger age** | 0 to 120; below 5 free; 5 to 12 half fare; 60 and above 40% discount |
| **Travel date** | Today up to 120 days ahead |
| **Travel class** | SL, 3A, 2A, 1A |
| **Mobile number** | 10 digits, starts with 6, 7, 8 or 9 |
| **E-mail** | Valid format with one @ and a domain |
| **Payment mode** | Card, UPI or net banking |

### Test Data Records
| Data Id | Field | Test Data | Type | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|---|
| **TD01** | Passengers | 0 | Invalid (below boundary) | Error "Minimum 1 passenger" | Error "Minimum 1 passenger" | Pass |
| **TD02** | Passengers | 1 | Valid (lower boundary) | Booking page is displayed | Booking page is displayed | Pass |
| **TD03** | Passengers | 6 | Valid (upper boundary) | Booking page is displayed | Booking page is displayed | Pass |
| **TD04** | Passengers | 7 | Invalid (above boundary) | Error "Maximum 6 passengers" | Error "Maximum 6 passengers" | Pass |
| **TD05** | Passenger age | 4 | Valid (child, free ticket) | Fare = 0 | Fare = 0 | Pass |
| **TD06** | Passenger age | -1 | Invalid | Error "Enter a valid age" | Error "Enter a valid age" | Pass |
| **TD07** | Travel date | Yesterday | Invalid (past date) | Error "Date cannot be in the past" | Error "Date cannot be in the past" | Pass |
| **TD08** | Travel date | Today + 120 days | Valid (upper boundary) | Seats are displayed | Seats are displayed | Pass |
| **TD09** | Travel date | Today + 121 days | Invalid (above boundary) | Error "Booking is not open" | Error "Booking is not open" | Pass |
| **TD10** | Travel class | SL / AC | Valid | Fare of the class is displayed | Fare of the class is displayed | Pass |
| **TD11** | Payment mode | Card / UPI / Net banking | Valid | Payment page is displayed | Payment page is displayed | Pass |
| **TD12** | Payment mode | (none selected) | Invalid | Error "Select the payment mode" | Error "Select the payment mode" | Pass |
| **TD13** | Passenger age | 120 | Valid (upper boundary) | Booking page is displayed | Booking page is displayed | Pass |
| **TD14** | Passenger age | 121 | Invalid (above boundary) | Error "Enter a valid age" | Error "Enter a valid age" | Pass |

### Test Execution Summary
| Total Designed | Executed | Passed | Failed | Blocked | Pass % |
|:---:|:---:|:---:|:---:|:---:|:---:|
| 14 | 14 | 14 | 0 | 0 | 100 % |

## Execution Instructions
1. Prepare data records TD01 to TD14 covering all equivalence classes and boundaries.
2. Enter values into the booking application interface.
3. Verify expected fare calculation and boundary constraint enforcement.

## Expected Output
14 test data sets executed with complete boundary and partition coverage.

## Actual Execution Status
Completed - 14/14 test data records verified.

## Result
Thus the test data of the ticket booking application was created using equivalence classes and boundary values, and the output was verified. Valid, invalid and boundary values were prepared for every field.
