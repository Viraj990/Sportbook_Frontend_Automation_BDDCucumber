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
Feature: To check the profile functionality

  @Profile
  Scenario: Check profile page displayed clicking profile link
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    Then Verify the profile url as "http://onlinegamblingtech.com/user/profile"
    And close browser

  Scenario: Check profile page should not displayed pasting direct link
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/user/profile"
    Then Verify the profile page displayed
    And close browser

  Scenario: Verify the username is match with login information
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    Then Profile name match with the expected username as "Viraj1"
    And close browser

  Scenario: - Click update profile wihout entering the address
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Addresscheck" Password as "Abcd@1234"
    And Click on Login button
    And Click profile link
    Then Click Update profile button
    Then Verify the error message displayed as "Please Enter your Old password"
    And close browser

  Scenario: - Check the Adding address in the profile
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Addresscheck" Password as "Abcd@1234"
    And Click on Login button
    And Click profile link
    Then Add Address as "Ipsam eius do molest" Enter Password as "Abcd@1234"
    And Click Update profile button
    Then verify the success profile update toast message as "Your profile updated successfully."
    And close browser

  Scenario: - Check the update profile information
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    And Click profile link
    Then Enter Firstname as "gdgsayug" Lastname as "dbsyudb" Address as "Ipsasdasdm daseius do molest" Enter Password as "Abcd@1234"
    And Click Update profile button
    Then verify the success profile update toast message as "Your profile updated successfully."
    And close browser

  Scenario: - Check the update profile information without password
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    And Click profile link
    Then Enter Firstname as "gdgsayug" Lastname as "dbsyudb" Address as "Ipsasdasdm daseius do molest"
    And Click Update profile button
    Then verify the password error validation message as "Please Enter your Old password"
    And close browser

  Scenario: - Validate password field with entering the invalid password
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    And Click profile link
    Then Enter invalid old password as "Abcd@12345"
    And Click Update profile button
    Then verify the invalid profile toast message as "Invalid credentials."
    And close browser

  Scenario: - Validate the password textfield condition
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    And Click profile link
    Then enter old password as "1234656"
    And Click Update profile button
    Then verify the validation error password message as "Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and One Special Case Character"
    And close browser

  Scenario: - Checking the password change functionality
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj2" Password as "Abcd@1234"
    And Click on Login button
    And Click profile link
    Then enter Old password as "Abcd@1234" and New password as "Test@1234"
    And Click Update profile button
    Then Verify the success profile update toast message as "Your profile updated successfully"
    And close browser

