@smoke
Feature: Complete Web Form

  As a user
  I want to fill in the complete web form
  So that I can submit my details successfully

  Scenario Outline: Submit the complete web form with different valid users
    Given I am on the Formy home page
    When I navigate to the Complete Web Form page
    And I fill in the form with the following details
      | firstName | lastName | jobTitle |
      | <first>   | <last>   | <job>    |
    And I submit the form
    Then the form should be submitted successfully

    Examples:
      | first | last  | job            |
      | Adam  | Tokus   | AI Engineer    |
      | Yavuz  | Tokus | Test Automation|
