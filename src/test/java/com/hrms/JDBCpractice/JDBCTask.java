package com.hrms.JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCTask {
	
String userName="syntax_hrm";
String Password="syntaxhrm123";
String url="jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";

@Test
public void getDBData() throws SQLException{
	
	Connection connect=DriverManager.getConnection(url, userName, Password);
	Statement stmnt=connect.createStatement();
	ResultSet rset=stmnt.executeQuery("select* from ohrm_job_title");
	//store in array
	List<String> l= new ArrayList<String>();
//	String jobT;
	while(rset.next()) {
//		jobT=rset.getObject("job_title").toString();
//		l.add(jobT);
		//another way
		l.add(rset.getString("job_title"));
	}//to retrieve data 
	for (String data:l) {
	System.out.println(data);
}
		rset.close();
		stmnt.close();
		rset.close();
}
}
