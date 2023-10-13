#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BetInPrime
Feature: Forgot Password Page

  @ForgotPassword
  Scenario: Check Forgot password page displayed
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    And Click Forgot password link
    Then verify the url as "http://onlinegamblingtech.com/forgotpassword"
    And close browser

  Scenario: Check Forgot password functionality with username
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/forgotpassword"
    When Enter the Username as "Viraj1"
    And Click Restore password button
    Then Verify the success email toast message as "Your password has been reset, Please login with the new password given to you in the text message."
    And close browser
   

 # Scenario: Check Forgot password functionality with phone
  #  Given User Launch The Chrome Browser
  #  When User Open URL "http://onlinegamblingtech.com/forgotpassword"
  #  And Enter the phone number as "911030077"
  #  And Click Restore password button
  #  Then Verify the success phone toast message as "Your password has been reset, Please login with the new password given to you in the text message."
  #  And close browser

  Scenario: Check Forgot password functionality with invalid username
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/forgotpassword"
    When Enter the invalid Username as "Viraj1q1"
    And Click Restore password button
    Then Verify the failed email toast message as "User does not exist."
    And close browser

 # Scenario: Check Forgot password functionality with invalid phone
  #  Given User Launch The Chrome Browser
  #  When User Open URL "http://onlinegamblingtech.com/forgotpassword"
  #  And Enter the phone number as "9110300773"
  #  And Click Restore password button
  #  Then Verify the failed phone toast message as "User does not exist."
  #  And close browser

  Scenario: Check Forgot password validation toast message
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/forgotpassword"
    And Click Restore password button
    Then Verify the failed fp toast message as "Please Enter any Value"
    And close browser
