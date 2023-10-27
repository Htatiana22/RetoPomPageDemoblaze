
Feature: Log in with a registered account
  As user
  I want to enter the demoblaze page
  To login with a valid account

  @SuccessfulLogin
  Scenario: Log In demoblaze page
    Given The user open demoblaze page
    When The user selects the login option
    Then The user can login successfully
