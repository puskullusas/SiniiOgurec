package com.hrms.API.steps.practice;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetAllEmpAPI {
	private static RequestSpecification request;
	private static Response response;
	
	@Given("user calls getALLEmployee API")
	public void user_calls_getALLEmployee_API() {
		request = given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}
	@When("user retrieves Response")
	public void user_retrieves_Response() {
	   response= request.when().get("http://54.167.125.15/syntaxapi/api/getAllEmployees.php");
	}

	@Then("status is {int}")
	public void status_is(Integer int1) {
		System.out.println("This is STATUS CODE: " +response.getStatusCode());
	   response.then().assertThat().statusCode(int1);
	}

	@Then("i see all employees")
	public void i_see_all_employees() {
		Assert.assertTrue("This table does not contain this string", response.getBody().asString().contains("06973A"));
	    System.out.println(response.getBody().asString().contains("06973A"));
}
}
