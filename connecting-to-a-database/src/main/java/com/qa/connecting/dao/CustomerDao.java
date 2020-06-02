package com.qa.connecting.dao;

import java.sql.SQLException;

import com.qa.connecting.model.Customer;

public class CustomerDao {

	private DatabaseConnection databaseConnection;

	public CustomerDao(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void insertCustomer(Customer customer) {
		String sql = "insert into customers(name, email, address) values ('" + customer.getName() + "', '"
				+ customer.getEmail() + "', '" + customer.getAddress() + "');";

		databaseConnection.sendUpdate(sql);
	}

}
