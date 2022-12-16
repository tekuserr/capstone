Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And user enter email 'capsstone@gmail.com' and password 'Capstone$123'
    And User click on login button
    Then User should be logged in into Account

  @Test1
  Scenario: Verify user can update profile Information
    When User click on Account option
    And User update name 'Capstone' and phone '421-555-4200'
    And User click on Update button
    Then user profile information should be updated

  @Test2
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | Capstone#123     | Capstone$123 | Capstone$123    |
    And User click on Change Password button
    Then a message should be displayed'Password Updated Successfully'

  @Test3
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567890987422 | Panther    |              12 |           2026 |          541 |
    And User click on Add Your card button
    Then a message should displayed Payment Method added successfully

  @Test4
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Master Card link
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6676888844441111 | Panther    |              11 |           2027 |          511 |
    And User click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully

  @Test5
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on Master Card link
    And User click on remove option of card section
    Then payments details should be removed

  @Test6
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName                       | phoneNumber | streetAddress    | apt | city       | state    | zipCode |
      | United States | wawPracticeisGettingtheconcept |  4442200011 | 18 birmingham st | 240 | Airlington | Maryland |   67542 |
    And User click Add Your Address button
    Then a message should be displayed Address Added Successfully

  @Test7
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName  | phoneNumber | streetAddress | apt | city         | state    | zipCode |
      | United States | tekSchool |  5715557711 | 12 fall st    | 201 | Falls church | Virginia |   33442 |
    And user click Update Your Address button
    Then a message should be displayed 'Address Updated Successfully'
    
    @Test8
    Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
    
