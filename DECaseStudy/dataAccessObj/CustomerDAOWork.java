package dataAccessObj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import interfaces.CustomerDAOInterface;
import modelClasses.Customer;

public class CustomerDAOWork implements CustomerDAOInterface{

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
	
	
	
	public Customer getCustomer() {		
		/*
		 To check the existing account details of a customer.
		 */
		
		return null;
	}
	
		
	public void updateCustomer() {
			/*
			 To modify the existing account details of a customer
			 */
		
		
		}
		
		
	public List<Customer> getMonthlyBill(){
		/*
		 To generate monthly bill for a credit card number 
		 for a given month and year.
		 */
		List <Customer> monthlyBill = new LinkedList<Customer>();

		
		
		return monthlyBill;
		
	}
	
	public List<Customer> viewSelectDates(){
		
		/*
		 To display the transactions made by a customer between two dates. 
		 Order by year, month, and day in descending order.
		 */
		
		return null;
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



	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
