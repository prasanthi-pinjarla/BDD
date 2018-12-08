#Author : Prasanthi Pinjarla

@PageFactory
 
Feature: Sign up
 
Scenario: Check the heading of the signUp page
Given user is on signUp page
Then check the heading of the signUp page

Scenario: Successful signUp with valid data
Given user is on signUp page
When user enters valid details and clicks signUp
Then navigate to Welcome page

Scenario: name left empty
Given user is on signUp page
When user left name empty and clicks the signUp 
Then prompt user with appropriate message

Scenario: mobileNo. left empty
Given user is on signUp page
When user left mobile no. empty and clicks signUp
Then prompt user with appropriate message

Scenario: validating mobileNo. 
Given user is on signUp page
When user enters invalid mobile no. and clicks signUp
|6987543201|
|222222|
|98765432198745|
|9440380136|
Then prompt user with appropriate message



Scenario: email left empty
Given user is on signUp page
When user left email empty and clicks the signUp 
Then prompt user with appropriate message

Scenario: invalid email format 
Given user is on signUp page
When user enters invalid email fromat and clicks the signUp 
|prash|
|9fsdff.com|
|126945|
Then prompt user with appropriate message

Scenario: address left empty 
Given user is on signUp page
When user left address empty and clicks the signUp
Then user will be prompted with appropriate messages
