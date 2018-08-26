package dataAccessObj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import interfaces.*;
import modelClasses.*;

public class TransactionDAOWork implements TransactionDAOInterface{


	Connection connection = null;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/classicmodels?autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASS = "root";

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (connection == null)
				connection = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return connection;
	}
	
	public List<Transaction> byZipandDate()
	{
		/*
		 To display the transactions made by customers living in a given zipcode
		  for a given month and year. Order by day in descending order.
		 */
		
		List<Transaction> transactions = new LinkedList<Transaction>();
		
		
		
		
		return transactions;
	}
	
	public List<Transaction> groupByType()
	{
		/*
		 To display the number and total values of transactions for a given type.
		 */
		
		List<Transaction> transactions = new LinkedList<Transaction>();
		
		
		
		return transactions;
	}
	
	public List<Transaction> totalsByBranch()
	{
		/*
		  To display the number and total values of transactions for branches in a given state
		 */
		
		List<Transaction> transactions = new LinkedList<Transaction>();
		
		
		
		return transactions;
	}
	

	public void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			// do nothing
		}
	}
}
