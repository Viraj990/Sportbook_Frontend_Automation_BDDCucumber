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
@tag
Feature: Ticket view and functionality checking

  @Tickets
  Scenario: Clicking on transaction, Transaction section get open
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side ticket link
    Then Verify the ticket section is open as "TICKETS"
    And close browser

  Scenario: Validate transaction section displayed without login
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/user/Tickets"
    Then Verify the ticket section displayed through pasting
    And close browser

  Scenario: Check transaction url match or not
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side ticket link
    Then verify the ticket page url as "http://onlinegamblingtech.com/user/Tickets"
    And close browser

  Scenario: Check Refresh icon is available or not
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side ticket link
    Then Verify the refresh icon visibility
    And close browser
  
  Scenario: Validate the transaction column name
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side ticket link
    Then Verify the ticket table headings
    And close browser

  Scenario: Checking the clicking on the Betid ticket get popup
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side ticket link
    And Click Bet id
    Then verify the popup get displayed or not
    And close browser
    
    Scenario: Fetch default Row per page displayed or not
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side ticket link
    Then Verify the ticket number row per page
    And close browser

  Scenario: Validate the chnage the Row per page
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side ticket link
    And click on the ticket Row per page dropdown and select as "25"
    Then Verify the changes displayed in the ticket row per page
    And close browser
    
