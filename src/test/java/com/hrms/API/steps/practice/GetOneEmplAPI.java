package com.hrms.API.steps.practice;

import cucumber.api.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Assert;


public class GetOneEmplAPI {
	
	private static RequestSpecification request;
	private static Response response;
	String getOneEmp = "http://54.167.125.15/syntaxapi/api/getOneEmployee.php?employee_id=06929A";
	
	@Given("user calls getoneEmployee API")
	public void user_calls_getOneEmployee_API() {
	    
	    request = given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	    		//we can add parameters here 
	    		//.param("employee_id", "06929A");
	    
	}

	@When("User retrieves response")
	public void user_retrieves_response() {
		response=request.when().get(getOneEmp);
		
		System.out.println("1.This is requested info " +response.asString());
		System.out.println("***********************");
		
	}
	@Then("status code will be {int}")
	public void status_code_is(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}
	@Then("user validates created Employee exists")
	public void user_validates_created_employee_exists() {
	   boolean existingEmp=response.getBody().asString().contains("06929A");
	   Assert.assertTrue(existingEmp);
	   System.out.println("Congrats, your employee is here :---> " +"\n" + response.getBody().asString());
		
	}
}
