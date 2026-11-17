# Experiment 44: Acceptance Testing (UAT) for Hotel Reservation System

## 1. Aim
To execute acceptance testing for a hotel reservation system. Acceptance testing is done with the customer or the user to decide whether the system satisfies the acceptance criteria and can be accepted.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **System under test** | Hotel reservation system (search, booking, payment, cancellation and billing) |
| **Users** | Hotel manager, receptionist and two guests as the acceptance testers |
| **Environment** | User acceptance environment that is a copy of the production setup |
| **Basis** | Acceptance criteria agreed with the customer for every requirement |

## 3. Algorithm
1. Start and take the requirements of the customer and write the acceptance criteria of every requirement.
2. Prepare the acceptance test cases. The alpha test is executed by internal users at the developer's site and beta test by real users in their own environment.
3. Execute the acceptance test cases with the user in the user acceptance environment.
4. Record Accept or Reject for every criterion with the comments of the user.
5. Agree the acceptance criteria and the pass rule (all High priority criteria accepted) with the customer before execution.
6. Let the users execute tests with their own operational data while the tester observes and records comments, and collect sign-off at the end.
7. Take the decision about the acceptance of the system, get the sign-off of the customer and stop.

## 4. Test Documentation & Execution Results

### Acceptance Types Defined
| Type | Performed By | Place | Purpose |
|---|---|---|---|
| **Alpha Test** | Internal users / QA not in dev team | Developer's site | Find defects before external customer release |
| **Beta Test** | Selected real hotel staff and guests | Hotel's real operational site | Confirm fitness for real-world day-to-day use |
| **User Acceptance Test (UAT)** | Hotel management & customer representatives | Dedicated acceptance staging | Final business sign-off for production rollout |

### User Acceptance Test Cases
| AC ID | Requirement | Acceptance Test Action | Expected Result | Actual Result | Accept / Reject |
|---|---|---|---|---|---|
| **AC01** | Search available rooms | Search by check-in date, check-out date & guests | Available rooms and real-time rates displayed | Available rooms and rates shown | **Accept** |
| **AC02** | Book a room | Select room and submit guest particulars | Booking confirmed with unique booking reference | Booking reference generated | **Accept** |
| **AC03** | Online payment | Pay booking advance using corporate card | Instant payment receipt displayed | Payment receipt generated | **Accept** |
| **AC04** | Booking confirmation | Complete reservation | Confirmation email received within 5 minutes | Confirmation email received in 2m | **Accept** |
| **AC05** | Modify booking | Change check-out date for active booking | Recalculated tariff and revised dates displayed | Tariff updated accurately | **Accept** |
| **AC06** | Cancel booking | Cancel booking before deadline | Booking cancelled; refund policy acknowledged | Booking cancelled; refund shown | **Accept** |
| **AC07** | Reception view | Receptionist opens today's arrival roster | Chronological guest check-in list displayed | Arrivals roster displayed | **Accept** |
| **AC08** | Generate bill | Check out guest and print tax invoice | Invoice with room charges, GST, and extras printed | Itemized tax invoice generated | **Accept** |
| **AC09** | Guest feedback | Submit stay rating & review upon check-out | Feedback persisted to guest profile | Feedback recorded successfully | **Accept** |
| **AC10** | Role-based security | Receptionist attempts to access management P&L | Access denied; privilege error displayed | Access denied error shown | **Accept** |

### User Acceptance Sign-Off
| Item | Details |
|---|---|
| **Decision** | **ACCEPTED** (All 10 acceptance criteria successfully satisfied) |
| **Stakeholder Comments** | All core operational flows are intuitive and fast. Suggestion for v2: show refund calculation breakdown directly on cancellation modal. |
| **Customer Representative** | Hotel General Manager, Sign-off recorded on 15 Nov 2026 |

## 5. Result
Thus the acceptance testing of the hotel reservation system was executed against the customer acceptance criteria and the output was verified. The system was accepted for production deployment.
