Feature: Sign In Feature

	@signUpTestt
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email              | password    | confirmPassword |
      | cap  | capsstone@gmail.com | Capstone@123 | Capstone@123     |
    And User click on SignUp button
    Then User should be logged into account page 
    
    @signInTestt
    Scenario:  Verify user can signIn into Reatil Application
    Given User is on retail website
    When User click on Sign in option
    And user enter email 'capsstone@gmail.com' and password 'Capstone@123'
    And User click on login button
    Then User should be logged in into Account
