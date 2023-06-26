Feature: Login Functionality

  @Login
  Scenario Outline: 
    Given User has Navigated to the Login Page
    When User enters the valid "<username>" into email field
    And User enters the valid "<password>" into the password field
    And User clicks on the Login button
    Then User Should be able to logged in Successfully
  Examples:

|username|password|
|DBa@emids.com|Welcome@123|

  
  