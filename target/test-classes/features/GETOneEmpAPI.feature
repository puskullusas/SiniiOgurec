@F2
Feature: Validating Syntax /getOneEmployee.php HRMS API
Background: 
  Given user generates token
  
@APITEST1
Scenario: Retrieving created Employee using /getOneEmployee.php API
Given user calls getoneEmployee API
When User retrieves response 

Then status code will be 200

Then user validates created Employee exists