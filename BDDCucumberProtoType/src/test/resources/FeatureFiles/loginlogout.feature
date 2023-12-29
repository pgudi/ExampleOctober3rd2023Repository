# Author:
# Feature Name:
# User Story Number:
# Description:
Feature: Login and logout functionality
Description: This feature verifies Login and Logout functionality.

Scenario: Validate Login Functionality
Given I launch the Chrome Borwser
And I navigate the Application URL
And I find the Login page
When I enter the username in username text field
And I enter the password in password text field
And I click on login button in login page
Then I find the home page
And I click on minimize flyout window

Scenario: Validate Logout Functionality
Given I find the home page
When I click on logout link
Then I find the Login page
And I close the application

