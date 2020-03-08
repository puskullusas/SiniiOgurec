package com.hrms.JDBCpractice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {
	String userName="syntax_hrm";
	String Password="syntaxhrm123";
	String url="jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";

	@Test
	public void getMetadata() throws SQLException {
		Connection c= DriverManager.getConnection(url, userName, Password);
		DatabaseMetaData dbData=c.getMetaData();
		String dbName=dbData.getDatabaseProductName();
		String dbVersion=dbData.getDatabaseProductVersion();
		
		System.out.println(dbName);
		System.out.println(dbVersion);
		
		//get info about result table, using results of Metadata. we have to get object of the result set
		Statement st=c.createStatement();
		ResultSet rset=st.executeQuery("select *from hs_hr_employees where emp_number=4353;");
		
		ResultSetMetaData resultData=rset.getMetaData();
		int cols=resultData.getColumnCount();
		System.out.println(cols);
		
		String colname=resultData.getColumnName(1);
		System.out.println(colname);
		//in resultset index starts with 1, so we will need to put <= to retrieve the last value
		for(int i=1; i<=cols;i++) {
			String columnName=resultData.getColumnName(i);
			System.out.println(columnName);
		}
		
		
		
}
}