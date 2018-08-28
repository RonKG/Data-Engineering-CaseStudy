package interfaces;

import modelClasses.Customer;

public interface CustomerDAOInterface {

	public Customer getCustomer(int ssn);
	public int updateCustomer(Customer customer);	
}
