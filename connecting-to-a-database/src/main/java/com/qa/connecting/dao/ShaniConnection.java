package com.qa.connecting.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.qa.connecting.exceptions.ConnectionNotMadeException;

public class ShaniConnection extends DatabaseConnection{

	public ShaniConnection(String username, String password) {
		super(username, password);
	}

	@Override
	public void openConnection() {
		// TO DO SQL EXECEPTIONS LATER
		try {
			setConnection(DriverManager.getConnection("mysql://94.76.82.60", getUsername(), getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ConnectionNotMadeException("Shani has blocked you: " + e.getMessage());

		}
	}

}
