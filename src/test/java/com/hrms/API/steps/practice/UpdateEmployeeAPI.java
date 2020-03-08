package com.hrms.API.steps.practice;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;//do not forget for given etc inside requests..

import org.junit.Assert;

public class UpdateEmployeeAPI {
	private static RequestSpecification request;
	private static Response response;

	public static Object employee_ID;
	
	@Given("user calls updateEmployee API")
	public void user_calls_updateEmployee_API() {
		
		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthenticationSteps.Token);
		// reads JSON file (the body that will be used to update emp) 
		request.body("employee_id"+":"+employee_ID+"\n"+CommonMethods.readJson(APIConstants.CREATE_EMP_JSON));
		

	}
	//we sending the request to put/update data, but at the same time we storing it in response?
	@When("user sends the request of updated employee")
	public void user_sends_the_request_of_updated_employee() {
		response=request.put(APIConstants.PUT_UPDATE_EMPLOYEE_URI);
		response.prettyPrint();
	}
	
	@Then("user validates status code is {int}")
	public void user_validates_status_code_is(Integer int1) {
	    //getting status code
		int statusCode = response.getStatusCode();
		System.out.println("THE STATUS CODE IS:-----> "+statusCode);
		//validating code
		response.then().assertThat().statusCode(int1);
		
	}
	@Then("user validates employee is updated")
	public void user_validates_employee_is_updated() {
		//getting partial value of the body
		String Body=response.getBody().asString();
		System.out.println("This is UPDATED INFO "+ Body);
//		boolean updatedEmployee=response.getBody().asString().contains("Mishutka");
//		Assert.assertTrue("Employee could not be updated", updatedEmployee);
	
		
	}
}
