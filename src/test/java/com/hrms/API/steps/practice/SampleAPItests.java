package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class SampleAPItests {
	
	//@Test
//	public void getAllJobTitles() {
//		Response response = RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzMxNzksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODM3OSwidXNlcklkIjoiMjMzIn0.6N9LS1hEjcncycyshtMFrGCGSHCqLHuEt-MPIBtmqCY")
//		.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");
//		
//		response.prettyPrint();
//		int actualResponseCode = response.getStatusCode();
//		System.out.println(actualResponseCode);
//	}
		@Test
		public void oneEmployee() {
			Response respOneEmp= RestAssured.given().param("employee_id","3552" ).contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzY0NTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU5MTY1MCwidXNlcklkIjoiMjMzIn0.UXvVwuz8ZfoZdKUxKdvp1A9re6lDAzIptlw7JjYZC7s")
			.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
			
		respOneEmp.prettyPrint();
		
		}
//		@Test
//		public void createEmployee(){
//			Response respOneEmp= RestAssured.given()
//					.param("emp_firstname", "Tsatsikis")
//					.param("emp_lastname", "Greek")
//					.param("emp_middle_name", "")
//					.param("emp_gender", "1")
//					.param("emp_birthday", "1983-12-12")
//					.param("emp_status", "Employee")
//					.param("emp_job_title", "Developer")
//					.contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzY0NTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU5MTY1MCwidXNlcklkIjoiMjMzIn0.UXvVwuz8ZfoZdKUxKdvp1A9re6lDAzIptlw7JjYZC7s")
//					.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
//			
//			respOneEmp.prettyPrint();
//			int actual=respOneEmp.getStatusCode();
//			Assert.assertEquals(200, actual);
//		}
		@Test
		public void getAllEmployees() {
			
		}
			
}
