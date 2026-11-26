# Exercise 3: Create a Defect Report for a Web-Based Form Submission Application (Manual)

## Aim
To create a defect report for a web-based form submission application. A good defect report is complete, clear and reproducible; it gives the developer all the information needed to understand, locate and fix the defect without asking the tester again.

## Pre-requisites and Test Environment
| Item | Details |
|---|---|
| **Application under test** | Any web based registration or contact form |
| **Browser and system** | Chrome (latest) on Windows 11 and one more browser to confirm the defect |
| **Evidence** | Screenshot of the defect; screen recording if the steps are long |
| **Tool** | Spreadsheet or a defect tracking tool |

## Algorithm
1. **Step 1:** Start and open the web form (registration or contact form). Test it with valid, invalid and blank data, and with boundary data such as the maximum length of the fields.
2. **Step 2:** When the actual result is different from the expected result, stop and collect the details of the defect: the exact steps, the data used, the expected and the actual results, the browser and the operating system. Repeat the steps once to confirm that the defect is reproducible.
3. **Step 3:** Fill the defect report template: id, summary, module, severity, priority, steps to reproduce, expected result, actual result, environment and status. Select the severity by the effect on the system and the priority by the urgency of the fix.
4. **Step 4:** Attach the screenshot of the defect (and the log file or the video if available) to the report.
5. **Step 5:** Check for a duplicate: search the existing reports for the same summary before a new report is written, because a duplicate report wastes the time of the developer.
6. **Step 6:** Write the summary as one clear line that tells what is wrong and where (for example: The form accepts an e-mail address without the @ symbol).
7. **Step 7:** Prepare one report for every defect, review the reports for clarity and for duplicates, and stop.

## Test Cases / Deliverables

### Severity and Priority Guidelines
| Level | Meaning | Example |
|---|---|---|
| **Severity : Critical** | System crash, data loss or the main function is blocked | Form submission stops the server |
| **Severity : Major** | A main function gives a wrong result | Invalid e-mail accepted |
| **Severity : Minor** | A small functional defect with a work around | Wrong error message text |
| **Severity : Trivial** | Cosmetic defect | Label is misaligned |
| **Priority : High / Medium / Low** | Urgency of the fix decided with the project manager | High = fix in the next build |

### Defect Report 1 (Sample)
| Field | Details |
|---|---|
| **Defect Id** | WF-001 |
| **Summary** | The form accepts an e-mail address without the @ symbol |
| **Module** | Registration form |
| **Severity / Priority** | Major / High |
| **Steps to reproduce** | 1. Open the registration page.<br>2. Enter the name and the e-mail address `abc.com`.<br>3. Click Submit. |
| **Expected result** | Error message "Enter a valid e-mail address" is displayed and the form is not submitted |
| **Actual result** | The form is submitted and the success page is displayed |
| **Environment** | Windows 11, Chrome (latest), test server |
| **Status** | New |

### Defect Report 2 (Sample)
| Field | Details |
|---|---|
| **Defect Id** | WF-002 |
| **Summary** | Mandatory field Name accepts only spaces |
| **Module** | Registration form |
| **Severity / Priority** | Minor / Medium |
| **Steps to reproduce** | 1. Enter three spaces in the Name field.<br>2. Fill all other fields correctly.<br>3. Click Submit. |
| **Expected result** | Error message "Name is required" is displayed |
| **Actual result** | The form is submitted with a blank name |
| **Environment** | Windows 11, Chrome (latest), test server |
| **Status** | New |

### Defect Report Template (Defect Found by Tester)
| Field | Details |
|---|---|
| **Defect Id / summary** | WF-003 / The mobile number field accepts letters |
| **Module / severity / priority** | Registration form / Major / High |
| **Steps to reproduce** | 1. Open the registration page.<br>2. Enter `abcdefghij` in the Mobile number field.<br>3. Fill the other fields correctly and click Submit. |
| **Expected result / actual result** | Error message "Enter a valid mobile number" is displayed / The form is submitted with letters in the mobile number |
| **Environment / attachment** | Windows 11, Chrome (latest), test server / `WF-003.png` |
| **Reported by / date / status** | Tester 1 / 12 Oct 2026 / New |

## Execution Instructions
1. Open the target web registration form.
2. Execute negative tests using invalid formats, spaces, and alphabet strings in numeric fields.
3. Observe deviations from functional specifications.
4. Document reproducible defects using the standard defect reporting format.
5. Attach evidence screenshots.

## Expected Output
Structured and complete defect reports (WF-001, WF-002, WF-003) following IEEE standards with severity and priority classification.

## Actual Execution Status
Completed - 3 comprehensive defect reports logged and verified.

## Result
Thus the defect reports of the web-based form submission application were created and the output was verified. Each report contains the steps to reproduce, the expected and the actual results and the environment.
