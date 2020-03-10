package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.DashboardPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends CommonMethods {

	LoginPage loggin;
	@Given("I opened browser and navigated to the HRMS")
	public void i_opened_browser_and_navigated_to_the_HRMS() {
	  //  setUp();//we have this method in hooks
		
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
	   loggin=new LoginPage();
	   
	   sendText(loggin.username,"Admin");
	   sendText(loggin.password, "Hum@nhrm123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	   click(loggin.loginBtn);
		
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
		DashboardPage dash = new DashboardPage();
		String expected = "Welcome Admin";
		String actual = dash.welcome.getText();
	    Assert.assertEquals(expected, actual);
	    System.out.println("Welcome to Admin Dashboard,login successful" );
	}

	@Then("I close browser")
	public void i_close_browser() {
	  //  tearDown();//we have this method in hooks
		
	}

//	@When("I enter valid username and invalid password")
//	public void i_enter_valid_username_and_invalid_password() {
//		loggin = new LoginPage();
//			sendText(loggin.username,"Admin");
//		   sendText(loggin.password, "Syntax");
//	}
//
//	@Then("I see error message")
//	public void i_see_error_message() {
//	    boolean error = loggin.errorMsg.isDisplayed();
//	    Assert.assertTrue("Error message is not displayed", error);
//	    System.out.println("You entered invalid Credentials!");
//	    System.out.println("This is the message displayed:-> " +loggin.errorMsg.getText());
//	}
}
