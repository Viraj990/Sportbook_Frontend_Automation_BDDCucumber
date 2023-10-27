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
Feature: To check the Basic Deposit and Withdrawal Functionality

  @Deposit
  Scenario: Check deposit and Withdrawal section is open
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    Then Verify the Deposit section is open as "DEPOSITS AND WITHDRAWALS"
    And close browser

  Scenario: Check deposit and Withdrawal URL match
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    Then verify the Deposit page url as "http://onlinegamblingtech.com/user/DepositsAndWithdrawals"
    And close browser

  Scenario: Check clicking on chapa redirect to chapa section
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Deposit
    Then Verify the Chapa Deposit section is open
    And close browser

  Scenario: Check clicking on chapa and validate URL
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Deposit
    Then verify the Deposit URL as "http://onlinegamblingtech.com/user/paymentrequest/chapa_deposit"
    And close browser

  Scenario: Check validation of request amount entering value zero
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Deposit
    When Enter the chapa request amount as "00"
    And Click deposit button
    Then Verify the request amount validation message
    And close browser

  Scenario: Check validation of request amount entering less then min amount i.e 20
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Deposit
    When Enter the chapa request amount as "15"
    And Click deposit button
    Then Verify the request amount validation message
    And close browser

  Scenario: Check validation of request amount without entering deposit amount
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Deposit
    And Click deposit button
    Then Verify the validation message without entering data as "Amount is required"
    And close browser

  Scenario: Check back button functionality on chapa deposit page
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Deposit
    And Click back button
    Then verify the redirection URL as "http://onlinegamblingtech.com/user/DepositsAndWithdrawals"
    And close browser

  Scenario: Check the balance displayed same as actual balance
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Deposit
    Then verify the balance displayed same or not
    And close browser

  Scenario: Check clicking on Santim redirect to santim section
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    Then Verify the santim Deposit section is open
    And close browser

  Scenario: Check clicking on santim and validate URL
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    Then verify the santim Deposit URL as "http://onlinegamblingtech.com/user/paymentrequest/santimpay_deposit"
    And close browser

  Scenario: Check validation of request amount without entering both field
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    And Click santim page deposit button
    Then Verify the validation message of Mobile number as "Phone Number is required" and Amount as "Amount is required"
    And close browser

  Scenario: Check amount field validation with only entering the phonenumber
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    When Enter the mobile number as "911030077"
    And Click santim page deposit button
    Then Verify the validation message of Amount as "Amount is required"
    And close browser

  Scenario: Check Phone field validation with only entering the amount
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    When Enter the santim request amount as "10"
    And Click santim page deposit button
    Then Verify the validation message of Mobile number as "Phone Number is required"
    And close browser

  Scenario: Check validation of request amount entering value zero
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    When Enter the mobile number as "911030077"
    When Enter the santim request amount as "00"
    And Click santim page deposit button
    Then Verify the santim request amount validation message
    And close browser

  Scenario: Check validation of request amount entering less then min amount i.e 10
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    When Enter the mobile number as "911030077"
    When Enter the santim request amount as "09"
    And Click santim page deposit button
    Then Verify the santim request amount validation message
    And close browser

  Scenario: Check back button functionality on santimS deposit page
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim Deposit
    And Click back button
    Then verify the redirection URL as "http://onlinegamblingtech.com/user/DepositsAndWithdrawals"
    And close browser

  @WithDrawal
  Scenario: Check clicking on chapa withdrawal and validate URL
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    Then verify the Chapa Withdrawal URL as "http://onlinegamblingtech.com/user/paymentrequest/chapa_withdraw"
    And close browser

  Scenario: Check validation of withdrawal request amount entering value zero
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "00"
    And Click Withdraw button
    Then Validate the error toast message
    And close browser

  Scenario: Check validation of withdrawal request amount entering value less then min balance
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "15"
    And Click Withdraw button
    Then Validate the error toast message
    And close browser

  Scenario: Check validation of withdrawal request amount without entering the value
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    And Click Withdraw button
    Then Validate the withdrawal validation error message
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality with entering the wrong OTP
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Enter Withdarwal OTP as "111111"
    And Click on Verify withdrawal OTP
    Then Validate the Withdrawal Error toast message as "Invalid OTP."
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality with entering otp as character
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Enter Withdarwal OTP as "aaaaaa"
    And Click on Verify withdrawal OTP
    Then Validate the Withdrawal Error validation message as "OTP should contain only numbers."
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality and resend the OTP
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Click Resend OTP button on Withdrawal Section
    Then Validate the Withdrawal resent OTP success toast message as "OTP sent successfully."
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality and validate the error message of bank validation
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Enter Withdarwal OTP as "123456"
    And Click on Verify withdrawal OTP
    Then Validate the Withdrawal success toast message as "OTP verified successfully."
    And Click submit button of the bank details page
    Then Validate the bank deatils error validation message for account name as "Account name is required", account number as "Account number is required" and Select bank as "Bank is required"
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality and validate the error message of bank validation when entering number in account number
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Enter Withdarwal OTP as "123456"
    And Click on Verify withdrawal OTP
    Then Validate the Withdrawal success toast message as "OTP verified successfully."
    When Enter the account name as "123456"
    And Click submit button of the bank details page
    Then Validate the account name error validation message as "Only alphabetic characters are allowed"
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality and validate the error message of bank validation when entering account number less then min
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Enter Withdarwal OTP as "123456"
    And Click on Verify withdrawal OTP
    Then Validate the Withdrawal success toast message as "OTP verified successfully."
    When Enter the account name as "Test"
    When Enter the account number as "123456"
    And Click submit button of the bank details page
    Then Validate the min account number error validation message as "Account number should have atleast 8 digits"
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality and validate the error message of bank validation when entering account number less then max
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Enter Withdarwal OTP as "123456"
    And Click on Verify withdrawal OTP
    Then Validate the Withdrawal success toast message as "OTP verified successfully."
    When Enter the account name as "Test"
    When Enter the max account number as "1234567890123456789"
    And Click submit button of the bank details page
    Then Validate the max account number error validation message as "Account number should have atleast 18 digits"
    And close browser

  Scenario: Checking the Chapa Withdrawal Functionality
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    When Enter the chapa request amount as "20"
    And Click Withdraw button
    And Enter Withdarwal OTP as "123456"
    And Click on Verify withdrawal OTP
    Then Validate the Withdrawal success toast message as "OTP verified successfully."
    When Enter the account name as "Test"
    When Enter the max account number as "1000418074187"
    And Select the bank as "Commercial Bank of Ethiopia (CBE)"
    And Click submit button of the bank details page
    Then validate the redirection url as "http://onlinegamblingtech.com/user/Transactions"
    And close browser

  Scenario: Check back button functionality on chapa withdarwal page
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the Chapa Withdrawal
    And Click back button
    Then verify the redirection URL as "http://onlinegamblingtech.com/user/DepositsAndWithdrawals"
    And close browser

  Scenario: Check clicking on santim withdrawal and validate URL
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    Then verify the santim Withdrawal URL as "http://onlinegamblingtech.com/user/paymentrequest/santimpay_withdraw"
    And close browser

  Scenario: Check withdarwal validation of request amount without entering both field
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    And Click santim page withdraw button
    Then Verify the validation message of Mobile number as "Phone Number is required" and Amount as "Amount is required"
    And close browser

  Scenario: Check amount field validation with only entering the phonenumber
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    And Click santim page withdraw button
    Then Verify the validation message of Amount as "Amount is required"
    And close browser

  Scenario: Check Phone field validation with only entering the amount
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the santim request amount as "10"
    And Click santim page withdraw button
    Then Verify the validation message of Mobile number as "Phone Number is required"
    And close browser


  Scenario: Check validation of request amount entering value zero
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    When Enter the santim request amount as "00"
    And Click santim page withdraw button
    Then Verify the santim withdrawal request amount validation message
    And close browser

  Scenario: Check validation of request amount entering less then min amount i.e 10
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    When Enter the santim request amount as "09"
    And Click santim page withdraw button
    Then Verify the santim withdrawal request amount validation message
    And close browser

  Scenario: Check validation of request amount entering less then 8 digit mobile number
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "91103007"
    When Enter the santim request amount as "20"
    And Click santim page withdraw button
    Then Verify the santim withdrawal request amount validation error message as "Minimum 9 digits allowed"
    And close browser

  Scenario: Checking the santim Withdrawal Functionality with entering the wrong OTP
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    When Enter the chapa request amount as "20"
    And Click santim page withdraw button
    And Enter Withdarwal OTP as "111111"
    And Click on Verify withdrawal OTP
    Then Validate the santim Withdrawal Error toast message as "Invalid OTP."
    And close browser

  Scenario: Checking the santim Withdrawal Functionality with entering otp as character
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    When Enter the chapa request amount as "20"
    And Click santim page withdraw button
    And Enter Withdarwal OTP as "aaaaaa"
    And Click on Verify withdrawal OTP
    Then Validate the santim Withdrawal Error validation message as "OTP should contain only numbers."
    And close browser

  Scenario: Checking the santim Withdrawal Functionality and resend the OTP
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    When Enter the chapa request amount as "20"
    And Click santim page withdraw button
    And Click Resend OTP button on Withdrawal Section
    Then Validate the santim Withdrawal OTP success toast message as "OTP sent successfully."
    And close browser

  Scenario: Checking the santim Withdrawal Functionality and validate the error message of bank details
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    When Enter the chapa request amount as "20"
    And Click santim page withdraw button
    And Enter Withdarwal OTP as "123456"
    And Click on Verify withdrawal OTP
    Then Validate the santim Withdrawal success toast message as "OTP verified successfully."
    And Click submit button of the santim bank details page
    Then Validate the bank deatils error validation message for Select bank as "Bank is required"
    And close browser

  Scenario: Checking the  Withdrawal Functionality
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    When Enter the mobile number as "911030077"
    When Enter the chapa request amount as "20"
    And Click santim page withdraw button
    And Enter Withdarwal OTP as "123456"
    And Click on Verify withdrawal OTP
    Then Validate the santim Withdrawal success toast message as "OTP verified successfully."
    And Select the santim bank as "Telebirr"
    And Click submit button of the santim bank details page
    Then validate the redirection url as "http://onlinegamblingtech.com/user/Transactions"
    And close browser

  Scenario: Check back button functionality on santim deposit page
    Given User Launch The Chrome Browser
    When User Open URL "http://onlinegamblingtech.com/"
    When user enter Username as "Viraj1" Password as "Abcd@1234"
    And Click on Login button
    When Click profile link
    And Click Deposits and Withdarwal link
    When Click on the santim withdrawal
    And Click back button
    Then verify the redirection URL as "http://onlinegamblingtech.com/user/DepositsAndWithdrawals"
    And close browser

