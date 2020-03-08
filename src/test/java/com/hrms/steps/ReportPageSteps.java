package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.DashboardPage;
import com.hrms.pages.ReportPage;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportPageSteps extends CommonMethods {
	 DashboardPage dash;
	 ReportPage rep;
	 
	@Given("I navigated to the Reports Page")
	public void i_navigated_to_the_Reports_Page() throws InterruptedException {
	    dash = new DashboardPage();
	    dash.navigateToReportsPage();
	    Thread.sleep(2000);
	}
//scenario with invalid report
	@When("I enter invalid report")
	public void i_enter_invalid_report() {
		rep = new ReportPage();
	   rep.searchWndw.sendKeys("sdfsdf");
	 	    
	}

	@When("I click search button")
	public void i_click_search_button() {
	   click(rep.searchBtn);
	}

	@Then("I see no record found message")
	public void i_see_no_record_found_message() {
		//rep = new ReportPage();
		String reportText = rep.noRecord.getText();
		System.out.println("This is the message: " + reportText);
	}
//another scenario with valid report, we have to instantiate obj again
	@When("I enter valid report")
	public void i_enter_valid_report() {
		rep = new ReportPage();
		rep.searchWndw.sendKeys("Candidates");
	}

	@Then("I see the search report is displayed")
	public void i_see_the_search_report_is_displayed() {
		String expected = "Candidates";
		String actualreportText = rep.ReportResultName.getText();
		Assert.assertEquals(expected,actualreportText);
		System.out.println("I see report named: " + actualreportText);
	}

}

