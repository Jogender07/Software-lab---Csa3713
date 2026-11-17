# Course Outcome 4 (CO4): Test Planning and Test Documentation

## Overview
Course Outcome 4 focuses on test planning, documentation, and reporting across the testing lifecycle. It covers IEEE 829 test plan design, positive and negative test scenario matrices, Requirements Traceability Matrix (RTM) construction, test policy and strategy definitions, JUnit 5 reporting with Surefire, `@DisplayName` and `@Tag` test organization, parameterized `@MethodSource` tests, `@Nested` test classes, `TestWatcher` execution logging, Selenium Page Object Model (POM) architecture, CSV data-driven testing, failure screenshots, cross-browser testing, multi-window handling, and JMeter test plan organization, REST API POST payloads, non-GUI reporting, and property parameterization.

## Experiments Index

| Exp # | Title | Category | Deliverables |
|---|---|---|---|
| **61** | Test Plan for Online Shopping Cart System (IEEE 829 Format) | Manual | [Experiment-61](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-61/README.md) - IEEE 829 Test Plan `TP-CART-01` |
| **62** | Positive and Negative Test Scenarios for Food Delivery Application | Manual | [Experiment-62](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-62/README.md) - Positive/Negative Test Matrix |
| **63** | Requirements Traceability Matrix (RTM) for Online Library System | Manual | [Experiment-63](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-63/README.md) - Bidirectional RTM Table & Coverage Metrics |
| **64** | Test Policy and Test Strategy Document for Multi-Tier Application | Manual | [Experiment-64](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-64/README.md) - Test Policy & Governance Strategy |
| **65** | Maven Surefire Test Execution and HTML Reporting | JUnit 5 | [Experiment-65](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-65/README.md) - `TemperatureConverter.java`, `TemperatureConverterTest.java` |
| **66** | Test Documentation Using @DisplayName and @Tag for Interest Calculation | JUnit 5 | [Experiment-66](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-66/README.md) - `InterestCalculator.java`, `InterestCalculatorTest.java` |
| **67** | Test Data Table for Anagram Checker Using Parameterized Tests | JUnit 5 | [Experiment-67](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-67/README.md) - `AnagramChecker.java`, `AnagramCheckerTest.java` |
| **68** | Test Data for Ticket Fare Calculation Using @MethodSource | JUnit 5 | [Experiment-68](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-68/README.md) - `TicketFare.java`, `TicketFareTest.java` |
| **69** | Hierarchical Test Organization Using @Nested in JUnit 5 | JUnit 5 | [Experiment-69](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-69/README.md) - `ShoppingCart.java`, `ShoppingCartTest.java` |
| **70** | Test Execution Logging Using JUnit 5 TestWatcher Extension | JUnit 5 | [Experiment-70](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-70/README.md) - `WordCounter.java`, `ResultLogger.java`, `WordCounterTest.java` |
| **71** | Page Object Model (POM) Design Pattern in Selenium | Selenium | [Experiment-71](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-71/README.md) - `LoginPage.java`, `InventoryPage.java`, `LoginTest.java` |
| **72** | Data-Driven Testing from CSV File Using Selenium WebDriver | Selenium | [Experiment-72](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-72/README.md) - `users.csv`, `Exercise72.java` |
| **73** | Capturing Screenshots as Test Evidence on Failure | Selenium | [Experiment-73](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-73/README.md) - `Exercise73.java` |
| **74** | Cross-Browser Testing with Chrome and Firefox Using JUnit 5 | Selenium | [Experiment-74](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-74/README.md) - `CrossBrowserTest.java` |
| **75** | Handling Multiple Browser Windows in Selenium WebDriver | Selenium | [Experiment-75](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-75/README.md) - `Exercise75.java` |
| **76** | Organizing Test Plans with Variables, Defaults, and Listeners | JMeter | [Experiment-76](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-76/README.md) - `Exercise76.jmx`, `ContentSite.jmx` |
| **77** | REST API Testing with HTTP POST and JSON Payload | JMeter | [Experiment-77](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-77/README.md) - `Exercise77.jmx` |
| **78** | Non-GUI Mode Execution and HTML Dashboard Report Generation | JMeter | [Experiment-78](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-78/README.md) - `Exercise78.jmx` |
| **79** | Smoke Testing of Critical Pages Using Duration Assertion | JMeter | [Experiment-79](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-79/README.md) - `Exercise79.jmx` |
| **80** | Test Plan Parameterization Using JMeter Properties | JMeter | [Experiment-80](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-80/README.md) - `Exercise80.jmx` |

## Execution Guide

### JUnit 5 Tests Execution
Run all CO4 unit, data-driven, and nested tests:
```powershell
Set-Location "c:\smilewell\CSA37-Software-Testing-Lab"
& ".\mvn.bat" test "-Dtest=com.csa37.co4.**.*Test"
```

### Selenium Automation Execution
Execute any standalone Selenium experiment:
```powershell
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co4.ex71.LoginTest
```

### JMeter Test Plans
Launch GUI or run in CLI mode:
```powershell
jmeter -n -t jmeter-plans/Exercise78.jmx -l results/ex78.jtl -e -o results/ex78_dashboard
```
