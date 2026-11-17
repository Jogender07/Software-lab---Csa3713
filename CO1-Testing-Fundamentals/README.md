# Course Outcome 1 (CO1): Software Testing Fundamentals, Principles and Defect Detection

## Course Outcome Description
**CO1:** Apply software testing principles to enhance the effectiveness of software quality assurance and improve defect detection strategies using manual testing, JUnit, Selenium WebDriver and Apache JMeter.

---

## Distribution of Exercises in CO1
- **Manual Testing:** Exercises 1 – 4 (4 Exercises)
- **JUnit 5:** Exercises 5 – 10 (6 Exercises)
- **Selenium WebDriver 4:** Exercises 11 – 15 (5 Exercises)
- **Apache JMeter:** Exercises 16 – 20 (5 Exercises)
- **Total:** 20 Exercises

---

## Index of Exercises

| Ex. No. | Title | Category | Status |
|:---:|:---|:---:|:---:|
| [01](./Experiment-01/README.md) | Identify and document the software defects of an ATM system from its specification | Manual | Completed |
| [02](./Experiment-02/README.md) | Perform exploratory testing on a simple inventory management system | Manual | Completed |
| [03](./Experiment-03/README.md) | Create a defect report for a web-based form submission application | Manual | Completed |
| [04](./Experiment-04/README.md) | Classify the defects of a loan application by defect class and build a defect repository | Manual | Completed |
| [05](./Experiment-05/README.md) | Calculate the factorial of a number and validate the output using JUnit assertions | JUnit | Verified |
| [06](./Experiment-06/README.md) | Check whether a given year is a leap year and validate the output using JUnit assertions | JUnit | Verified |
| [07](./Experiment-07/README.md) | Check whether a number is prime and validate the output using JUnit assertions | JUnit | Verified |
| [08](./Experiment-08/README.md) | Reverse a given string and validate the output using JUnit assertions | JUnit | Verified |
| [09](./Experiment-09/README.md) | Test the exception handling of a division program using assertThrows in JUnit | JUnit | Verified |
| [10](./Experiment-10/README.md) | Implement security testing for password hashing and authentication using JUnit | JUnit | Verified |
| [11](./Experiment-11/README.md) | Open Chrome using Selenium WebDriver and verify the title and URL of a web page | Selenium | Verified |
| [12](./Experiment-12/README.md) | Locate web elements using id, name, class name, CSS selector and XPath in Selenium | Selenium | Verified |
| [13](./Experiment-13/README.md) | Automate the filling and submission of a web form using Selenium WebDriver | Selenium | Verified |
| [14](./Experiment-14/README.md) | Automate checkbox and radio button selection using Selenium WebDriver | Selenium | Verified |
| [15](./Experiment-15/README.md) | Capture a screenshot of a web page and store it in the local system using Selenium WebDriver | Selenium | Verified |
| [16](./Experiment-16/README.md) | Create a basic test plan using Thread Group, HTTP Request sampler and listeners in JMeter | JMeter | Verified |
| [17](./Experiment-17/README.md) | Detect defects in a web page response using the Response Assertion in JMeter | JMeter | Verified |
| [18](./Experiment-18/README.md) | Configure HTTP Request Defaults and HTTP Header Manager for REST API requests in JMeter | JMeter | Verified |
| [19](./Experiment-19/README.md) | Simulate user think time using the Constant Timer in JMeter | JMeter | Verified |
| [20](./Experiment-20/README.md) | Compare the Summary Report and Aggregate Report listeners in JMeter | JMeter | Verified |

---

## Execution Guide

### 1. Manual Testing (Exercises 1 – 4)
Each folder contains the complete test charter, bug report, test matrix, and deliverables in accordance with the laboratory manual.

### 2. JUnit 5 (Exercises 5 – 10)
Execute all CO1 JUnit test suites using Maven:
\`\`\`bash
# From repository root
mvn test -Dtest=com.csa37.co1.**.*Test
\`\`\`

Individual test execution:
\`\`\`bash
mvn test -Dtest=MathUtilTest
mvn test -Dtest=YearUtilTest
mvn test -Dtest=PrimeUtilTest
mvn test -Dtest=StringUtilTest
mvn test -Dtest=CalculatorTest
mvn test -Dtest=AuthServiceTest
\`\`\`

### 3. Selenium WebDriver (Exercises 11 – 15)
Run the individual Selenium automation programs:
\`\`\`bash
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex11.Exercise11"
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex12.Exercise12"
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex13.Exercise13"
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex14.Exercise14"
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex15.Exercise15"
\`\`\`

### 4. Apache JMeter (Exercises 16 – 20)
Run the JMeter test plans in command-line mode:
\`\`\`bash
jmeter -n -t Experiment-16/Exercise16.jmx -l results_ex16.jtl
jmeter -n -t Experiment-17/Exercise17.jmx -l results_ex17.jtl
jmeter -n -t Experiment-18/Exercise18.jmx -l results_ex18.jtl
jmeter -n -t Experiment-19/Exercise19.jmx -l results_ex19.jtl
jmeter -n -t Experiment-20/Exercise20.jmx -l results_ex20.jtl
\`\`\`
