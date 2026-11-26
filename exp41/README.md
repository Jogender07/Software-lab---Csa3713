# Experiment 41: Smoke Testing for a Messaging Application

## 1. Aim
To execute smoke testing on a new version of a messaging application. Smoke testing is a quick and shallow check of the critical functions of a new build; it decides whether the build is stable enough for the detailed testing.

## 2. Pre-Requisites and Test Environment
| Item | Details |
|---|---|
| **Build under test** | New build of the messaging application (Build 2.5.0) |
| **Devices** | One Android and one iOS device with two test accounts |
| **Time limit** | The smoke test must be completed in 30 minutes |
| **Rule** | If any critical check fails the build is rejected and the testing stops |

## 3. Algorithm
1. Start and install the new build of the messaging application on the test device.
2. Prepare the smoke test checklist that covers only the critical functions of the application. Keep it short so that it can be executed in about 15 to 30 minutes.
3. Execute the checklist in the given order. If a critical function fails stop the testing.
4. If all the checks pass accept the build for detailed testing; otherwise reject the build and return it to the developers with the failed checks.
5. Install the build on the devices, note the build number and check the network connection before the first check.
6. Execute the checks in the order of the table, and stop the execution at the first failure of a critical function and return the build with the failure details to the developers.
7. Record the decision and the build number and stop.

## 4. Test Documentation & Execution Results

### Entry and Exit Criteria
| Criteria | Condition |
|---|---|
| **Entry** | Build is installed, test accounts are ready and network is available |
| **Pass** | All critical checks pass within 30 minutes |
| **Fail** | Any critical check fails or the application crashes |
| **Exit** | Decision recorded: build accepted for detailed testing or rejected |

### Smoke Test Checklist
| TC ID | Critical Function | Test Action | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|
| **SM01** | Install & launch | Install build and open app | App opens without crashing | App opens cleanly without crash | **PASS** |
| **SM02** | Login | Login using mobile number & OTP | Chat list is displayed | Chat list is displayed | **PASS** |
| **SM03** | Send text | Send text message to contact | Message sent; delivered tick | Message sent with delivered tick | **PASS** |
| **SM04** | Receive text | Receive message from other device | Message displayed with notification | Notification received & message shown | **PASS** |
| **SM05** | Send image | Send image from photo gallery | Image delivered successfully | Image preview and delivered tick | **PASS** |
| **SM06** | Create group | Create group with 2 members | Group created & members added | Group created and members present | **PASS** |
| **SM07** | Notification | Background app & receive message | Push notification displayed | System notification alert shown | **PASS** |
| **SM08** | Logout | Logout from settings menu | Login screen is displayed | Redirected to login screen | **PASS** |
| **SM09** | Delete message | Delete a sent message | Message removed from chat | Message deleted for everyone | **PASS** |
| **SM10** | Upgrade | Install new build over old build | Historical chat data retained | All previous chats retained | **PASS** |

### Build Acceptance Record
| Build Number | Date | Tested By | Checks Passed | Checks Failed | Decision |
|---|---|---|---|---|---|
| **Build 2.5.0** | 10 Nov 2026 | Tester 1 & Tester 2 | 10 | 0 | **Accepted for Detailed Testing** |

## 5. Result
Thus the smoke testing of the new version of the messaging application was executed and the build was accepted for detailed testing. Only the critical functions were checked, and the decision on the build was recorded.
