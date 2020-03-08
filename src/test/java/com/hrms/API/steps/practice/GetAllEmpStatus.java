package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

public class GetAllEmpStatus {
	private static RequestSpecification request;
	private Response response;
	

@Given("user calls get EmployeeStatus Api")
public void user_calls_get_EmployeeStatus_Api() {
  request= given().header("Content-Type","application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
}

@When("user gets Response")
public void user_gets_Response() {
   response=request.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");
}

@Then("Status is {int}")
public void status_is(Integer int1) {
	response.then().assertThat().statusCode(int1);
   
}

@Then("user verifies Statuses")
public void user_verifies_Statuses() {
  System.out.println("This is the response " +response.getBody().asString());
  Assert.assertTrue(response.getBody().asString().contains("Employee Status List"));
}
}
