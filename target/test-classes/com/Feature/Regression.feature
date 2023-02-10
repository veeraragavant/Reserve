
@Regression
Feature: For Automating Adactin Website

Background: To Launch the Adactin Website

Given User Launching the Chrome Browser
And   User Entering Adacting Website URL "http://adactinhotelapp.com/"
Given User Entering the Username "Veeraragavmsd7"
And   User Entering the Password "veera@123"
And   User Clicking the Login Button

  
  @TC-101
  Scenario: User Logging in Adactin
    
    Then  User Selecting Location of the Hotel
    And   User Selecting the Hotel
    And   User Selecting the Toom Type
    And   User Selecting No of Rooms
    And   User Selecting Checkin and Checkout Date
    Then  User Verifying Error Message "Check-In Date shall be before than Check-Out Date"
    
  @TC-104   
  Scenario: User Validating Test Case 104

   Then   User Selecting Location of the Hotel
    And   User Selecting the Hotel
    And   User Selecting the Toom Type
    And   User Selecting No of Rooms
    And   User Selecting Checkin Date
    And   User Selecting Checkout Date
    And   User Selecting No of Adults
    And   User Selecting No of Childs
    And   User Clicking Search Button
    Then  User Verifying Hotel Name Displayed in Hotel Form as "Sydney"
    
    @TC-110
    Scenario: User Verifying Payment Details
    
    Then  User Selecting the Generated Form
    And   User Verifying the Total Amount
    
    @TC-120
    Scenario: User Validating each Webpages
    Then   User Selecting Location of the Hotel
And   User Selecting the Hotel
And   User Selecting the Toom Type
And   User Selecting No of Rooms
And   User Selecting Checkin Date
And   User Selecting Checkout Date
And   User Selecting No of Adults
And   User Selecting No of Childs
And   User Clicking Search Button
  Then User getting first webpage title
    And User getting second Webpage title

