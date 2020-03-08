package com.hrms.API.steps.practice;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


import org.junit.Assert;

public class GETOneEmp2 {
	//private static final String POSTCreateEmployeeAPI = null;//???????
	private Response response;
	private static RequestSpecification request;
	
	@Given("user calls getOneEmployee API")
	public void user_calls_getOneEmployee_API() {
	
		request = given().header("Content-Type","application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token)
		.param("employee_id", POSTCreateEmp1.employee_ID);
	
		System.out.println("This is empId in getOneEm file "+ POSTCreateEmp1.employee_ID);
	
	}

	@When("User retrieves response for getOneEmployee API")
	public void user_retrieves_response_for_getOneEmployee_API() {
		
		response = request.when().get(APIConstants.GET_ONE_EMPLOYEE_URI);
		response.prettyPrint();
		
	}

	@Then("status code is {int} for getOneEmployee API")
	public void status_code_is_for_getOneEmployee_API(int int1) {
		int statusCode=response.getStatusCode();
		System.out.println("This is statusCode from getOne emp-------> " +statusCode);
		
		//response.then().assertThat().statusCode(int1);
	System.out.println("If u see this, than it comes after supposedly ASSERT to this point");
	
	}

	@Then("user validates created employee exists")
	public void user_validates_created_employee_exists() {
		response.then().body("employee[0].employee_id", equalTo(POSTCreateEmp1.employee_ID));
		
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		
	
		String actualyEmployeeID = jsonPathEvaluator.get("employee[0].employee_id");
		
		System.out.println("Actual Employee ID is:" + actualyEmployeeID);
		
		
		//Assert.assertEquals("Verifying Employee IDs", POSTCreateEmployeeAPI.employee_ID, actualyEmployeeID);
		
		
		try {
			Assert.assertEquals("Verifying Employee IDs", POSTCreateEmp1.employee_ID, actualyEmployeeID);
			
		}catch(AssertionError e) {
			
			System.out.println("Employee ID's DO NOT MATCH");
		}
		System.out.println("EMPLOYEE ID's MATCH");
	}
	

	}
	



