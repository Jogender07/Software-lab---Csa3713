# Course Outcome 2 (CO2): Test Case Design Techniques

## Overview
Course Outcome 2 focuses on applying black-box and white-box test case design techniques including Equivalence Partitioning (EP), Boundary Value Analysis (BVA), Decision Table Testing, State Transition Testing, Basis Path Testing, and Branch/Condition Coverage. It also covers data-driven Selenium browser automation, XPath locators, and JMeter user journey parameterization.

## Experiments Index

| Exp # | Title | Category | Deliverables |
|---|---|---|---|
| **21** | Test Cases for E-Commerce Checkout using Equivalence Partitioning | Manual | [Experiment-21](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-21/README.md) - EP Table & Test Cases |
| **22** | Test Cases for Age Eligibility Verification using Boundary Value Analysis | Manual | [Experiment-22](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-22/README.md) - 2-Value & 3-Value BVA Test Suite |
| **23** | Decision Table for Credit Card Approval System | Manual | [Experiment-23](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-23/README.md) - 8-Rule Decision Table & Test Matrix |
| **24** | State Transition Testing for ATM Cash Withdrawal System | Manual | [Experiment-24](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-24/README.md) - State Table & Transition Coverage |
| **25** | JUnit Test Cases for Calculator using Equivalence Partitioning | JUnit 5 | [Experiment-25](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-25/README.md) - `Calculator.java`, `CalculatorEPTest.java` |
| **26** | JUnit Test Cases for Grading System using Boundary Value Analysis | JUnit 5 | [Experiment-26](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-26/README.md) - `GradeEvaluator.java`, `GradeEvaluatorBVATest.java` |
| **27** | JUnit Test Cases for Decision Logic using Branch Coverage | JUnit 5 | [Experiment-27](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-27/README.md) - `VoteChecker.java`, `VoteCheckerTest.java` |
| **28** | JUnit Test Cases for Condition Coverage on Sorting Logic | JUnit 5 | [Experiment-28](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-28/README.md) - `SortUtil.java`, `SortUtilTest.java` |
| **29** | Basis Path Testing on Payroll System with Independent Paths | JUnit 5 | [Experiment-29](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-29/README.md) - `Payroll.java`, `PayrollPathTest.java` |
| **30** | Statement and Branch Coverage for Maximum of Three Numbers | JUnit 5 | [Experiment-30](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-30/README.md) - `MaxFinder.java`, `MaxFinderTest.java` |
| **31** | Selenium WebDriver Automation for Form Submission with Validation | Selenium | [Experiment-31](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-31/README.md) - `Exercise31.java` |
| **32** | Data-Driven Testing with Selenium Using External Test Data (JUnit Parameterized) | Selenium | [Experiment-32](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-32/README.md) - `LoginDataDrivenTest.java` |
| **33** | Selenium Locators Comparison (ID, Name, XPath, CSS Selector) | Selenium | [Experiment-33](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-33/README.md) - `Exercise33.java` |
| **34** | Dropdown and Checkbox Handling in Selenium | Selenium | [Experiment-34](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-34/README.md) - `Exercise34.java` |
| **35** | Alert and Popup Handling in Selenium WebDriver | Selenium | [Experiment-35](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-35/README.md) - `Exercise35.java` |
| **36** | JMeter Load Test for Web Application Login Flow with Ramp-Up | JMeter | [Experiment-36](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-36/README.md) - `Exercise36.jmx` |
| **37** | JMeter Parameterization using CSV Data Set Config | JMeter | [Experiment-37](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-37/README.md) - `Exercise37.jmx`, `users.csv` |
| **38** | JMeter Response Assertion for Validating HTTP Response Codes and Content | JMeter | [Experiment-38](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-38/README.md) - `Exercise38.jmx` |
| **39** | Simulating Peak Load on Web Server Using JMeter Thread Group | JMeter | [Experiment-39](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-39/README.md) - `Exercise39.jmx` |
| **40** | JMeter User Journey Test: Search, View Product, Add to Cart | JMeter | [Experiment-40](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO2-Test-Case-Design/Experiment-40/README.md) - `Exercise40.jmx` |

## Execution Guide

### JUnit 5 Tests Execution
Run all CO2 unit and structural coverage tests:
```powershell
Set-Location "c:\smilewell\CSA37-Software-Testing-Lab"
& ".\mvn.bat" test "-Dtest=com.csa37.co2.**.*Test"
```

### Selenium Automation Execution
Execute any standalone Selenium experiment:
```powershell
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co2.ex31.Exercise31
```

### JMeter Test Plans
Launch GUI or run in CLI mode:
```powershell
jmeter -n -t jmeter-plans/Exercise36.jmx -l results/ex36.jtl -e -o results/ex36_dashboard
```
