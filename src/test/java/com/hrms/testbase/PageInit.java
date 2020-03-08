package com.hrms.testbase;

import com.hrms.pages.AddEmpPgAsel;
import com.hrms.pages.DashPgAsel;
import com.hrms.pages.LogPgAsel;
import com.hrms.pages.PersonalDetAsel;


public class PageInit extends BaseClass {

	protected static LogPgAsel login;
	protected static DashPgAsel dashboard;
	protected static AddEmpPgAsel addEmp;
	protected static PersonalDetAsel pdetails;
	//method to initialize objects of pages
	public static void initializeAllPage() {

		login = new LogPgAsel();
		dashboard = new DashPgAsel();
		addEmp = new AddEmpPgAsel();
		pdetails = new PersonalDetAsel();
	}
}

