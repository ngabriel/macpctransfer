package com.qa.connecting.dao;

import java.sql.SQLException;

// only abstract methods
public interface Connectable {
	
	public void openConnection();
	
	public void closeConnection();

}

//real and abstract methods
//public abstract class Connectable {
//
//public abstract void openConnection();
//
//public abstract void closeConnection();
//
//}
