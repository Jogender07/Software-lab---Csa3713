# Experiment 84: Source Code Management (Git) and Peer Review Documentation

## 1. Aim
To execute version control workflows with Git and perform structured peer reviews on test artifacts and test automation code.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **SCM Tool** | Git version control system & GitHub repository |
| **Review Method** | Formal peer review checklist & Pull Request (PR) code review |
| **Artifacts Reviewed**| Automated test suite scripts, Page Object models, test data files |

## 3. Algorithm
1. Start and create a feature branch in Git (`git checkout -b feature/test-suite`).
2. Implement test scripts adhering to clean code standards and repository design patterns.
3. Commit changes with clear, descriptive commit messages (`git commit -m "..."`).
4. Push branch to remote and initiate a formal Pull Request (PR).
5. Conduct peer review using a standardized test code review checklist:
   - Verification of test independence and assertions
   - Browser driver cleanup in `finally` blocks
   - Elimination of hardcoded timeouts in favor of explicit waits
   - Adherence to naming conventions
6. Log reviewer comments, apply requested modifications, and complete merge into `main` branch.
7. Stop.

## 4. Test Documentation & Code Review Checklist

### Peer Review Inspection Checklist
| Check Item | Review Criteria | Compliant (Y/N) | Reviewer Notes |
|---|---|---|---|
| **Naming Conventions** | Descriptive method names indicating expected outcome | Yes | Clearly identifies test purpose |
| **Assertions** | Distinct assertion messages with expected vs actual | Yes | Assertions present on all paths |
| **Resource Cleanup** | Driver quit called in `finally` block | Yes | No dangling browser instances |
| **Synchronization** | `WebDriverWait` used instead of `Thread.sleep` | Yes | Explicit waits implemented |
| **Data Independence** | Test cases run independently without state pollution | Yes | `@BeforeEach` resets objects |
| **Documentation** | Experiment README contains Aim, Algo, Output, Status | Yes | Fully documented |

### Pull Request (PR) Review Audit
- **PR ID**: #14 - Add Selenium Checkout Flow Automation
- **Author**: QA Automation Engineer
- **Reviewer**: Senior QA Lead
- **Status**: Approved & Merged into `main`

## 5. Result
Thus source code management workflows using Git and formal peer reviews of test automation scripts were executed, ensuring adherence to quality and maintainability guidelines.
