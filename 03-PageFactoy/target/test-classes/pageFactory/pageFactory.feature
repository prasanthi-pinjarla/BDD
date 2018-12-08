#Author : Prasanthi Pinjarla

@PageFactory
 
Feature: Sign up

Background: user is on signUp page

Scenario: Check the heading of the signUp page
Then check the heading of the signUp page

Scenario: Successful signUp with valid data
When user enters valid details and clicks signUp
Then navigate to Welcome page

Scenario: name left empty
When user left name empty and clicks the signUp 
Then alert user to enter name

Scenario: email left empty
When user left email empty and clicks the signUp 
Then alert user to enter email

Scenario: invalid email format 
When user enters invalid email format and clicks the signUp 
|prash|
|9fsdff.com|
|126945|
Then alert user to enter valid email

Scenario: mobileNo. left empty
When user left mobile no. empty and clicks signUp
Then alert user to enter mobileNo

Scenario: validating mobileNo. 
When user enters invalid mobileNo and clicks signUp
|6987543201|
|222222|
|987654321987|
|82816606974689844644|
Then alert user to enter valid mobile no.



Scenario: gender left empty 
When user left gender empty and clicks the signUp
Then alert user to select gender

Scenario: user didn't select city
When user doesn't selects city
Then alert user to select city

Scenario: address left empty 
When user left address empty and clicks the signUp
Then alert user to enter address
