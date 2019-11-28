Feature: Login AWS
  Login to AWS

  Scenario: Automate the login form AWS
    Given I Navigate to http://aws.amazon.com/en/
    And I go to Menu: My Account > Account Settings
    And I enter the user deazoft@gmail.com and password XXXXX
    Then the page have a element id ap_password