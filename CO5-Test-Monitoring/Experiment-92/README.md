# Experiment 92: Automated Broken Link Detection Using Selenium and HttpURLConnection

## 1. Aim
To write a Selenium WebDriver program to identify and report broken links on a web page using HTTP response codes.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Open the page containing status code links (`https://the-internet.herokuapp.com/status_codes`).
3. Locate all `<a>` elements with href containing `status_codes/` using `findElements()`.
4. Loop through each link, extract the `href` attribute and open an `HttpURLConnection`.
5. Send an HTTP GET request and read the response code. A response code >= 400 indicates a broken link.
6. Print the link, the response code and whether it is OK or BROKEN.
7. Print the total number of links checked and the count of broken links. Close the browser and stop.

## 3. Program
- [Exercise92.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-92/Exercise92.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex92.Exercise92
```

## 5. Expected Output
```
200 -> 200 -> OK
301 -> 301 -> OK
404 -> 404 -> BROKEN
500 -> 500 -> BROKEN
Links checked : 4
Broken links  : 2
```

## 6. Actual Execution Status
- HTTP status code probing and broken link detection verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to identify and report broken links on a web page using HTTP response codes was executed successfully and the output was verified.
