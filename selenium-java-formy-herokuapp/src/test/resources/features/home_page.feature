@smoke
Feature: Formy Home Page

  Scenario: Verify home page loads successfully
    Given I am on the Formy home page
    Then the page header should be "Welcome to Formy"

  Scenario: Navigate to Complete Web Form page
    Given I am on the Formy home page
    When I navigate to the Complete Web Form page
    Then the page header should be "Complete Web Form"
