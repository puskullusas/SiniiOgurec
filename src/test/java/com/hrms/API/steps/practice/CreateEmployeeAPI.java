package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//we have to manually import
import static io.restassured.RestAssured.*;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

public class CreateEmployeeAPI {
	private static RequestSpecification request;
	private static Response response;
	
	@Given("user calls createEmployee API")
	public void user_calls_createEmployee_API() {
	    request = given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	//reads JSON file we created for employee creation
	request.body(CommonMethods.readJson("C:/Users/mama/eclipse-workspace/cucumberProject/src/test/resources/JSONFiles/createEmployee.json"));
	}

	@When("user retrieves response")
	public void user_retrieves_response() {
	    response=request.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
	}

	@Then("status code is {int}")
	public void status_code_is(Integer int1) {
		response.then().assertThat().statusCode(int1);
		/*another way
		 * actualStatusCode=response.getStatusCode();
		 * System.out.println("Status code is "+actualStatusCode);
		 * Assert.assertEquals("Status code is not equal to 200', 200,actualStatusCode);
		 */
		
	
	}

	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {
		boolean empCreated=response.getBody().asString().contains("Entry Created");
		Assert.assertTrue("Employee could not be created", empCreated);
		//another assert
		//Assert.assertTrue("Employee could not be created", response.getStatusLine().contains("200 OK"));
		
	}
}
