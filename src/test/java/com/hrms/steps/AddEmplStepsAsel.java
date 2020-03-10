package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.pages.AddEmpPgAsel;
import com.hrms.pages.DashPgAsel;
import com.hrms.pages.LogPgAsel;
import com.hrms.pages.PersonalDetAsel;
import com.hrms.pages.PersonalDetailsPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReaderAsel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmplStepsAsel extends CommonMethods {
	LogPgAsel login;
	AddEmpPgAsel addEmp;
	String empId;
	DashPgAsel dashboard;
	PersonalDetAsel pdetails;
	PersonalDetailsPage pDetails;

	@Given("I logged into HRMS")
	public void i_am_logged_into_HRMS() {
		login = new LogPgAsel();
		dashboard = new DashPgAsel();
		addEmp = new AddEmpPgAsel();
		pdetails = new PersonalDetAsel();
		pDetails = new PersonalDetailsPage();
		
		login.login(ConfigsReaderAsel.getProperty("username"), ConfigsReaderAsel.getProperty("password"));
	}

	@Given("I navigated to Add Empl Page")
	public void i_navigated_to_Add_Employee_Page() {
		
		dashboard.navigateToAddEmployee();
	}

//	@When("I add {string}, {string} and {string}")
//	public void i_add_and_(String fName, String mName, String lName) {
//		sendText(addEmp.firstName, fName);
//		sendText(addEmp.middleName, mName);
//		sendText(addEmp.lastName, lName);
//		empId = addEmp.empId.getText();
	//}

	@When("I clicked Save")
	public void i_click_Save() {
		click(addEmp.saveBtn);
	}

//	@Then("I see Employee has been succesfully added")
//	public void i_see_Employee_has_been_succesfully_added() {
//		
//		Assert.assertEquals("Employee is NOT being added", pdetails.empId.getText(), empId);
//	}

//	@Then("I see Employee with {string}, {string} and {string} is displayed")
//	public void i_see_Employee_with_and_is_displayed(String string, String string2, String string3) {
//
//	}
	
	@When("I enter employee details")
	public void i_enter_employee_details(DataTable empDetails) {
				//key	//value
		List<Map<String, String>> empDetailList=empDetails.asMaps();
		
		for(Map<String, String> map:empDetailList) {
			sendText(addEmp.firstName, map.get("FirstName"));
			sendText(addEmp.middleName, map.get("MiddleName"));
			sendText(addEmp.lastName, map.get("LastName"));
		}
	}
	//no need to click on edit, since we doing it in for loop
//	@When("I click on Edit")
//	public void clickOnEdit_SaveButton() {
//		click(pdetails.edit_saveBtn);
//	}
	
	@Then("I am able to modify Employee Details")
	public void modifyEmployeeDetails(DataTable modifyEmpDetail) throws InterruptedException {
		//added by me HAVE TO FINISH THE WHOLE TABLE THING
		//List<Map<String, String>> modifyList=modifyEmpDetail.asMaps();
		//		for(Map<String, String> map:modifyList) {
//		sendText(pDetails.licence, map.get("DriverLisence"));
//		sendText(pDetails.ssn, map.get("SSN"));
//		sendText(pDetails.sin, map.get("SIN"));
//		//selecting gender button
//		if(map.get("Gender").equalsIgnoreCase("male")) {
//			pDetails.male.click();
//		}else {
//			pDetails.female.click();
//		}
//		//
//		
//	}		
		//ASEL SOLUTIOn
		List<Map<String, String>> modifyList=modifyEmpDetail.asMaps();
		for(Map<String, String> map:modifyList) {
			//click on edit
			click(pdetails.edit_saveBtn);
						//passing new details to the employee
			sendText(pDetails.licence, map.get("DriverLisence"));
			//sendText(pDetails.ssn, map.get("SSN"));
			//sendText(pDetails.sin, map.get("SIN"));
			clickRadio(pdetails.genderLabels, map.get("Gender"));
//			selectDdValue(pdetails.maritalStatus, map.get("MaritalStatus"));
//			selectDdValue(pdetails.nationality, map.get("Nationality"));
//			sendText(pdetails.DOB, map.get("DOB"));
//			
//			//click on save
			click(pdetails.edit_saveBtn);
			Thread.sleep(3000);
		}
		
	}
}
