package com.qa.connecting.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.connecting.exceptions.ConnectionNotMadeException;

public class RemoteDatabaseConnection extends DatabaseConnection {


	public RemoteDatabaseConnection(String user, String password) throws SQLException {
		super(user, password);
	}
	
	public void openConnection() {
		// TO CHANGE SQLEXCEPTION LATER
		try {
			setConnection(DriverManager.getConnection("jdbc:mysql://34.53.233.12:3306/ims?serverTimezone=BST", getUsername(), getPassword()));;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ConnectionNotMadeException("Remote database is not accessible: " + e.getMessage());

		}		
	}

}
