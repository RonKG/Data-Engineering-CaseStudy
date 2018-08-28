/**
 * 
 */
package interfaces;

import java.util.List;

import dataAccessObj.CustomerDAOImplementation;
import dataAccessObj.TransactionDAOImplementation;
import dataAccessObj.TransactionDAOImplementation.Temp;
import modelClasses.Customer;
import modelClasses.Transaction;

public class MainClass {

	public static void main(String[] args) {

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

		// group by type
		TransactionDAOImplementation groupCust = new TransactionDAOImplementation();
		groupCust.getConnection();
		groupCust.groupByType("Education");
		groupCust.closeConnection();

		// monthly bill
		TransactionDAOImplementation monthBill = new TransactionDAOImplementation();
		monthBill.getConnection();
		List<Transaction> transactions = monthBill.getMonthlyBill(2, 3, 123456100);
		transactions.get(1).printBillHeader();
		for (int i = 0; i < transactions.size(); i++) {
			transactions.get(i).printBillRange();
		}

		// view select dates
		TransactionDAOImplementation betweenDates = new TransactionDAOImplementation();
		betweenDates.getConnection();
		List<Transaction> btwnDates = betweenDates.viewSelectDates("1-1-2018", "1-1-2018");
		btwnDates.get(1).printBillHeader();
		for (int i = 0; i < btwnDates.size(); i++) {
			//btwnDates.get(i).printBillRange();
		}
		
		// view transactions in zipcode
		TransactionDAOImplementation zipcodes = new TransactionDAOImplementation();
		zipcodes.getConnection();
		List<Temp> temp = zipcodes.byZipandDate(39120, 1, 2);
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(temp.get(i));
		}
				
	}

}
