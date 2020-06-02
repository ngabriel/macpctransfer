package com.qa.connecting;

import java.sql.SQLException;

import com.qa.connecting.exceptions.ConnectionNotMadeException;

public class Runner {
	public static void main(String[] args) {
		Ims ims = new Ims();
		ims.start();
	}
		
}
