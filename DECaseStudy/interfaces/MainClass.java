/**
 * 
 */
package interfaces;

public class MainClass {

	public static void main(String[] args) {

//		// get customer example
//		Runner rn1 = new Runner();
//		rn1.findCustomer();

		// update customer example
//		CustomerDAOImplementation updateCust = new CustomerDAOImplementation();
//		Customer cust1 = new Customer();
//		
//		cust1.setAptNumber("Blue#");
//		cust1.setCity("Chicago");
//		cust1.setSsn(123453023);
//		updateCust.updateCustomer(cust1);
		
		Runner rn2 = new Runner();
		rn2.updateCustomer();

		
		
		
		/*
		// group by type
		TransactionDAOImplementation groupCust = new TransactionDAOImplementation();
		groupCust.groupByType("Education");

		// monthly bill
		TransactionDAOImplementation monthBill = new TransactionDAOImplementation();
		List<Transaction> transactions = monthBill.getMonthlyBill(2, 3, 123456100);
		transactions.get(1).printBillHeader();
		for (int i = 0; i < transactions.size(); i++) {
			transactions.get(i).printBillRange();
		}

		// view select dates
		TransactionDAOImplementation betweenDates = new TransactionDAOImplementation();
		List<Transaction> btwnDates = betweenDates.viewSelectDates("1-1-2018", "1-1-2018");
		btwnDates.get(1).printBillHeader();
		for (int i = 0; i < btwnDates.size(); i++) {
			// btwnDates.get(i).printBillRange();
		}

		// view transactions in zipcode
		TransactionDAOImplementation zips = new TransactionDAOImplementation();
		List<modelClasses.Zipcodes> zipcodes = zips.byZipandDate(39120, 2, 2018);
		Zipcodes zipcode = new Zipcodes();
		zipcode.printZipHeader();
		for (int i = 0; i < zipcodes.size(); i++) {
			zipcodes.get(i).printZipRange();
		}

		// number and total values of transactions for branches in a given state
		TransactionDAOImplementation branches = new TransactionDAOImplementation();
		System.out.println(branches.totalsByBranch("TX").toString());

		*/
	}
}
