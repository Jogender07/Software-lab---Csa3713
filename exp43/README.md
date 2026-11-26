# Experiment 43: System Testing for E-Commerce Checkout System

## 1. Aim
To execute system testing for an e-commerce checkout process. System testing checks the complete integrated system against the specified requirements to confirm that all components work together from end to end.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **System under test** | E-commerce shopping web application (Cart, Checkout, Payment, Inventory, Notifications) |
| **Integrations** | Payment Gateway simulator, Shipping API, SMS/Email service |
| **Scope** | End-to-end user checkout journey across normal, alternate, and failure paths |

## 3. Algorithm
1. Start and review the system requirements specification (SRS) for the complete e-commerce checkout process.
2. Identify all end-to-end workflows including customer cart management, shipping selection, discount coupon application, payment gateway integration, and order confirmation.
3. Design test scenarios covering:
   - Happy path (standard order placement)
   - Alternate paths (coupon application, multi-address selection)
   - Error & boundary conditions (expired cards, gateway timeout, session expiry)
4. Execute test scenarios in the integrated staging environment.
5. Verify cross-system integrity: stock deduction in inventory DB, payment capture in gateway, and email delivery via SMTP.
6. Summarize test results, verify exit criteria, and stop.

## 4. Test Documentation & Execution Results

### System Test Scenarios
| TC ID | Scenario | Test Steps | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|
| **CK01** | Standard Checkout | Add product -> proceed to checkout -> enter address -> pay by card | Order confirmed, invoice generated, stock deducted | Order confirmed with ID #84920 | **PASS** |
| **CK02** | Coupon Discount | Apply valid coupon code `SAVE20` at checkout | 20% discount subtracted from cart subtotal | 20% discount deducted accurately | **PASS** |
| **CK03** | Invalid Coupon | Apply expired coupon code `EXPIRED50` | Error "Coupon code expired" displayed; subtotal unchanged | Error message shown; price unchanged | **PASS** |
| **CK04** | Address Validation | Leave postal code blank on address form | Field-level validation error "Postal code required" | Validation warning triggered | **PASS** |
| **CK05** | Inventory Limit | Attempt to checkout with quantity > available stock | Notification "Only 3 items remaining in stock" | Warning shown; quantity capped | **PASS** |
| **CK06** | Payment Declined | Enter card with insufficient funds | Error "Transaction declined by bank"; order not placed | Declined error shown; cart retained | **PASS** |
| **CK07** | Payment Timeout | Simulate gateway non-response after 30s | System displays retry option without duplicate billing | Retry option shown; no double charge | **PASS** |
| **CK08** | Email Notification | Successfully complete checkout | Confirmation email received with itemized receipt | Email received within 30 seconds | **PASS** |
| **CK09** | Order Cancellation | Cancel unfulfilled order from user dashboard | Order status marked "Cancelled"; refund initiated | Status updated; refund logged | **PASS** |
| **CK10** | Session Timeout | Inactivity for 15 minutes on payment step | Session gracefully expired; cart restored upon re-login | Session expired; items retained | **PASS** |

### Test Execution Summary
| Total Designed | Executed | Passed | Failed | Blocked | Pass % |
|---|---|---|---|---|---|
| 10 | 10 | 10 | 0 | 0 | **100%** |

## 5. Result
Thus system testing of the e-commerce checkout system was executed across normal, alternate, and failure paths, confirming seamless end-to-end integration across cart, payment, inventory, and notification subsystems.
