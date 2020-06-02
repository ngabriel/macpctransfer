package com.qa.connecting.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DatabaseConnection implements Connectable {

	private Connection connection;
	private String username;
	private String password;
	
	public DatabaseConnection(String username, String password) {
		this.username = username;
		this.password = password;
		openConnection();
	}
	
	public abstract void openConnection();
	
	
	public void closeConnection() {
		// COme back for when exceptions are covered!
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
