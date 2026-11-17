# Experiment 64: Test Policy and Test Strategy Document for Multi-Tier Enterprise Application

## 1. Aim
To create a comprehensive Test Policy and Test Strategy document for a multi-tier enterprise web application.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **System under test** | Multi-Tier Enterprise Financial Portal (Web UI, Microservices API, Database Tier) |
| **Document Purpose** | Establish organizational QA governance, testing standards, test levels, tools, and quality gates |
| **Target Audience** | QA Engineers, Development Leads, DevOps Engineers, Enterprise Architects, Project Managers |

## 3. Algorithm
1. Start and define the corporate Test Policy detailing executive quality commitments, objectives, and success indicators.
2. Outline the Test Strategy describing the test pyramid, testing types, and environmental requirements across tiers.
3. Define entrance and exit criteria for every testing phase.
4. Establish defect management standards including severity and priority classifications and SLAs.
5. Specify test automation framework architecture and continuous testing integration in CI/CD pipelines.
6. Document roles, responsibilities, and sign-off criteria.
7. Stop.

## 4. Test Documentation

### Test Policy & Strategy Framework
| Section | Details |
|---|---|
| **Organizational Policy** | 100% of critical business workflows must undergo automated regression testing prior to any production deployment. Zero Sev-1 or Sev-2 defects allowed in production releases. |
| **Test Pyramid Alignment** | 70% Unit tests (JUnit 5), 20% Integration/API tests (REST Assured & JMeter), 10% End-to-End UI tests (Selenium WebDriver 4). |
| **Quality Gates** | Unit test line coverage must exceed 80% (enforced by JaCoCo). Performance SLAs: 95th percentile response time < 2000ms at peak load. |
| **Defect Severities** | **Sev-1 (Critical)**: System crash or data loss; fix within 4 hours.<br>**Sev-2 (High)**: Core functionality impaired without workaround; fix within 24 hours.<br>**Sev-3 (Medium)**: Non-critical feature bug with workaround; fix in current sprint.<br>**Sev-4 (Low)**: Cosmetic/minor UI defect; scheduled in backlog. |
| **Tools Stack** | Java 17+, Maven 3.9+, JUnit 5, Selenium WebDriver 4, Apache JMeter 5.6+, Git, JIRA. |
| **Roles & RACI** | Test Lead (Accountable for test plan & sign-off), QA Tester (Responsible for test design & execution), Dev Lead (Responsible for unit tests & bug fixes). |

## 5. Result
Thus the Test Policy and Test Strategy document for the multi-tier enterprise application was developed and verified, providing standardized guidelines for QA governance, test levels, automation standards, and defect handling.
