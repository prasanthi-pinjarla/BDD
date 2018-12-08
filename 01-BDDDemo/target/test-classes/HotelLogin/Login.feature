#Author: Prasanthi Pinjarla
@HotelBookingLogin

Feature: Login

Scenario: Check the heading of the login page
Given User is on login page
Then check the heading of the login page

Scenario: Successful login with valid data
Description : to login, user needs to enter his valid user name, password 
Given user is on login page
When user enters valid user name and valid password
Then navigate to hotel booking

Scenario: prompt user to enter the data when he leaves the login fields
Given user is on login page
When user doesn't enter either user name or password
And clicks the login button
Then prompt user with appropriate message

Scenario: Unsuccessful login due to invalid data
Description : Invalid details result in unsuccessful login
Given user is on login page
When user enters either invalid user name or password
And clicks login
Then user will be prompted with appropriate messages

Scenario: Non existing user
Description : To login, user must be existing
Given user is on login page
When user enters user name and password
And clicks login
Then user will be prompted with appropriate messages



