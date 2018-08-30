/**
 * 
 */
package interfaces;

public class MainClass {

	public static void main(String[] args) {

		// get customer example
		//Runner runOne = new Runner();
		//runOne.findCustomer();

		//-----------------------------------
		
		// update customer example
		Runner runTwo = new Runner();
		runTwo.updateCustomer();

		//-----------------------------------
		
		
		
		
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
