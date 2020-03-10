package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmployeePage {
//last name window
@FindBy(id="lastName")
	public WebElement empLName;
//middle name window
@FindBy(id="middleName")
public WebElement middleName;
//first name window
@FindBy(id ="firstName")
public WebElement empFName;

//save button
@FindBy(id="btnSave")
public WebElement btnSave;
//employee Id
@FindBy(id = "employeeId")
public WebElement empId;





//add pageFactory!!! 
//applying Singleton pattern, we don't need to create an obj everytime, we call this constructor
private static AddEmployeePage instance;
private AddEmployeePage (){
	PageFactory.initElements(BaseClass.driver, this); 
}
public static AddEmployeePage getInstance() {
	if (instance==null) {
		instance = new AddEmployeePage();
	}
	return instance;
}

	public void addNewEmployee (String firstName, String midName, String lastName ) {
		CommonMethods.sendText(empFName, firstName);
		CommonMethods.sendText(middleName, midName);
		CommonMethods.sendText(empLName, lastName);
		CommonMethods.click(btnSave);
	}

}