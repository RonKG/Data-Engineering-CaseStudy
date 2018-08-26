package interfaces;

import java.util.List;
import modelClasses.Customer;

public interface CustomerDAOInterface {

	public Customer getCustomer(int ssn);
	public int updateCustomer(Customer customer);
	public List<Customer> getMonthlyBill();
	public List<Customer> viewSelectDates();
	
}
