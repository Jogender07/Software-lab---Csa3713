# Course Outcome 5 (CO5): Test Monitoring, Control, Measurement and Reviews

## Overview
Course Outcome 5 covers test monitoring, control, measurement, and review activities. This includes defect tracking with JIRA/Bugzilla, IEEE 829 test summary reporting, QA metrics and KPI dashboards, version control with Git and peer code reviews, JaCoCo code coverage measurement, JUnit 5 performance timeouts, conditional execution and assumptions, programmatic test execution using the JUnit Launcher, detecting flaky behavior with `@RepeatedTest`, defect confirmation and regression testing, Selenium CSV result logging, broken links detection, page load timing, headless browser testing, defect screenshot archiving, and JMeter stress testing, load capacity curves, 1800-second soak testing, Python automated JTL log analysis, and spike testing using the Synchronizing Timer.

## Experiments Index

| Exp # | Title | Category | Deliverables |
|---|---|---|---|
| **81** | Defect Tracking and Life Cycle Management Using JIRA / Bugzilla | Manual | [Experiment-81](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-81/README.md) - Defect Life Cycle & JQL Monitoring |
| **82** | Test Summary Report for Web Application (IEEE 829 Format) | Manual | [Experiment-82](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-82/README.md) - IEEE 829 Test Summary Report `TSR-CART-01` |
| **83** | Test Status Reporting and Metrics Analysis | Manual | [Experiment-83](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-83/README.md) - Defect Density & Progress Metrics |
| **84** | Source Code Management (Git) and Peer Review Documentation | Manual | [Experiment-84](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-84/README.md) - Git Workflow & PR Inspection Checklist |
| **85** | Code Coverage Measurement of Armstrong Program Using JaCoCo | JUnit 5 | [Experiment-85](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-85/README.md) - `ArmstrongUtil.java`, `ArmstrongUtilTest.java` |
| **86** | Performance Monitoring with assertTimeout and @Timeout in JUnit 5 | JUnit 5 | [Experiment-86](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-86/README.md) - `PerfUtil.java`, `PerfUtilTest.java` |
| **87** | Controlling Test Execution with @Disabled and Assumptions | JUnit 5 | [Experiment-87](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-87/README.md) - `LoginValidator.java`, `LoginValidatorTest.java` |
| **88** | Programmatic Test Execution Using JUnit Launcher | JUnit 5 | [Experiment-88](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-88/README.md) - `Discount.java`, `DiscountTest.java`, `TestRunner.java` |
| **89** | Detecting Flaky Behavior Using @RepeatedTest in JUnit 5 | JUnit 5 | [Experiment-89](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-89/README.md) - `IdGenerator.java`, `DiceUtil.java`, `RepeatedBehaviourTest.java` |
| **90** | Confirmation and Regression Testing After Defect Fix | JUnit 5 | [Experiment-90](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-90/README.md) - `Stats.java`, `StatsTest.java` |
| **91** | Automated Execution Status Logging to CSV in Selenium | Selenium | [Experiment-91](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-91/README.md) - `Exercise91.java` |
| **92** | Automated Broken Link Detection Using Selenium and HttpURLConnection | Selenium | [Experiment-92](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-92/README.md) - `Exercise92.java` |
| **93** | Automated Page Load Time Performance Monitoring | Selenium | [Experiment-93](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-93/README.md) - `Exercise93.java` |
| **94** | Headless Browser Smoke Testing with ChromeOptions | Selenium | [Experiment-94](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-94/README.md) - `Exercise94.java` |
| **95** | Defect Screenshot Capture and Error Evidence Archiving | Selenium | [Experiment-95](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-95/README.md) - `Exercise95.java` |
| **96** | Multi-Stage File Upload Stress Testing Using Apache JMeter | JMeter | [Experiment-96](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-96/README.md) - `Exercise96.jmx` |
| **97** | Response Time, Throughput, and Error Curve Analysis Under Load | JMeter | [Experiment-97](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-97/README.md) - `Exercise97.jmx` |
| **98** | Soak Testing for Extended Duration and Stability Monitoring | JMeter | [Experiment-98](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-98/README.md) - `Exercise98.jmx` |
| **99** | Automated JTL Analysis and Test Completion Evaluation (Python) | JMeter / Python | [Experiment-99](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-99/README.md) - `analyse.py`, `results.jtl` |
| **100** | Spike Testing with Synchronizing Timer Using Apache JMeter | JMeter | [Experiment-100](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-100/README.md) - `Exercise100.jmx` |

## Execution Guide

### JUnit 5 Tests Execution
Run all CO5 unit, coverage, and performance tests:
```powershell
Set-Location "c:\smilewell\CSA37-Software-Testing-Lab"
& ".\mvn.bat" test "-Dtest=com.csa37.co5.**.*Test"
```

### Programmatic Test Runner (Experiment 88)
```powershell
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex88.TestRunner
```

### Python JTL Log Analysis (Experiment 99)
```powershell
cd CO5-Test-Monitoring/Experiment-99
python analyse.py
```

### Selenium Automation Execution
Execute any standalone Selenium experiment:
```powershell
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex94.Exercise94
```

### JMeter Test Plans
Launch GUI or run in CLI mode:
```powershell
jmeter -n -t jmeter-plans/Exercise100.jmx -l results/ex100.jtl -e -o results/ex100_dashboard
```
