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
Feature: Registration Page

  @Registration
  Scenario: Check validation of all field
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    And Click on register button
    Then verify validation Message for FirstName as "First Name is required", LastName as "Last Name is required", UserName as "Username is required", DateofBirth as "Date of Birth is required", Phone as "Phone Number is required", Email as "Email is required", Password as "Please Enter your password" and terms as "You must accept the terms and conditions"
    And close browser

  @Registration
  Scenario: Check validation of already register user
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Viraj", Lastname as "Mehta", Email as "viraj1@yopmail.com", Dateofbirth as "08121989", phone as "7999431562", username as "Viraj1" , password as "Test@1234" and accept T&C
    And Click on register button
    Then verify Validation Message as "Username is required"
    And close browser

  @Registration
  Scenario: Check validation of Firstname and Lastname using digits in the text field
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Viraj1", Lastname as "Mehta1", Email as "viraj1d@yopmail.com", Dateofbirth as "08121989", phone as "7999431562", username as "Verifyname" , password as "Test@1234" and accept T&C
    And Click on register button
    Then verify Firstname validation as "No numbers allowed" and Lastname Validation as "No numbers allowed"
    And close browser

  @Registration
  Scenario: Check validation of DOB entering less then 18 years
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Viraj", Lastname as "Mehta", Email as "viraj1dd@yopmail.com", Dateofbirth as "08122008", phone as "7889431562", username as "Verifydob" , password as "Test@1234" and accept T&C
    And Click on register button
    Then verify DateofBitrth validation message as "You must be at least 18 years old"
    And close browser

  @Registration
  Scenario: Check validation for password Textfield
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Viraj", Lastname as "Mehta", Email as "viraj1@yopmail.com", Dateofbirth as "08121989", phone as "7889431562", username as "Verifypwd" and password as "123456" and accept T&C
    And Click on register button
    Then verify password validation message as "Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and One Special Case Character"
    And close browser

  @Registration
  Scenario: Check validation Register user without accepting terms
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Virajd", Lastname as "Mehtaa", Email as "viraj1dd@yopmail.com", Dateofbirth as "08121989", phone as "7889431562", username as "Verifyterm" and password as "Test@1234"
    And Click on register button
    Then verify terms validation message as "You must accept the terms and conditions"
    And close browser

  @Registration
  Scenario: Check validation for Register user with Entering the Wrong OTP
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Test", Lastname as "daspj", Email as "virajtest1@yopmail.com", Dateofbirth as "08121989", phone as "2582582580", username as "Wrongotp1" and password as "Test@1234" and accept T&C
    And Click on register button
    And Enter OTP as "111111"
    And Click on Verify OTP
    Then verify the error toast message as "Invalid OTP."
    And close browser

  @Registration
  Scenario: Check validation for Register user click Resend OTP
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Test", Lastname as "ddas", Email as "virajtest2@yopmail.com", Dateofbirth as "08121989", phone as "2582582581", username as "resendotp1" and password as "Test@1234" and accept T&C
    And Click on register button
    And Click on Resend OTP
    Then verify the toast message as "OTP sent successfully."
    And close browser

  @Registration
  Scenario: Check validation for OTP page
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "Test", Lastname as "Mahta", Email as "virajTest3@yopmail.com", Dateofbirth as "08121989", phone as "2582582258", username as "verifyotp1" and password as "Test@1234" and accept T&C
    And Click on register button
    And Enter OTP as "aaaaaa"
    And Click on Verify OTP
    Then Verify the validation message as "OTP should contain only numbers."
    And close browser

  @Registration
  Scenario: Register with Valid Scenario
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/registration"
    When Enter FirstName as "new", Lastname as "test", Email as "newtest5@yopmail.com", Dateofbirth as "08121989", phone as "8568568555", username as "newtest05" , password as "Test@1234" and accept T&C
    And Click on register button
    And Enter OTP as "123456"
    And Click on Verify OTP
    Then verify Success register toast message as "Registration successful."
    And close browser
