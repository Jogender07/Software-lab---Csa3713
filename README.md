# CSA37 - Software Testing Laboratory (Experiments 1 to 60)

[![Java 17+](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9%2B-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit 5](https://img.shields.io/badge/JUnit-5.10.2-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Selenium 4](https://img.shields.io/badge/Selenium-4.18.1-43B02A?logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![Apache JMeter](https://img.shields.io/badge/JMeter-5.6%2B-D22128?logo=apache&logoColor=white)](https://jmeter.apache.org/)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)]()

A complete, production-grade repository containing the first **60 experiments (CO1, CO2, and CO3)** for **CSA37 - Software Testing Laboratory** (SIMATS Engineering, Saveetha Institute of Medical and Technical Sciences).

Each experiment is organized in its dedicated folder (`exp1` to `exp60`):
- **Manual Testing Experiments**: Include full **Aim**, **Pre-requisites & Environment**, **Algorithm**, **Test Cases / Bug Reports / Decision Tables**, **Expected Output**, **Actual Execution Status**, and **Result**.
- **Automated Testing Programs (JUnit 5, Selenium WebDriver 4, Apache JMeter)**: Include full source code files (`.java`, `.jmx`), syntax-highlighted code blocks, CLI execution instructions, terminal outputs, and results.

---

## 📑 Master Index of Experiments (exp1 to exp60)

| Exp # | Folder | Title | Type | Category | Deliverables & Code |
|---|---|---|---|---|---|
| **1** | [exp1](exp1/) | ATM System Defect Identification & Documentation | Manual | CO1 | Bug Report, Defect Classification, Execution Summary |
| **2** | [exp2](exp2/) | Exploratory Testing on Inventory Management System | Manual | CO1 | 8 Charters, Tours, SFDIPOT, Session Sheets |
| **3** | [exp3](exp3/) | Web-Based Form Submission Defect Reporting | Manual | CO1 | Defect Reports (WF-001 to WF-003), Severity/Priority |
| **4** | [exp4](exp4/) | Loan Application Defect Classification & Repository | Manual | CO1 | Defect Repository, Defect Clustering, Prevention Plan |
| **5** | [exp5](exp5/) | Factorial Calculation with JUnit Assertions | JUnit 5 | CO1 | `MathUtil.java`, `MathUtilTest.java` |
| **6** | [exp6](exp6/) | Leap Year Check using JUnit Assertions | JUnit 5 | CO1 | `YearUtil.java`, `YearUtilTest.java` |
| **7** | [exp7](exp7/) | Prime Number Verification with JUnit Assertions | JUnit 5 | CO1 | `PrimeUtil.java`, `PrimeUtilTest.java` |
| **8** | [exp8](exp8/) | String Reversal and Palindrome Validation | JUnit 5 | CO1 | `StringUtil.java`, `StringUtilTest.java` |
| **9** | [exp9](exp9/) | Exception Handling for Division with assertThrows | JUnit 5 | CO1 | `Calculator.java`, `CalculatorTest.java` |
| **10** | [exp10](exp10/) | Security Testing Password Hashing & Authentication | JUnit 5 | CO1 | `AuthService.java`, `AuthServiceTest.java` |
| **11** | [exp11](exp11/) | Open Chrome and Verify Web Page Title & URL | Selenium 4 | CO1 | `Exercise11.java` |
| **12** | [exp12](exp12/) | Locate Web Elements (id, name, class, css, xpath) | Selenium 4 | CO1 | `Exercise12.java` |
| **13** | [exp13](exp13/) | Automate Filling and Submission of a Web Form | Selenium 4 | CO1 | `Exercise13.java` |
| **14** | [exp14](exp14/) | Automate Checkbox & Radio Button Selection | Selenium 4 | CO1 | `Exercise14.java` |
| **15** | [exp15](exp15/) | Capture Screenshot of Web Page & Save Locally | Selenium 4 | CO1 | `Exercise15.java` |
| **16** | [exp16](exp16/) | Basic Test Plan (Thread Group, HTTP Sampler, Listeners)| JMeter | CO1 | `Exercise16.jmx` |
| **17** | [exp17](exp17/) | Defect Detection in Web Response using Response Assertion| JMeter | CO1 | `Exercise17.jmx` |
| **18** | [exp18](exp18/) | HTTP Request Defaults & Header Manager for REST API | JMeter | CO1 | `Exercise18.jmx` |
| **19** | [exp19](exp19/) | User Think Time Simulation using Constant Timer | JMeter | CO1 | `Exercise19.jmx` |
| **20** | [exp20](exp20/) | Summary Report vs Aggregate Report Comparison | JMeter | CO1 | `Exercise20.jmx` |
| **21** | [exp21](exp21/) | Equivalence Class Partitioning for Simple Calculator | Manual | CO2 | Input Partitions, Valid/Invalid Classes, 11 Test Cases |
| **22** | [exp22](exp22/) | Boundary Value Analysis for Student Grade System | Manual | CO2 | 6-Point BVA Values, Grade Boundaries, 15 Test Cases |
| **23** | [exp23](exp23/) | Black-Box Testing on Login Module | Manual | CO2 | Decision Table, Security Tests, 12 Test Cases |
| **24** | [exp24](exp24/) | Test Data Generation for Ticket Booking Application | Manual | CO2 | Field Rules, Valid/Invalid Boundary Test Data (TD01-TD14) |
| **25** | [exp25](exp25/) | Equivalence Class Partitioning Calculator in JUnit | JUnit 5 | CO2 | `Calculator.java`, `CalculatorEPTest.java` |
| **26** | [exp26](exp26/) | Boundary Value Analysis Grading in JUnit | JUnit 5 | CO2 | `GradeEvaluator.java`, `GradeEvaluatorBVATest.java` |
| **27** | [exp27](exp27/) | Voting Eligibility Validation BVA in JUnit | JUnit 5 | CO2 | `VoteChecker.java`, `VoteCheckerTest.java` |
| **28** | [exp28](exp28/) | Statement Coverage on Bubble Sort Program | JUnit 5 | CO2 | `SortUtil.java`, `SortUtilTest.java` |
| **29** | [exp29](exp29/) | Basis Path Coverage Testing on Payroll Calculation | JUnit 5 | CO2 | `Payroll.java`, `PayrollPathTest.java` (V(G)=4) |
| **30** | [exp30](exp30/) | Branch Coverage on Finding Largest of Three Numbers | JUnit 5 | CO2 | `MaxFinder.java`, `MaxFinderTest.java` |
| **31** | [exp31](exp31/) | Black-Box Login Page Testing Matrix | Selenium 4 | CO2 | `Exercise31.java` |
| **32** | [exp32](exp32/) | Data-Driven Login Testing (JUnit 5 + Selenium) | Selenium 4 | CO2 | `LoginDataDrivenTest.java` |
| **33** | [exp33](exp33/) | Automate Dropdown Selection using Select Class | Selenium 4 | CO2 | `Exercise33.java` |
| **34** | [exp34](exp34/) | Numeric Input Boundary Value Testing | Selenium 4 | CO2 | `Exercise34.java` |
| **35** | [exp35](exp35/) | Handle JS Alert, Confirm, and Prompt Popups | Selenium 4 | CO2 | `Exercise35.java` |
| **36** | [exp36](exp36/) | Black-Box HTTP POST Sampler Login Request | JMeter | CO2 | `Exercise36.jmx` |
| **37** | [exp37](exp37/) | Data-Driven Testing using CSV Data Set Config | JMeter | CO2 | `Exercise37.jmx`, `users.csv` |
| **38** | [exp38](exp38/) | Dynamic Value Correlation using JSON Extractor | JMeter | CO2 | `Exercise38.jmx` |
| **39** | [exp39](exp39/) | Test Flow Control (Loop, Once Only, If Controllers) | JMeter | CO2 | `Exercise39.jmx` |
| **40** | [exp40](exp40/) | REST API Testing Status Codes & Response Data | JMeter | CO2 | `Exercise40.jmx` |
| **41** | [exp41](exp41/) | Smoke Testing on New Version of Messaging App | Manual | CO3 | 10 Critical Checks, Build Acceptance Record |
| **42** | [exp42](exp42/) | Regression Testing for Content Management System | Manual | CO3 | Impact Analysis, Regression Suite (RG01-RG10), Defect Log |
| **43** | [exp43](exp43/) | System Testing Scenarios for E-Commerce Checkout | Manual | CO3 | 10 End-to-End Scenarios, Order/Stock Ledger State |
| **44** | [exp44](exp44/) | Acceptance Testing for Hotel Reservation System | Manual | CO3 | Alpha/Beta Acceptance Matrix (AC01-AC10), UAT Sign-Off |
| **45** | [exp45](exp45/) | Bank Account Management Unit Testing | JUnit 5 | CO3 | `BankAccount.java`, `BankAccountTest.java` |
| **46** | [exp46](exp46/) | Test Harness using Stub and Driver for Fare Module | JUnit 5 | CO3 | `DistanceService.java`, `FareCalculator.java`, `FareCalculatorTest.java` |
| **47** | [exp47](exp47/) | Integration Testing for Library Management System | JUnit 5 | CO3 | `Book.java`, `Member.java`, `Library.java`, `LibraryIntegrationTest.java` |
| **48** | [exp48](exp48/) | Regression Test Suite using Tags & Test Suites | JUnit 5 | CO3 | `CartService.java`, `CartTest.java`, `RegressionSuiteTest.java` |
| **49** | [exp49](exp49/) | JUnit Test Lifecycle using Stack Implementation | JUnit 5 | CO3 | `IntStack.java`, `IntStackTest.java` |
| **50** | [exp50](exp50/) | Parameterized Compound Interest Calculation | JUnit 5 | CO3 | `CompoundInterest.java`, `CompoundInterestTest.java` |
| **51** | [exp51](exp51/) | Automated Regression Testing for Login/Logout | Selenium 4 | CO3 | `Exercise51.java` |
| **52** | [exp52](exp52/) | System Testing of End-to-End Checkout Flow | Selenium 4 | CO3 | `Exercise52.java` |
| **53** | [exp53](exp53/) | Smoke Testing of Critical Website Pages | Selenium 4 | CO3 | `Exercise53.java` |
| **54** | [exp54](exp54/) | Automate File Upload Functionality | Selenium 4 | CO3 | `Exercise54.java` |
| **55** | [exp55](exp55/) | Test Dynamically Loaded Web Elements (Explicit Waits)| Selenium 4 | CO3 | `Exercise55.java` |
| **56** | [exp56](exp56/) | Performance Testing on Student Portal | JMeter | CO3 | `Exercise56.jmx` |
| **57** | [exp57](exp57/) | Load Testing for Web-Based Exam System | JMeter | CO3 | `Exercise57.jmx` |
| **58** | [exp58](exp58/) | Session Management & HTTP Cookie Manager | JMeter | CO3 | `Exercise58.jmx` |
| **59** | [exp59](exp59/) | End-to-End Flight Booking Flow Transaction Controller| JMeter | CO3 | `Exercise59.jmx` |
| **60** | [exp60](exp60/) | API Testing of Weather Forecast Service | JMeter | CO3 | `Exercise60.jmx` |

---

## 🛠️ Execution & Verification

### Run All JUnit Tests with Maven:
```powershell
mvn clean test
```

### Run an Individual JUnit Test:
```powershell
mvn test -Dtest=MathUtilTest
```

### Run Selenium Automation:
```powershell
javac -cp ".;lib/*" exp11/Exercise11.java
java -cp ".;lib/*" exp11.Exercise11
```

### Run Apache JMeter Plans via CLI:
```powershell
jmeter -n -t exp16/Exercise16.jmx -l results.jtl -e -o report
```
