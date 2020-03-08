@F6
Feature: Validating Syntax HRMS 

 Background:
 Given user generates token
 @APITEST1
  Scenario: This test will check to see all employees list
    Given user calls getALLEmployee API
    When user retrieves Response
    Then status is 200
    Then i see all employees
    
