# Author:
# Feature Name:
# User Story Number:
# Description:
# Author:
# Feature Name:
# User Story Number:
# Description:
Feature: Validate Modify User functionality
Description: This feature verifies Modify User functionality.

Scenario: Validate Create User Functionality
Given I launch the Chrome Borwser
And I navigate the Application URL
And I find the Login page
When I enter the username in username text field
And I enter the password in password text field
And I click on login button in login page
Then I find the home page
And I click on minimize flyout window
Given I find the home page
When I click on User Image
And I click on add user button
Then I find the create user page
When I enter the First Name in First Name text field
And I enter the Last Name in Last Name text field
And I enter the email in email text field
And I enter the User Name in User Name text field
And I enter the user password in password text field
And I enter the user password in retypepassword text field
And I click on Create User button
Then I find the created user
When I click on the existing user
And I clear the email in email text field
And I enter the email in email text field
Then I click on Save User button
