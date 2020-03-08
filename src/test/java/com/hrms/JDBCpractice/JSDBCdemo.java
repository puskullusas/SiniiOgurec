package com.hrms.JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JSDBCdemo {

	String dbUsername="syntax_hrm";
	String dbPasswrd="syntaxhrm123";
	//jdbc:type driver:host:port/name of the db
	String dbURL="jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	
	@Test
	public void getDAtaFromDataBase() throws SQLException{
		//using driver Manager we will getConnection
		Connection connect=DriverManager.getConnection(dbURL, dbUsername, dbPasswrd);
		System.out.println("Connection is created");
		//created statement
		Statement st=connect.createStatement();
		//created resultset
		ResultSet rset=st.executeQuery("select*from ohrm_nationality");
		rset.next();
		String firstRowData=rset.getString("name");
		System.out.println(firstRowData);
		//moves to the next row
		rset.next();
		String secondRowData=rset.getObject("name").toString();//we can use the universal method, if we do not want to specify the type, and store it into String
		System.out.println(secondRowData);
		String data;
		while(rset.next()) {
			data=rset.getObject("name").toString();
			System.out.println(data);
		}
		
		rset.close();
		st.close();
		connect.close();
				
	}
}
