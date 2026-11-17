# Experiment 54: Automated File Upload and Form Submission

## 1. Aim
To write a Selenium WebDriver script in Java to automate file uploading and verify that the file is submitted successfully.

## 2. Algorithm
1. Start the program, create a Maven project and add the dependencies `selenium-java` and `chromedriver` to `pom.xml`.
2. Initialise the `ChromeDriver` and open the file upload page.
3. Create a temporary text file on the local machine to use as the upload sample.
4. Locate the `<input type="file">` element and pass the absolute path of the local file using `sendKeys()`.
5. Click the upload button to submit the form.
6. Verify the confirmation message and check that the uploaded file name matches the expected file name.
7. Close the browser using `driver.quit()` and stop.

## 3. Program
- [Exercise54.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-54/Exercise54.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co3.ex54.Exercise54
```

## 5. Expected Output
```
Upload status     : File Uploaded!
File name matches : true
```

## 6. Actual Execution Status
- Automated temporary file generation and form upload verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver script in Java to automate file uploading and verify submission was executed successfully and the output was verified.
