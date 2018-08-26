/**
 * 
 */
package interfaces;

import dataAccessObj.CustomerDAOImplementation;
import modelClasses.Customer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get customer example
		CustomerDAOImplementation getCust = new CustomerDAOImplementation();
		getCust.getConnection();
		getCust.getCustomer(123456100);
		System.out.println(getCust.getCustomer(123456100) + "\n");
		getCust.closeConnection();
		
		
		
		// update customer example
		CustomerDAOImplementation updateCust = new CustomerDAOImplementation();
		Customer cust1 = new Customer();		
		cust1.setFirstName("Jane");
		cust1.setLastName("Doe");
		cust1.setAptNumber("Blue#");
		cust1.setSsn(123453023);
		
		updateCust.getConnection();
		updateCust.updateCustomer(cust1);
		updateCust.closeConnection();
		
		// get monthly bill
		
		
	}

}
