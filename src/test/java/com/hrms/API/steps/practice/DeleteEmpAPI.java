package com.hrms.API.steps.practice;

import cucumber.api.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

public class DeleteEmpAPI {
	
	private static RequestSpecification request;
	private Response response;
	String emp_ID="06936A";
	String deleteEmpHTTP = "http://54.167.125.15/syntaxapi/api";
	
	@Given("user calls deleteEmployee API")
	public void user_calls_deleteEmployee_API() {
		request = given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token)
				.param("employee_id", emp_ID);
	}

	@When("user sends the request of delete employee")
	public void user_sends_the_request_of_delete_employee() {
	    response=request.when().delete(deleteEmpHTTP+"/deleteEmployee.php");
	}
	
	@Then("user validates status code of deleted employee is {int}")
	public void user_validates_status_code_of_deleted_employee_is(Integer int1) {
		int statuscode=response.getStatusCode();
		System.out.println("Your StatusCODE is "+ statuscode);
	    response.then().assertThat().statusCode(int1);
	}
	
	@Then("user validates employee is deleted")
	public void user_validates_employee_is_deleted() {
	Assert.assertTrue(response.getBody().asString().contains("Entry deleted"));
	System.out.println("Entry deleted SUCCESSFULLY");
	}
}
