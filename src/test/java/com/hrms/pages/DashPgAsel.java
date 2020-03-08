package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashPgAsel extends CommonMethods {
	@FindBy(linkText = "Leave")
	public WebElement leaveLnk;

	@FindBy(linkText = "Leave List")
	public WebElement leaveList;

	@FindBy(linkText = "PIM")
	public WebElement pim;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmp;

	@FindBy(id = "welcome")
	public WebElement welcomeLnk;

	public DashPgAsel() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToLeaveList() {
		jsClick(leaveLnk);
		jsClick(leaveList);
	}

	public void navigateToAddEmployee() {
		jsClick(pim);
		jsClick(addEmp);
	}
	
}
