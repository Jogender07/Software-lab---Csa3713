# Course Outcome 3 (CO3): Testing Levels and Integration Testing

## Overview
Course Outcome 3 explores testing levels across the software lifecycle: Unit Testing, Integration Testing (stubs, drivers, module interfaces), System Testing (end-to-end user journeys), Regression Testing (impact analysis, tagging, test suites), and User Acceptance Testing (alpha/beta criteria and sign-off). It encompasses JUnit 5 suites, Selenium WebDriver session and checkout flows, and Apache JMeter performance, session, transaction, and REST API testing.

## Experiments Index

| Exp # | Title | Category | Deliverables |
|---|---|---|---|
| **41** | Smoke Testing for Messaging Application on New Build | Manual | [Experiment-41](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-41/README.md) - Smoke Checklist & Acceptance Record |
| **42** | Regression Testing for Content Management System After Updates | Manual | [Experiment-42](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-42/README.md) - Impact Analysis & Regression Matrix |
| **43** | System Testing for E-Commerce Checkout Process | Manual | [Experiment-43](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-43/README.md) - End-to-End System Test Scenarios |
| **44** | Acceptance Testing (UAT) for Hotel Reservation System | Manual | [Experiment-44](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-44/README.md) - Alpha/Beta Test Cases & Customer Sign-Off |
| **45** | JUnit Test Cases for Bank Account Management Application | JUnit 5 | [Experiment-45](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-45/README.md) - `BankAccount.java`, `BankAccountTest.java` |
| **46** | Test Harness Using Stub and Driver for Fare Calculation Module | JUnit 5 | [Experiment-46](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-46/README.md) - `DistanceService.java`, `FareCalculator.java`, `FareCalculatorTest.java` |
| **47** | Integration Testing for Library Management System | JUnit 5 | [Experiment-47](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-47/README.md) - `Book.java`, `Member.java`, `Library.java`, `LibraryIntegrationTest.java` |
| **48** | Regression Test Suite Using Tags and Test Suites in JUnit | JUnit 5 | [Experiment-48](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-48/README.md) - `CartService.java`, `CartTest.java`, `RegressionSuiteTest.java` |
| **49** | JUnit Test Life Cycle Using Stack Implementation | JUnit 5 | [Experiment-49](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-49/README.md) - `IntStack.java`, `IntStackTest.java` |
| **50** | Parameterized Integration Testing for Compound Interest | JUnit 5 | [Experiment-50](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-50/README.md) - `CompoundInterest.java`, `CompoundInterestTest.java` |
| **51** | Selenium Regression Testing - Automated Login and Logout with Session Verification | Selenium | [Experiment-51](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-51/README.md) - `Exercise51.java` |
| **52** | Selenium System Testing - End-to-End Checkout Flow Automation | Selenium | [Experiment-52](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-52/README.md) - `Exercise52.java` |
| **53** | Selenium Smoke Testing - Verify All Main Page Headings and Links | Selenium | [Experiment-53](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-53/README.md) - `Exercise53.java` |
| **54** | Selenium File Upload and Form Submission Automation | Selenium | [Experiment-54](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-54/README.md) - `Exercise54.java` |
| **55** | Selenium Dynamic Content Waiting (Explicit Wait vs Implicit Wait) | Selenium | [Experiment-55](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-55/README.md) - `Exercise55.java` |
| **56** | JMeter Load Testing of Student Information Portal | JMeter | [Experiment-56](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-56/README.md) - `Exercise56.jmx` |
| **57** | JMeter Load Testing of Web-Based Examination System | JMeter | [Experiment-57](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-57/README.md) - `Exercise57.jmx` |
| **58** | JMeter Session Management and Cookie Handling Using HTTP Cookie Manager | JMeter | [Experiment-58](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-58/README.md) - `Exercise58.jmx` |
| **59** | JMeter Multi-Step Ticket Booking Flow Using Transaction Controller | JMeter | [Experiment-59](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-59/README.md) - `Exercise59.jmx` |
| **60** | JMeter REST API Testing of Weather Information Service | JMeter | [Experiment-60](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-60/README.md) - `Exercise60.jmx` |

## Execution Guide

### JUnit 5 Tests Execution
Run all CO3 unit, integration, and lifecycle tests:
```powershell
Set-Location "c:\smilewell\CSA37-Software-Testing-Lab"
& ".\mvn.bat" test "-Dtest=com.csa37.co3.**.*Test"
```

### Selenium Automation Execution
Execute any standalone Selenium experiment:
```powershell
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co3.ex51.Exercise51
```

### JMeter Test Plans
Launch GUI or run in CLI mode:
```powershell
jmeter -n -t jmeter-plans/Exercise56.jmx -l results/ex56.jtl -e -o results/ex56_dashboard
```
