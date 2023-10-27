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
Feature: To check the Transaction section

   Scenario: Check data table get displayed between the selected date
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click side transaction link
    When Select the date
		When Click transaction search button
    Then verify the data gets display between the date
    
    
