package com.hrms.utils;

public class APIConstants {
	
	public static final String CREATE_EMP_URI="http://54.167.125.15/syntaxapi/api/createEmployee.php";
	
	public static final String DELETE_EMPLOYEE_URI="http://54.167.125.15/syntaxapi/api/deleteEmployee.php";
	
	public static final String PUT_UPDATE_EMPLOYEE_URI = "http://54.167.125.15/syntaxapi/api/updateEmployee.php";
	
	public static final String GET_ONE_EMPLOYEE_URI = "http://54.167.125.15/syntaxapi/api/getOneEmployee.php";	
	
	public static final String CREATE_EMP_JSON= System.getProperty("user.dir")+ "/src/test/resources/JSONFiles/createEmployee.json";
	
	public static final String UPDATE_EMP_JSON=System.getProperty("user.dir")+ "/src/test/resources/JSONFiles/UpdateEmployee.json";
	
	public static final String GENERATE_TOKEN=System.getProperty("user.dir")+ "/src/test/resources/JSONFiles/generateToken.json";
	
	
	
}
