package com.qa.connecting;

import java.sql.SQLException;

import com.qa.connecting.dao.CustomerDao;
import com.qa.connecting.dao.DatabaseConnection;
import com.qa.connecting.model.Customer;
import com.qa.connecting.utils.Input;

public class Ims {

	Input input = new Input();

	public void start() throws SQLException {

		System.out.println("Database username: ");
		String user = input.getInput();
		System.out.println("Database password: ");
		String password = input.getInput();

		DatabaseConnection connection = new DatabaseConnection(user, password);

		
		// Below needs to be similar to Garage project
		// where different type of objects can be built and different inputs are required
		// --------------------------
		System.out.println("customer name:");
		String name = input.getInput();

		System.out.println("customer email:");
		String email = input.getInput();

		System.out.println("customer address:");
		String address = input.getInput();

		Customer customer = new Customer(name, email, address);
		// ----------------------------
		
		// With the object send it to the Dao and have it do the rest
		CustomerDao customerDao = new CustomerDao(connection);
		customerDao.insertCustomer(customer);
		
		// DONT FORGET TO CLOSE OFF CONNECTIONS
		connection.closeConnection();
	}
}
