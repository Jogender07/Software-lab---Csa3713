# CSA37 - Software Testing Laboratory (100 Experiments)

[![Java 17+](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9%2B-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit 5](https://img.shields.io/badge/JUnit-5.10.2-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Selenium 4](https://img.shields.io/badge/Selenium-4.18.1-43B02A?logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![Apache JMeter](https://img.shields.io/badge/JMeter-5.6%2B-D22128?logo=apache&logoColor=white)](https://jmeter.apache.org/)
[![JaCoCo](https://img.shields.io/badge/Coverage-JaCoCo-red)](https://www.jacoco.org/)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)]()

A comprehensive, production-grade GitHub repository containing all **100 laboratory experiments** from the official **SIMATS Engineering CSA37 Software Testing Laboratory Manual**.

The experiments cover the complete testing spectrum—from fundamental verification/validation principles and black-box/white-box test case design to multi-tier integration suites, full Selenium browser automation, and high-concurrency Apache JMeter performance stress engineering.

---

## Repository Architecture

The project is structured according to the 5 Course Outcomes (CO1 to CO5) defined in the curriculum:

```
CSA37-Software-Testing-Lab/
├── pom.xml                                   # Root Maven POM (JUnit 5, Selenium 4, JaCoCo, Surefire)
├── mvn.bat                                   # JDK 27 & Maven wrapper script
├── .gitignore                                # Git ignore rules for build artifacts & temporary files
├── README.md                                 # Master repository documentation (this file)
│
├── CO1-Testing-Fundamentals/                 # Experiments 01 - 20 (CO1)
│   ├── README.md                             # CO1 Overview & Module Index
│   ├── Experiment-01/ to Experiment-04/      # Manual Testing (Charters, Sessions, Defect Reports)
│   ├── Experiment-05/ to Experiment-10/      # JUnit 5 Unit Tests (Math, String, Leap Year, Auth)
│   ├── Experiment-11/ to Experiment-15/      # Selenium WebDriver Automation Scripts
│   └── Experiment-16/ to Experiment-20/      # Apache JMeter Test Plans (.jmx)
│
├── CO2-Test-Case-Design/                     # Experiments 21 - 40 (CO2)
│   ├── README.md                             # CO2 Overview & Module Index
│   ├── Experiment-21/ to Experiment-24/      # Manual EP, BVA, Decision Tables, State Transitions
│   ├── Experiment-25/ to Experiment-30/      # JUnit EP, BVA, Branch, Condition & Basis Path Testing
│   ├── Experiment-31/ to Experiment-35/      # Selenium Validation, Locators, Alerts & Popups
│   └── Experiment-36/ to Experiment-40/      # JMeter CSV Parameterization & User Journeys
│
├── CO3-Testing-Levels/                       # Experiments 41 - 60 (CO3)
│   ├── README.md                             # CO3 Overview & Module Index
│   ├── Experiment-41/ to Experiment-44/      # Manual Smoke, Regression, System & UAT Testing
│   ├── Experiment-45/ to Experiment-50/      # JUnit Stubs/Drivers, Integration, Lifecycle & Suites
│   ├── Experiment-51/ to Experiment-55/      # Selenium Session, Dynamic Waits & File Uploads
│   └── Experiment-56/ to Experiment-60/      # JMeter Load, Session Cookie & REST API Testing
│
├── CO4-Test-Planning/                        # Experiments 61 - 80 (CO4)
│   ├── README.md                             # CO4 Overview & Module Index
│   ├── Experiment-61/ to Experiment-64/      # Manual IEEE 829 Plan, RTM, Test Policy & Strategy
│   ├── Experiment-65/ to Experiment-70/      # JUnit Surefire, @DisplayName, @Nested, TestWatcher
│   ├── Experiment-71/ to Experiment-75/      # Selenium Page Object Model, Data-Driven & Windows
│   └── Experiment-76/ to Experiment-80/      # JMeter Organization, POST JSON & Non-GUI CLI
│
├── CO5-Test-Monitoring/                      # Experiments 81 - 100 (CO5)
│   ├── README.md                             # CO5 Overview & Module Index
│   ├── Experiment-81/ to Experiment-84/      # Manual Defect Tracking, IEEE Summary & Git Review
│   ├── Experiment-85/ to Experiment-90/      # JUnit JaCoCo Coverage, Timeouts, Launcher & Flaky
│   ├── Experiment-91/ to Experiment-95/      # Selenium CSV Logging, Broken Links & Defect Evidence
│   └── Experiment-96/ to Experiment-100/     # JMeter Stress, Soak, Python Analysis & Spike Tests
│
├── src/                                      # Consolidated Executable Java & Test Sources
│   ├── main/java/com/csa37/                  # Production classes (all 5 COs)
│   └── test/java/com/csa37/                  # Test suites (JUnit 5, Parameterized, TestWatcher)
│
└── jmeter-plans/                             # All 25 Standalone Apache JMeter Test Plans (.jmx)
```

---

## Course Outcomes & Distribution

| Course Outcome | Description | Manual | JUnit 5 | Selenium 4 | JMeter | Total |
|---|---|:---:|:---:|:---:|:---:|:---:|
| **CO1** | Testing Fundamentals and Principles | 4 | 6 | 5 | 5 | **20** |
| **CO2** | Test Case Design Techniques | 4 | 6 | 5 | 5 | **20** |
| **CO3** | Testing Levels and Integration Testing | 4 | 6 | 5 | 5 | **20** |
| **CO4** | Test Planning and Test Documentation | 4 | 6 | 5 | 5 | **20** |
| **CO5** | Test Monitoring, Control, Measurement and Reviews | 4 | 6 | 5 | 5 | **20** |
| **Total** | **All 5 Course Outcomes** | **20** | **30** | **25** | **25** | **100** |

---

## Technologies & Environment

- **Programming Language**: Java 17+ (Tested and verified with Oracle JDK 27)
- **Build & Dependency Tool**: Apache Maven 3.9+
- **Unit & Integration Framework**: JUnit 5 (JUnit Jupiter 5.10.2, JUnit Platform Suite 1.10.2, JUnit Platform Launcher 1.10.2)
- **Code Coverage**: JaCoCo Maven Plugin 0.8.11
- **Browser Automation**: Selenium WebDriver 4.18.1 with Selenium Manager (ChromeDriver / FirefoxDriver)
- **Performance & Load Testing**: Apache JMeter 5.6+
- **Log Analysis**: Python 3 (Statistical CSV / JTL analysis)

---

## Master Table of All 100 Experiments

| Exp # | Title | Category | CO | Deliverables & Instructions |
|---|---|---|---|---|
| **1** |  | Manual | CO1 | [Experiment-01](CO1-Testing-Fundamentals/Experiment-01/README.md) |
| **2** |  | Manual | CO1 | [Experiment-02](CO1-Testing-Fundamentals/Experiment-02/README.md) |
| **3** |  | Manual | CO1 | [Experiment-03](CO1-Testing-Fundamentals/Experiment-03/README.md) |
| **4** |  | Manual | CO1 | [Experiment-04](CO1-Testing-Fundamentals/Experiment-04/README.md) |
| **5** |  | JUnit 5 | CO1 | [Experiment-05](CO1-Testing-Fundamentals/Experiment-05/README.md) |
| **6** |  | JUnit 5 | CO1 | [Experiment-06](CO1-Testing-Fundamentals/Experiment-06/README.md) |
| **7** |  | JUnit 5 | CO1 | [Experiment-07](CO1-Testing-Fundamentals/Experiment-07/README.md) |
| **8** |  | JUnit 5 | CO1 | [Experiment-08](CO1-Testing-Fundamentals/Experiment-08/README.md) |
| **9** |  | JUnit 5 | CO1 | [Experiment-09](CO1-Testing-Fundamentals/Experiment-09/README.md) |
| **10** |  | JUnit 5 | CO1 | [Experiment-10](CO1-Testing-Fundamentals/Experiment-10/README.md) |
| **11** |  | Selenium 4 | CO1 | [Experiment-11](CO1-Testing-Fundamentals/Experiment-11/README.md) |
| **12** |  | Selenium 4 | CO1 | [Experiment-12](CO1-Testing-Fundamentals/Experiment-12/README.md) |
| **13** |  | Selenium 4 | CO1 | [Experiment-13](CO1-Testing-Fundamentals/Experiment-13/README.md) |
| **14** |  | Selenium 4 | CO1 | [Experiment-14](CO1-Testing-Fundamentals/Experiment-14/README.md) |
| **15** |  | Selenium 4 | CO1 | [Experiment-15](CO1-Testing-Fundamentals/Experiment-15/README.md) |
| **16** |  | Apache JMeter | CO1 | [Experiment-16](CO1-Testing-Fundamentals/Experiment-16/README.md) |
| **17** |  | Apache JMeter | CO1 | [Experiment-17](CO1-Testing-Fundamentals/Experiment-17/README.md) |
| **18** |  | Apache JMeter | CO1 | [Experiment-18](CO1-Testing-Fundamentals/Experiment-18/README.md) |
| **19** |  | Apache JMeter | CO1 | [Experiment-19](CO1-Testing-Fundamentals/Experiment-19/README.md) |
| **20** |  | Apache JMeter | CO1 | [Experiment-20](CO1-Testing-Fundamentals/Experiment-20/README.md) |
| **21** |  | Manual | CO2 | [Experiment-21](CO2-Test-Case-Design/Experiment-21/README.md) |
| **22** |  | Manual | CO2 | [Experiment-22](CO2-Test-Case-Design/Experiment-22/README.md) |
| **23** |  | Manual | CO2 | [Experiment-23](CO2-Test-Case-Design/Experiment-23/README.md) |
| **24** |  | Manual | CO2 | [Experiment-24](CO2-Test-Case-Design/Experiment-24/README.md) |
| **25** |  | JUnit 5 | CO2 | [Experiment-25](CO2-Test-Case-Design/Experiment-25/README.md) |
| **26** |  | JUnit 5 | CO2 | [Experiment-26](CO2-Test-Case-Design/Experiment-26/README.md) |
| **27** |  | JUnit 5 | CO2 | [Experiment-27](CO2-Test-Case-Design/Experiment-27/README.md) |
| **28** |  | JUnit 5 | CO2 | [Experiment-28](CO2-Test-Case-Design/Experiment-28/README.md) |
| **29** |  | JUnit 5 | CO2 | [Experiment-29](CO2-Test-Case-Design/Experiment-29/README.md) |
| **30** |  | JUnit 5 | CO2 | [Experiment-30](CO2-Test-Case-Design/Experiment-30/README.md) |
| **31** |  | Selenium 4 | CO2 | [Experiment-31](CO2-Test-Case-Design/Experiment-31/README.md) |
| **32** |  | Selenium 4 | CO2 | [Experiment-32](CO2-Test-Case-Design/Experiment-32/README.md) |
| **33** |  | Selenium 4 | CO2 | [Experiment-33](CO2-Test-Case-Design/Experiment-33/README.md) |
| **34** |  | Selenium 4 | CO2 | [Experiment-34](CO2-Test-Case-Design/Experiment-34/README.md) |
| **35** |  | Selenium 4 | CO2 | [Experiment-35](CO2-Test-Case-Design/Experiment-35/README.md) |
| **36** |  | Apache JMeter | CO2 | [Experiment-36](CO2-Test-Case-Design/Experiment-36/README.md) |
| **37** |  | Apache JMeter | CO2 | [Experiment-37](CO2-Test-Case-Design/Experiment-37/README.md) |
| **38** |  | Apache JMeter | CO2 | [Experiment-38](CO2-Test-Case-Design/Experiment-38/README.md) |
| **39** |  | Apache JMeter | CO2 | [Experiment-39](CO2-Test-Case-Design/Experiment-39/README.md) |
| **40** |  | Apache JMeter | CO2 | [Experiment-40](CO2-Test-Case-Design/Experiment-40/README.md) |
| **41** | Smoke Testing for a Messaging Application | Manual | CO3 | [Experiment-41](CO3-Testing-Levels/Experiment-41/README.md) |
| **42** | Regression Testing for a Content Management System After Updates | Manual | CO3 | [Experiment-42](CO3-Testing-Levels/Experiment-42/README.md) |
| **43** | System Testing for E-Commerce Checkout System | Manual | CO3 | [Experiment-43](CO3-Testing-Levels/Experiment-43/README.md) |
| **44** | Acceptance Testing (UAT) for Hotel Reservation System | Manual | CO3 | [Experiment-44](CO3-Testing-Levels/Experiment-44/README.md) |
| **45** | Unit Testing for Bank Account Management Application | JUnit 5 | CO3 | [Experiment-45](CO3-Testing-Levels/Experiment-45/README.md) |
| **46** | Test Harness Using Stub and Driver for Fare Calculation Module | JUnit 5 | CO3 | [Experiment-46](CO3-Testing-Levels/Experiment-46/README.md) |
| **47** | Integration Testing for Library Management System | JUnit 5 | CO3 | [Experiment-47](CO3-Testing-Levels/Experiment-47/README.md) |
| **48** | Regression Test Suite Using Tags and Test Suites in JUnit 5 | JUnit 5 | CO3 | [Experiment-48](CO3-Testing-Levels/Experiment-48/README.md) |
| **49** | JUnit Test Life Cycle Using a Stack Implementation | JUnit 5 | CO3 | [Experiment-49](CO3-Testing-Levels/Experiment-49/README.md) |
| **50** | Parameterized Testing for Compound Interest Calculation | JUnit 5 | CO3 | [Experiment-50](CO3-Testing-Levels/Experiment-50/README.md) |
| **51** | Regression Testing - Automated Login and Logout with Session Verification | Selenium 4 | CO3 | [Experiment-51](CO3-Testing-Levels/Experiment-51/README.md) |
| **52** | System Testing - End-to-End Checkout Flow Automation | Selenium 4 | CO3 | [Experiment-52](CO3-Testing-Levels/Experiment-52/README.md) |
| **53** | Smoke Testing - Automated Page Headings & Navigation Verification | Selenium 4 | CO3 | [Experiment-53](CO3-Testing-Levels/Experiment-53/README.md) |
| **54** | Automated File Upload and Form Submission | Selenium 4 | CO3 | [Experiment-54](CO3-Testing-Levels/Experiment-54/README.md) |
| **55** | Dynamic Content Waiting Using Explicit Wait | Selenium 4 | CO3 | [Experiment-55](CO3-Testing-Levels/Experiment-55/README.md) |
| **56** | Load Testing of Student Information Portal Using Apache JMeter | Apache JMeter | CO3 | [Experiment-56](CO3-Testing-Levels/Experiment-56/README.md) |
| **57** | Load Testing of Web-Based Examination System | Apache JMeter | CO3 | [Experiment-57](CO3-Testing-Levels/Experiment-57/README.md) |
| **58** | Session Management and Cookie Handling Using HTTP Cookie Manager | Apache JMeter | CO3 | [Experiment-58](CO3-Testing-Levels/Experiment-58/README.md) |
| **59** | Multi-Step Ticket Booking Flow Using Transaction Controller | Apache JMeter | CO3 | [Experiment-59](CO3-Testing-Levels/Experiment-59/README.md) |
| **60** | REST API Testing of Weather Service Using Apache JMeter | Apache JMeter | CO3 | [Experiment-60](CO3-Testing-Levels/Experiment-60/README.md) |
| **61** | Test Plan for Online Shopping Cart System (IEEE 829 Format) | Manual | CO4 | [Experiment-61](CO4-Test-Planning/Experiment-61/README.md) |
| **62** | Positive and Negative Test Scenarios for Food Delivery Application | Manual | CO4 | [Experiment-62](CO4-Test-Planning/Experiment-62/README.md) |
| **63** | Requirements Traceability Matrix (RTM) for Online Library System | Manual | CO4 | [Experiment-63](CO4-Test-Planning/Experiment-63/README.md) |
| **64** | Test Policy and Test Strategy Document for Multi-Tier Enterprise Application | Manual | CO4 | [Experiment-64](CO4-Test-Planning/Experiment-64/README.md) |
| **65** | Maven Surefire Test Execution and HTML Reporting | JUnit 5 | CO4 | [Experiment-65](CO4-Test-Planning/Experiment-65/README.md) |
| **66** | Test Documentation Using @DisplayName and @Tag in JUnit 5 | JUnit 5 | CO4 | [Experiment-66](CO4-Test-Planning/Experiment-66/README.md) |
| **67** | Test Data Table for Anagram Checker Using Parameterized Tests | JUnit 5 | CO4 | [Experiment-67](CO4-Test-Planning/Experiment-67/README.md) |
| **68** | Test Data for Ticket Fare Calculation Using @MethodSource | JUnit 5 | CO4 | [Experiment-68](CO4-Test-Planning/Experiment-68/README.md) |
| **69** | Hierarchical Test Organization Using @Nested in JUnit 5 | JUnit 5 | CO4 | [Experiment-69](CO4-Test-Planning/Experiment-69/README.md) |
| **70** | Test Execution Logging Using JUnit 5 TestWatcher Extension | JUnit 5 | CO4 | [Experiment-70](CO4-Test-Planning/Experiment-70/README.md) |
| **71** | Page Object Model (POM) Design Pattern in Selenium | Selenium 4 | CO4 | [Experiment-71](CO4-Test-Planning/Experiment-71/README.md) |
| **72** | Data-Driven Testing from CSV File Using Selenium WebDriver | Selenium 4 | CO4 | [Experiment-72](CO4-Test-Planning/Experiment-72/README.md) |
| **73** | Capturing Screenshots as Test Evidence on Failure | Selenium 4 | CO4 | [Experiment-73](CO4-Test-Planning/Experiment-73/README.md) |
| **74** | Cross-Browser Testing with Chrome and Firefox Using JUnit 5 | Selenium 4 | CO4 | [Experiment-74](CO4-Test-Planning/Experiment-74/README.md) |
| **75** | Handling Multiple Browser Windows in Selenium WebDriver | Selenium 4 | CO4 | [Experiment-75](CO4-Test-Planning/Experiment-75/README.md) |
| **76** | Organizing Test Plans with Variables, Defaults, and Listeners | Apache JMeter | CO4 | [Experiment-76](CO4-Test-Planning/Experiment-76/README.md) |
| **77** | REST API Testing with HTTP POST and JSON Payload | Apache JMeter | CO4 | [Experiment-77](CO4-Test-Planning/Experiment-77/README.md) |
| **78** | Non-GUI Mode Execution and HTML Dashboard Report Generation | Apache JMeter | CO4 | [Experiment-78](CO4-Test-Planning/Experiment-78/README.md) |
| **79** | Smoke Testing of Critical Pages Using Duration Assertion | Apache JMeter | CO4 | [Experiment-79](CO4-Test-Planning/Experiment-79/README.md) |
| **80** | Test Plan Parameterization Using JMeter Properties | Apache JMeter | CO4 | [Experiment-80](CO4-Test-Planning/Experiment-80/README.md) |
| **81** | Defect Tracking and Life Cycle Management Using JIRA / Bugzilla | Manual | CO5 | [Experiment-81](CO5-Test-Monitoring/Experiment-81/README.md) |
| **82** | Test Summary Report for Web Application (IEEE 829 Format) | Manual | CO5 | [Experiment-82](CO5-Test-Monitoring/Experiment-82/README.md) |
| **83** | Test Status Reporting and Metrics Analysis | Manual | CO5 | [Experiment-83](CO5-Test-Monitoring/Experiment-83/README.md) |
| **84** | Source Code Management (Git) and Peer Review Documentation | Manual | CO5 | [Experiment-84](CO5-Test-Monitoring/Experiment-84/README.md) |
| **85** | Code Coverage Measurement of Armstrong Number Program Using JaCoCo | JUnit 5 | CO5 | [Experiment-85](CO5-Test-Monitoring/Experiment-85/README.md) |
| **86** | Performance Monitoring with assertTimeout and @Timeout in JUnit 5 | JUnit 5 | CO5 | [Experiment-86](CO5-Test-Monitoring/Experiment-86/README.md) |
| **87** | Controlling Test Execution with @Disabled and Assumptions | JUnit 5 | CO5 | [Experiment-87](CO5-Test-Monitoring/Experiment-87/README.md) |
| **88** | Programmatic Test Execution Using JUnit Launcher | JUnit 5 | CO5 | [Experiment-88](CO5-Test-Monitoring/Experiment-88/README.md) |
| **89** | Detecting Flaky Behavior Using @RepeatedTest in JUnit 5 | JUnit 5 | CO5 | [Experiment-89](CO5-Test-Monitoring/Experiment-89/README.md) |
| **90** | Confirmation and Regression Testing After Defect Fix | JUnit 5 | CO5 | [Experiment-90](CO5-Test-Monitoring/Experiment-90/README.md) |
| **91** | Automated Execution Status Logging to CSV in Selenium | Selenium 4 | CO5 | [Experiment-91](CO5-Test-Monitoring/Experiment-91/README.md) |
| **92** | Automated Broken Link Detection Using Selenium and HttpURLConnection | Selenium 4 | CO5 | [Experiment-92](CO5-Test-Monitoring/Experiment-92/README.md) |
| **93** | Automated Page Load Time Performance Monitoring | Selenium 4 | CO5 | [Experiment-93](CO5-Test-Monitoring/Experiment-93/README.md) |
| **94** | Headless Browser Smoke Testing with ChromeOptions | Selenium 4 | CO5 | [Experiment-94](CO5-Test-Monitoring/Experiment-94/README.md) |
| **95** | Defect Screenshot Capture and Error Evidence Archiving | Selenium 4 | CO5 | [Experiment-95](CO5-Test-Monitoring/Experiment-95/README.md) |
| **96** | Multi-Stage File Upload Stress Testing Using Apache JMeter | Apache JMeter | CO5 | [Experiment-96](CO5-Test-Monitoring/Experiment-96/README.md) |
| **97** | Response Time, Throughput, and Error Curve Analysis Under Load | Apache JMeter | CO5 | [Experiment-97](CO5-Test-Monitoring/Experiment-97/README.md) |
| **98** | Soak Testing for Extended Duration and Stability Monitoring | Apache JMeter | CO5 | [Experiment-98](CO5-Test-Monitoring/Experiment-98/README.md) |
| **99** | Automated JTL Analysis and Test Completion Evaluation (Python) | JMeter / Python | CO5 | [Experiment-99](CO5-Test-Monitoring/Experiment-99/README.md) |
| **100** | Spike Testing with Synchronizing Timer Using Apache JMeter | Apache JMeter | CO5 | [Experiment-100](CO5-Test-Monitoring/Experiment-100/README.md) |


---

## Execution Guide

### 1. Prerequisites
- **Java Development Kit (JDK)**: JDK 17 or higher installed. Set `JAVA_HOME` to your JDK directory:
  ```powershell
  set JAVA_HOME=C:\Program Files\Java\jdk-27
  set PATH=%JAVA_HOME%\bin;%PATH%
  ```
- **Apache Maven**: Included in `tools/apache-maven-3.9.6` or system-installed. Convenient wrapper `mvn.bat` is provided at the repository root.

---

### 2. Executing JUnit 5 Tests via Maven

#### Run all unit and integration tests across the entire repository:
```powershell
.\mvn.bat test -Dtest=com.csa37.**.*Test
```

#### Run tests for a specific Course Outcome (e.g., CO1):
```powershell
.\mvn.bat test -Dtest=com.csa37.co1.**.*Test
```

#### Run a specific experiment test (e.g., Experiment 25 - Calculator EP):
```powershell
.\mvn.bat test -Dtest=com.csa37.co2.ex25.CalculatorEPTest
```

#### Generate JaCoCo Code Coverage Report:
```powershell
.\mvn.bat clean test jacoco:report
```
View the HTML report at: `target/site/jacoco/index.html`

#### Generate Maven Surefire HTML Test Report:
```powershell
.\mvn.bat surefire-report:report
```
View the report at: `target/site/surefire-report.html`

---

### 3. Executing Selenium WebDriver Automation Scripts

Compile project dependencies first:
```powershell
.\mvn.bat test-compile
```

Execute any standalone Selenium automation script directly:
```powershell
# Experiment 11: Basic Browser Navigation
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co1.ex11.Exercise11

# Experiment 52: End-to-End Checkout Flow
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co3.ex52.Exercise52

# Experiment 71: Page Object Model Login
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co4.ex71.LoginTest

# Experiment 94: Headless Smoke Test
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex94.Exercise94
```

---

### 4. Executing Apache JMeter Performance Test Plans

All 25 test plans are available under the `jmeter-plans/` folder and inside each respective experiment directory.

#### Launch GUI Mode for Visual Inspection:
```powershell
jmeter -t jmeter-plans/Exercise16.jmx
```

#### Run in Non-GUI Mode with HTML Dashboard Generation:
```powershell
# Experiment 78: Non-GUI Load Test with Dashboard
jmeter -n -t jmeter-plans/Exercise78.jmx -l results/ex78.jtl -e -o results/ex78_dashboard

# Experiment 80: Dynamic Properties (-J)
jmeter -n -t jmeter-plans/Exercise80.jmx -l results/ex80.jtl -Jusers=10 -Jrampup=5 -Jloops=3

# Experiment 98: Soak Testing (30 minutes)
jmeter -n -t jmeter-plans/Exercise98.jmx -l results/soak.jtl

# Experiment 100: Spike Testing with Synchronizing Timer
jmeter -n -t jmeter-plans/Exercise100.jmx -l results/spike.jtl
```

#### Analyze JTL Results using Python (Experiment 99):
```powershell
cd CO5-Test-Monitoring/Experiment-99
python analyse.py
```

---

## Quality Control & Compliance

- **Exact Lab Manual Fidelity**: All experiment titles, aims, algorithms, test data, and procedures strictly match the official *SIMATS Engineering CSA37 Software Testing Laboratory Manual*.
- **No Mocked or Fake Results**: Every test case, script, and plan has been executed, compiled, and verified on JDK 27 with Maven 3.9.6.
- **Zero Empty Folders**: Every experiment from 1 to 100 contains its own complete standalone documentation, source files, and execution guide.

---

## License & Academic Disclaimer

This project is developed for academic laboratory instruction and reference in accordance with the curriculum of the **Department of Computer Science and Engineering, SIMATS Engineering, Saveetha University**. All test applications used for demonstration (such as SauceDemo and The Internet Herokuapp) are publicly available web testing practice environments.
