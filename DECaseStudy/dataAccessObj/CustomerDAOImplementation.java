package dataAccessObj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import interfaces.CustomerDAOInterface;
import modelClasses.Customer;

public class CustomerDAOImplementation implements CustomerDAOInterface {

	static final String JDBC_DRIVER = 
			"com.mysql.jdbc.Driver";
	private static final String DB_URL = 
			"jdbc:mysql://localhost/cdw_sapp?autoReconnect=true&useSSL=false";
	private static final String USER = 
			"root";
	private static final String PASS = 
			"root";
	private static final String FIND_BY_SSN = 
			"SELECT * FROM cdw_sapp_customer WHERE SSN=?";
	private static final String UPDATE = 
			"UPDATE cdw_sapp_customer SET FIRST_NAME=?, LAST_NAME=?, APT_NO=? WHERE SSN=?";
	Connection connection = null;


	public Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			if (connection == null)
				connection = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return connection;
	}

	public Customer getCustomer(int ssn) {
		/*
		 * To check the existing account details of a customer.
		 */

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnection();
			stmt = conn.prepareStatement(FIND_BY_SSN);
			stmt.setInt(1, ssn);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Customer customer = new Customer();
				customer.setSsn(rs.getInt("SSN"));
				customer.setFirstName(rs.getString("FIRST_NAME"));
				customer.setLastName(rs.getString("LAST_NAME"));
				customer.setCcNumber(rs.getString("CREDIT_CARD_NO"));
				customer.setAptNumber(rs.getString("APT_NO"));
				customer.setStreetName(rs.getString("STREET_NAME"));
				customer.setCity(rs.getString("CUST_CITY"));
				customer.setState(rs.getString("CUST_STATE"));
				customer.setCountry(rs.getString("CUST_COUNTRY"));
				customer.setZipcode(rs.getString("CUST_ZIP"));
				customer.setEmail(rs.getString("CUST_EMAIL"));
				customer.setPhoneNumber(rs.getInt("CUST_PHONE"));
				customer.setLastUpdated(rs.getString("LAST_UPDATED"));

				return customer;

			} else {
				return null;
			}
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public int updateCustomer(Customer customer) {
		/*
		 * To modify the existing account details of a customer
		 */

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnection();
			stmt = conn.prepareStatement(UPDATE);

			stmt.setString(1, customer.getFirstName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getAptNumber());
			stmt.setLong(4, customer.getSsn());

			System.out.println("User with SSN # " + customer.getSsn()
					+ " was updated in DB \nwith following details where not \n (NULL means not updated): \n"
					+ customer.toString() + "\n");

			return stmt.executeUpdate();

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
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
