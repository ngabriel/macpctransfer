package com.qa.connecting.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LocalDatabaseConnection  extends DatabaseConnection{

	public LocalDatabaseConnection(String user, String password) throws SQLException {
		super(user, password);
	}
	
	public void openConnection()  {
		// TO CHANGE FOR SQL EXCEPTION
		try {
			setConnection(DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ims?serverTimezone=BST", getUsername(), getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}



}
