@sprint2 @addemployee
Feature: Add Employee

  Background: 
    Given I logged into HRMS
    And I navigated to Add Empl Page

  @smoke
  Scenario: Add and Modify Employee Details
    When I enter employee details
      | FirstName | MiddleName | LastName |
      | MAri      | J          | Louisa   |
    # | Kori      | Man        | Lobster  |
    And I clicked Save
    #And I click on Edit removed, because using in for loop
    Then I am able to modify Employee Details
      | DriverLisence | ExpirationDate | SSN         | SIN  | Gender | MaritalStatus | Nationality | DOB        |
      |     098766432 | 2021-12-09     | xox-45-6789 | blob | Male   | Other         | Afghan      | 1980-10-10 |
      |     756483909 | 2018-12-09     | xxx-45-6789 | blab | Female | Single        | Burmese     | 1980-10-10 |
