#Author: Prasanthi Pinjarla
@HotelBookingPage

Feature: Booking

Scenario: After login check the fields on the booking page
Description : All necessary fields should be present
Given user is on booking page
Then check whether all the required fields are present or not

Scenario: After successful login with valid data
Description : user enters booking page
Given user is on booking page
When user enters all the valid data
Then navigate user to successful page

Scenario: booking successful with all details entered
Description : To confirm booking,all details must be correct
Given user is on booking page
When user enters all the proper details
Then navigate user to successful page

Scenario: failure in booking on leaving the first name blank
Given User is on hotel booking page
When user leaves first name blank and clicks button  
Then display alert message

Scenario: failure in booking on leaving the last name blank
Given User is on hotel booking page
When user leaves last name blank and clicks button  
Then display alert message

Scenario: failure in booking on leaving the email blank
Given User is on hotel booking page
When user leaves email blank 
And clicks button  
Then display alert message

Scenario: failure in booking on entering the incorrect email format
Given User is on hotel booking page
When user enters incorrect email format
And clicks button  
Then display alert message

Scenario: failure in booking on leaving the mobile no. blank
Given User is on hotel booking page
When user enters all the data 
But user leaves mobile no. blank
And clicks button  
Then display alert message

Scenario Outline: failure in booking on entering the incorrect mobile no. format
Given User is on hotel booking page
When user enters all the data 
But user enters incorrect mobile no. format
And clicks button 
Then display alert message 
Examples:
|543216987025|
|0900000000|
|67943|
|9440380136|


Scenario: failure in booking on not selecting city
Given User is on hotel booking page
When user enters all the data 
But user does not select city
And clicks button  
Then display alert message

Scenario: failure in booking on not selecting state
Given User is on hotel booking page
When user enters all the data 
But user does not select state
And clicks button  
Then display alert message

Scenario: failure in booking on not selecting number of guests staying
Given User is on hotel booking page
When user enters all the data 
But user does not select number of guests staying
And clicks button  
Then display alert message

Scenario Outline: validate the number of rooms allotted
Given User is on hotel booking page
When user enters the <numberOfPersons>
And clicks button 
Then 1 room must be allotted to 3 persons 
Examples:
|numberOfPersons|
|3|
|6|
|7|
|9|


Scenario: failure in booking on leaving cardHolderName blank
Given User is on hotel booking page
When user enters all the data 
But user leaves the cardHolderName blank
And clicks button  
Then display alert message

Scenario: failure in booking on leaving DebitCardNumber blank
Given User is on hotel booking page
When user enters all the data 
But user leaves the DebitCardNumber blank
And clicks button  
Then display alert message

Scenario: failure in booking on leaving cvv blank
Given User is on hotel booking page
When user enters all the data 
But user leaves the cvv blank
And clicks button  
Then display alert message

Scenario: failure in booking on leaving ExpirationMonth blank
Given User is on hotel booking page
When user enters all the data 
But user leaves the ExpirationMonth blank
And clicks button  
Then display alert message

Scenario: failure in booking on leaving ExpirationYear blank
Given User is on hotel booking page
When user enters all the data 
But user leaves the ExpirationYear blank
And clicks button  
Then display alert message

Scenario: Validate debit card details
Given User is on booking page
When user enters invalid card details
Then prompt appropriate message to user