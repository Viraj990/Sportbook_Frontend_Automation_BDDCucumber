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
Feature: Login Page

  @Login
  Scenario: Check validation of login field without entering the data
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    And Click on Login button
    Then verify validation Message for Username as "Username is required" and Password as "Password is required"
    And close browser

  Scenario: Check validation of Username field as blank
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Password as "Test@1234"
    And Click on Login button
    Then verify validation Message for Username as "Username is required"
    And close browser

  Scenario: Check validation of Password field as blank
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1"
    And Click on Login button
    Then verify validation Message for Password as "Password is required"
    And close browser

  Scenario: Check validation toast message for invalid login
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "asjid" Password as "Test@1234"
    And Click on Login button
    Then verify validation toast Message as "Invalid credentials."
    And close browser

  Scenario: Check the valid login functionality
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    Then verify validation success toast Message as "Login successfully."
    Then Click logout
    And close browser

  Scenario: Checking the validation for inactive user
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "eds" Password as "Test@1234"
    And Click on Login button
    Then verify inactive toast Message as "Account is not active."
    And close browser
