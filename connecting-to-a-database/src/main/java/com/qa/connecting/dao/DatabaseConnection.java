package com.qa.connecting.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	private Connection connection;

	public DatabaseConnection(String user, String password) throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ims", user, password);
	}

	public void closeConnection() throws SQLException {
		connection.close();
	}

	public ResultSet sendQuery(String sql) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		statement.close();
		return resultSet;
	}
	
	public void sendUpdate(String sql) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		statement.close();
	}

}
