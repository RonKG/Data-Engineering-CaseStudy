package dataAccessObj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerDAOWork {

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
	
	
	
	public void listCustomerDetails() {
		/*
		 To check the existing account details of a customer.
		 */
		
		
	}
	
		
	public void customerDetails() {
			/*
			 To modify the existing account details of a customer
			 */
		
		
		}
		
		
	public void generateMonthlyBill(){
		/*
		 To generate monthly bill for a credit card number 
		 for a given month and year.
		 */
		
		
	}
	
	public void showTransactionsBetweenDates(){
		/*
		 To display the transactions made by a customer between two dates. 
		 Order by year, month, and day in descending order.
		 */
		
		
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
