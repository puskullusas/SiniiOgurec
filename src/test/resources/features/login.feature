@sprint1 @Login
Feature: HRMS Loggin in
Description: The purpose of this feature file is to automate HRMS login
to make sure everything works as expected.
# use ctrl+/ to comment all

@smoke
Scenario: HRMS valid login

		Given I opened browser and navigated to the HRMS
    When I enter valid username and valid password
    And I click on login button
    Then I successfully logged in
    And I close browser

@regression
  Scenario: Invalid Login
    Given I opened browser and navigated to the HRMS
    When I enter valid username and invalid password
    And I click on login button
    Then I see error message
    And I close browser

