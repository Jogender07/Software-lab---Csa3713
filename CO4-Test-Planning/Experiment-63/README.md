# Experiment 63: Requirements Traceability Matrix (RTM) for Online Library System

## 1. Aim
To create a Requirements Traceability Matrix (RTM) for an online library system. An RTM maps every business requirement to its corresponding test cases to verify 100% test coverage and ensure no functional requirement is missed.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **System under test** | Online Library Management System (Catalog Search, Borrowing, Returns, Fines, Reservations) |
| **Input Documents** | Business Requirements Document (BRD) & System Requirement Specifications (SRS) |
| **Traceability Type** | Bidirectional (Forward: Requirement -> Test Case; Backward: Test Case -> Requirement) |

## 3. Algorithm
1. Start and analyze the system requirement specification (SRS) for the online library system.
2. Assign unique identifiers to all user and system requirements (REQ-01 to REQ-08).
3. Map each requirement to its functional design component and corresponding test cases.
4. Record test execution status and associated defect IDs for every test case.
5. Analyze test coverage to identify any gaps or untested requirements.
6. Verify forward and backward traceability across the matrix.
7. Stop.

## 4. Test Documentation & Requirements Traceability Matrix

### Master RTM Table
| Req ID | Requirement Description | Test Case ID | Test Case Description | Test Type | Status | Defect ID |
|---|---|---|---|---|---|---|
| **REQ-01** | Student user registration & authentication | TC-LIB-01 | Register with valid institutional email & verify activation | Functional | PASS | - |
| **REQ-01** | Student user registration & authentication | TC-LIB-02 | Attempt duplicate registration with same ID | Negative | PASS | - |
| **REQ-02** | Search books by Title, Author, ISBN | TC-LIB-03 | Search by partial title string "Software Testing" | Functional | PASS | - |
| **REQ-03** | Book checkout with borrowing limit (max 2) | TC-LIB-04 | Issue 2 books successfully to active member | Integration | PASS | - |
| **REQ-03** | Book checkout with borrowing limit (max 2) | TC-LIB-05 | Attempt to borrow 3rd book when limit reached | Boundary | PASS | - |
| **REQ-04** | Return book and update availability status | TC-LIB-06 | Return borrowed book; verify status switches to available | Functional | PASS | - |
| **REQ-05** | Calculate overdue fine ($1/day after 14 days) | TC-LIB-07 | Return book 5 days late; verify $5 fine generated | Calculation | PASS | - |
| **REQ-06** | Place hold/reservation on issued book | TC-LIB-08 | Reserve book currently issued; verify queue position | Functional | PASS | - |
| **REQ-07** | Automated overdue email reminder notifications | TC-LIB-09 | Trigger scheduled cron notification for due books | System | PASS | - |
| **REQ-08** | Admin dashboard reports generation | TC-LIB-10 | Export monthly circulation report to PDF/CSV | Reporting | PASS | - |

### Coverage Metrics
- Total Functional Requirements: 8
- Total Test Cases Designed: 10
- Requirements with 100% Test Coverage: 8 / 8 (100%)
- Overall Test Execution Pass Rate: 10 / 10 (100%)

## 5. Result
Thus the Requirements Traceability Matrix (RTM) for the online library system was created and verified, establishing complete bidirectional traceability between requirements and test cases without any coverage gaps.
