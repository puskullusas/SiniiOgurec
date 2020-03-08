package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashboardPage;

import com.hrms.pages.LoginPage;
import com.hrms.pages.PersonalDetailsPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReaderAsel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmplSteps extends CommonMethods {
	AddEmployeePage addEmpPg;
	LoginPage logginPg;
	DashboardPage dashPg;
	PersonalDetailsPage pdPage;

	String emplId;
	String employeeIDValue;

	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
		logginPg = new LoginPage();
		logginPg.login(ConfigsReaderAsel.getProperty("username"), ConfigsReaderAsel.getProperty("password"));
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
		dashPg = new DashboardPage();
		dashPg.navigateToAddEmployee();
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and(String fName, String mName, String lName) {
		addEmpPg = AddEmployeePage.getInstance();//instead of constructor new, we use method
		sendText(addEmpPg.empFName, fName);
		sendText(addEmpPg.middleName, mName);
		sendText(addEmpPg.empLName, lName);
		emplId = addEmpPg.empId.getText();// id from AddEmplPage!!!no text actually
		employeeIDValue = addEmpPg.empId.getAttribute("value");//value from ID
		System.out.println("Employee ID is now: " + emplId);
		
		System.out.println("Employee ID VALUE is : " + employeeIDValue);
		System.out.println("*************************************");

	}

	@When("I click Save bttn")
	public void i_click_Save_bttn() {
		click(addEmpPg.btnSave);
	}

	@Then("I see the Employee has been added")
	public void i_see_the_Employee_has_been_added() {
		pdPage = new PersonalDetailsPage();

		Assert.assertEquals("Employee is NOT added", pdPage.idWindw.getText(), emplId);
		System.out.println("Employee with ID#: " + pdPage.idWindw.getText() + "added successfully!");

	}
//veryfiying employee with id
	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String fName, String mName, String lName) {
		PersonalDetailsPage pdPage = new PersonalDetailsPage();
		String expected = pdPage.picText.getText();
		String actual = fName + " " + mName + " " + lName;
		Assert.assertEquals("Name does NOT MATCH", expected, actual);
		System.out.println("Employee with " + fName + " " + mName + " " + lName + " is added!HURRAAH");
		
		System.out.println("The text inside the id Window is: " + pdPage.idWindw.getText());
		System.out.println("Employee ID VALUE is : " + pdPage.idWindw.getAttribute("value"));
	}

	@When("I delete employee id")
	public void i_delete_employee_id() {
		addEmpPg.empId.clear();
	}

	@When("I click Save")
	public void i_click_Save() {
		addEmpPg.btnSave.click();
	}

	@Then("I see employee without employee id is being added")
	public void i_see_employee_without_employee_id_is_being_added() {
		pdPage = new PersonalDetailsPage();
		Assert.assertNotEquals(null, pdPage.idWindw.getText());
		System.out.println("The text inside the id Window is: " + pdPage.idWindw.getText());
	}
}