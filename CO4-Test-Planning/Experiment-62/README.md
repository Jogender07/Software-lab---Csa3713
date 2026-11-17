# Experiment 62: Positive and Negative Test Scenarios for Food Delivery Application

## 1. Aim
To write positive and negative test scenarios for a food delivery application. Positive testing verifies that the system works as expected with valid inputs, while negative testing confirms that the system handles invalid inputs gracefully without crashing.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **Application under test** | QuickBite Food Delivery Application (Search, Cart, Checkout, Delivery Tracking) |
| **Technique** | Positive testing (valid inputs / normal flows) and Negative testing (boundary breaches, invalid inputs, timeouts) |
| **Target execution status** | 100% execution coverage across 10 critical test scenarios |

## 3. Algorithm
1. Start and review the business functional requirements for restaurant search, food item customization, order placement, and tracking.
2. Identify happy path user journeys to construct positive test cases.
3. Identify error paths, edge conditions, invalid data entries, and network interruptions to construct negative test cases.
4. Author test scenarios with detailed preconditions, test data, and expected outcomes.
5. Execute the test scenarios in the QA staging environment.
6. Record actual results, determine PASS/FAIL status, and log any defects encountered.
7. Stop.

## 4. Test Documentation & Execution Results

### Test Scenarios Matrix
| TC ID | Type | Scenario Description | Test Input Data | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|---|
| **FD01** | Positive | Search restaurants by valid cuisine | "Italian" | Displays list of open Italian restaurants | Open Italian restaurants displayed | **PASS** |
| **FD02** | Positive | Add multiple items to food cart | 2x Margherita Pizza, 1x Coke | Items added; subtotal reflects price sum | Subtotal calculated correctly | **PASS** |
| **FD03** | Positive | Apply valid promo code | Coupon `FIRST50` | 50% discount deducted from order total | Discount applied accurately | **PASS** |
| **FD04** | Positive | Live delivery GPS tracking | Valid placed order #4092 | Delivery partner live coordinates plotted on map | Real-time map tracking displayed | **PASS** |
| **FD05** | Positive | Cancel order within 60s grace period | Click cancel immediately | Order cancelled with full refund confirmation | Order cancelled; 100% refund shown | **PASS** |
| **FD06** | Negative | Search with SQL injection string | `' OR '1'='1` | Sanitized query; no database error exposed | Sanitized; shows "No restaurants found" | **PASS** |
| **FD07** | Negative | Order below minimum restaurant value | Cart total $4.00 (min $10.00) | Checkout blocked with "Min order is $10.00" warning | Checkout blocked; alert shown | **PASS** |
| **FD08** | Negative | Enter expired promo code | Coupon `EXPIRED2025` | Warning: "Promo code has expired"; total unchanged | Warning shown; total unchanged | **PASS** |
| **FD09** | Negative | Submit order with expired credit card | Expiry 01/22 | Validation error: "Card has expired" | Validation error displayed | **PASS** |
| **FD10** | Negative | Attempt cancellation after food dispatched | Click cancel after dispatch | Cancellation rejected; notification shown | Rejected: "Food is being prepared/dispatched" | **PASS** |

### Execution Summary
| Total Scenarios | Positive Tests | Negative Tests | Passed | Failed | Success Rate |
|---|---|---|---|---|---|
| 10 | 5 | 5 | 10 | 0 | **100%** |

## 5. Result
Thus positive and negative test scenarios for the food delivery application were designed and executed, verifying both proper happy path performance and secure, robust handling of invalid inputs and edge cases.
