@F1
Feature: Validating Syntax HRMS APIs

  Background: 
  Given user generates token

@APITEST1
  Scenario: This test will check to see if an Employee is created
    Given user calls createEmployee API
    When user retrieves response
    
    Then status code is 200
    
    Then user validates employee is created
