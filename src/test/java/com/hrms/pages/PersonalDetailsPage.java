package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPage {
	@FindBy(id="empPic")
	public WebElement empPicture;
	//TExt on the picture
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement picText;
	//ID window
	@FindBy(id="personal_txtEmployeeId")
	public WebElement idWindw;
	
	//drivers licence
	@FindBy (id = "personal_txtLicenNo")
	public WebElement licence;
	//SSN
	@FindBy (id = "personal_txtNICNo")
	public WebElement ssn;
	//SIN
	@FindBy (id = "personal_txtSINNo")
	public WebElement sin;
	//Gender RADIO male
	@FindBy(id = "personal_optGender_1")
	public WebElement male;
	//Gender RADIO female
	@FindBy(id = "personal_optGender_2")
	public WebElement female;
	
	 @FindBy(xpath = "//input[@name='personal[optGender]']")
	  public List<WebElement> gender;
	
	public PersonalDetailsPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
