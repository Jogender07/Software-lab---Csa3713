# Experiment 81: Defect Tracking and Life Cycle Management Using JIRA / Bugzilla

## 1. Aim
To create defect tracking using a tool like JIRA or Bugzilla. A defect tracking tool stores every defect in one place and shows its status, owner and history until it is closed.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **Tool** | JIRA Software / Bugzilla Defect Management System |
| **Project Setup** | Project Key `SP` (Student Portal), Issue Type `Bug`, Priority scale (Highest to Lowest) |
| **User Roles** | QA Tester (Reporter), Test Lead (Reviewer), Developer (Assignee) |
| **Deliverables** | Defect life cycle transition log, JQL monitoring queries, Weekly defect distribution report |

## 3. Algorithm
1. Start and open the defect tracking tool (JIRA or Bugzilla) and create a project for the application under test.
2. Create a new issue of the type `Bug` and populate mandatory fields: summary, description, steps to reproduce, severity, priority, environment, attachments and assignee.
3. Transition the defect through its defined life cycle states: New -> Assigned -> In Progress -> Fixed -> Retest -> Closed (or Reopened).
4. Configure JIRA Query Language (JQL) filters to monitor defect density by status, priority, and age.
5. Create dashboard gadgets to report open defects for weekly management quality reviews.
6. Record defect status updates at each stage and capture screenshots of defect tickets and reports.
7. Stop.

## 4. Test Documentation & Defect Life Cycle

### Defect Life Cycle State Transitions
| State | Meaning | Triggered By | Next State |
|---|---|---|---|
| **New** | Defect logged and submitted | Tester | Assigned / Rejected / Duplicate |
| **Assigned** | Defect allocated to developer | Test Lead / PM | In Progress |
| **In Progress** | Developer actively implementing fix | Developer | Fixed / Deferred |
| **Fixed** | Defect resolved in new build | Developer | Retest |
| **Retest** | QA verifying resolution in test environment | Tester | Closed / Reopened |
| **Closed** | Fix verified and confirmed working | Tester | - |
| **Reopened** | Fix failed during retest verification | Tester | Assigned |
| **Deferred** | Fix postponed to subsequent milestone | Test Lead / PM | Assigned |

### Sample Defect Ticket: SP-104
| Field | Value |
|---|---|
| **Issue Key / Type** | SP-104 / Bug |
| **Summary** | Results page displays incorrect CGPA calculation for students with cleared arrears |
| **Severity / Priority** | Major / High |
| **Environment** | Staging Server (v2.4.1), Chrome v122 |
| **Steps to Reproduce** | 1. Login with student account with cleared arrears.<br>2. Navigate to `/results` tab.<br>3. Compare displayed CGPA against official credit calculation. |
| **Expected Result** | CGPA incorporates updated marks of cleared arrears. |
| **Actual Result** | CGPA is calculated using original failed attempt marks. |
| **Attachment** | `evidence/cgpa_calculation_mismatch.png` |
| **Status** | Closed (Verified in Build 2.4.2) |

### JQL Quality Monitoring Queries
| Purpose | JQL Query |
|---|---|
| Open high priority defects | `project = SP AND issuetype = Bug AND status != Closed ORDER BY priority DESC` |
| Defect waiting for QA retest | `project = SP AND issuetype = Bug AND status = Retest` |
| Defects logged in last 7 days | `project = SP AND issuetype = Bug AND created >= -7d` |

### Defect Distribution Summary
| Status | Defect Count |
|---|---|
| New | 2 |
| Assigned / In Progress | 3 |
| Fixed / Retest | 2 |
| Closed | 8 |
| Reopened | 1 |
| **Total Logged** | **16** |

## 5. Result
Thus defect tracking was established using a defect tracking tool, defects were tracked through their entire life cycle, and quality monitoring dashboards were verified.
