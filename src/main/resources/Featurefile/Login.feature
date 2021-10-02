Feature: Login page
Scenario: verify login
Given open browser
When enter url "https://opensource-demo.orangehrmlive.com/"
Then enter username
Then enter password
And click on login