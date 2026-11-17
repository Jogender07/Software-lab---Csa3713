# Experiment 61: Test Plan for Online Shopping Cart System (IEEE 829 Format)

## 1. Aim
To create a test plan for an online shopping cart system. A test plan is the document that describes the scope, the approach, the resources and the schedule of the testing activities of a project.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **Standard** | IEEE 829 test plan format |
| **Input documents** | Requirement specification and design document of Online Shopping Cart System v1.0 |
| **Team** | Test Lead, 3 QA Testers, 4 Developers, Project Manager |
| **Output** | Approved Master Test Plan document TP-CART-01 |

## 3. Algorithm
1. Start and study the requirements of the online shopping cart system and the project schedule.
2. Write the test plan identifier and the introduction. List the test items and the features to be tested and not to be tested.
3. Write the approach (types of testing), the pass / fail criteria and the suspension and resumption criteria.
4. Write the test deliverables, the testing tasks, the environment, the responsibilities, the schedule and the risks.
5. Estimate the effort of every testing task (design, execution and retest) from the number of test cases and the productivity of the team, and use it in the schedule.
6. Identify the risks (late build, unstable environment, change of requirement), give probability and impact, and write the mitigation action for each risk.
7. Review the plan with the team, obtain the approval and stop.

## 4. Test Documentation (IEEE 829 Format)

### Test Plan: TP-CART-01
| Section | Content |
|---|---|
| **Test Plan Identifier** | TP-CART-01 |
| **Introduction** | Master test plan describing QA activities for Online Shopping Cart System v1.0. |
| **Test Items** | Product catalogue, shopping cart, coupon discount engine, checkout, payment gateway interface. |
| **Features to be Tested** | Add item to cart, update quantity, remove item, apply coupon, dynamic subtotal calculation, shipping selection, payment processing. |
| **Features Not to be Tested** | Third-party payment gateway internal settlement logic, external SMTP email server internals. |
| **Approach** | Black-box manual functional testing, automated regression testing with Selenium WebDriver 4, performance load testing with JMeter, unit testing with JUnit 5. |
| **Item Pass / Fail Criteria** | **Pass**: Actual result matches expected behavior with no High/Critical defects. **Fail**: Any functional deviation or open Critical/High severity defect. |
| **Suspension Criteria** | Suspend if login module crashes or cart checkout page returns HTTP 500. |
| **Resumption Criteria** | Resume once developers supply hotfix build and smoke tests pass 100%. |
| **Test Deliverables** | Test Plan, Test Case Specifications, Daily Execution Logs, Defect Reports in JIRA, Final Test Summary Report. |
| **Testing Tasks** | Test environment provisioning, test data preparation, test case authoring, test execution, defect logging & re-testing, sign-off. |
| **Environment** | Windows 11 Enterprise, Chrome v122, Firefox v123, Staging test server (Java 17, PostgreSQL 15). |
| **Responsibilities** | Test Lead: planning & exit reporting. QA Testers: test authoring and execution. Developers: bug fixing. PM: milestone sign-off. |
| **Schedule** | Planning: 2 days. Design: 5 days. Execution Cycle 1: 7 days. Regression & Retest: 3 days. Closure: 1 day. |
| **Approvals** | Test Lead, Project Manager, Customer Acceptance Authority. |

### Risks and Mitigation
| Risk Description | Probability | Impact | Mitigation Strategy |
|---|---|---|---|
| Late delivery of build | Medium | High | Deprioritize low-priority test cases; focus on P1 critical journeys. |
| Unstable test environment | Medium | High | Maintain mirrored secondary staging environment on AWS. |
| Scope & requirement creep | High | Medium | Enforce formal change control board (CCB) review before updating test scope. |

### Test Schedule and Milestones
| Milestone | Planned Start | Planned End | Owner |
|---|---|---|---|
| Test Planning | 02 Nov 2026 | 03 Nov 2026 | Test Lead |
| Test Case Design | 04 Nov 2026 | 10 Nov 2026 | QA Testers |
| Environment Setup | 09 Nov 2026 | 10 Nov 2026 | DevOps & Test Lead |
| Execution Cycle 1 | 11 Nov 2026 | 19 Nov 2026 | QA Testers |
| Regression & Retest | 20 Nov 2026 | 23 Nov 2026 | QA Testers |
| Test Closure & Reporting | 24 Nov 2026 | 24 Nov 2026 | Test Lead |

## 5. Result
Thus the test plan for the online shopping cart system was created in full compliance with the IEEE 829 standard, successfully detailing scope, approach, environmental requirements, schedule, risks, and entry/exit criteria.
