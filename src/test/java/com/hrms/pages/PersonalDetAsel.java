package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.testbase.BaseClass;

public class PersonalDetAsel {
	@FindBy(id = "empPic")
	public WebElement empPicture;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement nameOnPicture;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement empId;

	@FindBy(id = "btnSave")
	public WebElement edit_saveBtn;
	
	 @FindBy(xpath = "//input[@name='personal[optGender]']")
	  public List<WebElement> gender;
	 
	 @FindBy(xpath="//label[contains(@for, 'personal_optGender')]")
		public List<WebElement> genderLabels;

	public PersonalDetAsel() {
		PageFactory.initElements(BaseClass.driver, this);
}
}
