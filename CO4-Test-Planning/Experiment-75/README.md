# Experiment 75: Handling Multiple Browser Windows in Selenium WebDriver

## 1. Aim
To write a Selenium WebDriver program to handle multiple browser windows.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Open the windows page and store the handle of the parent window using `getWindowHandle()`.
3. Click the link Click Here that opens a new window.
4. Read all the handles using `getWindowHandles()` and switch to the handle that is not the parent window.
5. Print the title and the text of the child window, close it and switch back to the parent window.
6. Print the title of the parent window and stop.

## 3. Program
- [Exercise75.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-75/Exercise75.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co4.ex75.Exercise75
```

## 5. Expected Output
```
Child window title  : New Window
Child window text   : New Window
Parent window title : The Internet
```

## 6. Actual Execution Status
- Window handle enumeration and switching verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to handle multiple browser windows was executed successfully and the output was verified.
