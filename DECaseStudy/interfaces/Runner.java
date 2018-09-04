package interfaces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import dataAccessObj.CustomerDAOImplementation;
import dataAccessObj.TransactionDAOImplementation;
import modelClasses.Customer;
import modelClasses.Transaction;
import modelClasses.Zipcodes;

public class Runner {

	public static Scanner sc = new Scanner(System.in);

	public void findCustomer() {

		// get customer example
		System.out.println("Enter a SSN to Get Customer Record: ");
		int userIn = sc.nextInt(); // CHECK FOR INTEGER -- EXCEPTION

		CustomerDAOImplementation getCust = new CustomerDAOImplementation();
		System.out.println(getCust.getCustomer(userIn) + "\n");
		sc.close();

	}

	public void updateCustomer() {
		CustomerDAOImplementation custDao = new CustomerDAOImplementation();
		Customer customer = new Customer();
		System.out.println("Enter a SSN to update a Customer Record: ");
		int ssn = sc.nextInt();
		customer.setSsn(ssn);

		while (true) {
			System.out.println();
			System.out.println("Enter the correct # to update OR press 'Q' to quit ");
			System.out.println("#1 - Apartment number");
			System.out.println("#2 - Street name");
			System.out.println("#3 - City");
			System.out.println("#4 - State");
			System.out.println("#5 - Country");
			System.out.println("#6 - Zipcode");
			System.out.println("#7 - Phone number");
			System.out.println("#8 - Email");
			System.out.println(" Q - to save and exit program");
			System.out.println();

			String input = sc.next();
			System.out.println("You entered: " + input);

			switch (input) {
			case "1":
				System.out.println("enter new apartment #: ");
				String apt = sc.next();
				custDao.updateApt(apt, ssn);
				System.out.println("apartment number updated...");
				break;
			case "2":
				System.out.println("enter new street name: ");
				String street = sc.next();
				custDao.updateStreet(street, ssn);
				System.out.println("street name updated...");
				break;
			case "3":
				System.out.println("enter new city: ");
				String city = sc.next();
				custDao.updateCity(city, ssn);
				System.out.println("city updated..");
				break;
			case "4":
				System.out.println("enter new State: ");
				String state = sc.next();
				custDao.updateState(state, ssn);
				System.out.println("state updated...");
				break;
			case "5":
				System.out.println("enter new country: ");
				String country = sc.next();
				custDao.updateCountry(country, ssn);
				System.out.println("country updated...");
				break;
			case "6":
				System.out.println("enter new zipcode: ");
				String zip = sc.next();
				custDao.updateZip(zip, ssn);
				System.out.println("zipcode updated...");
				break;
			case "7":
				System.out.println("enter new phone number: ");
				String phone = sc.next();
				custDao.updatePhone(phone, ssn);
				System.out.println("phone number updated...");
				break;
			case "8":
				System.out.println("enter new email address: ");
				String email = sc.next();
				custDao.updateEmail(email, ssn);
				System.out.println("email updated...");
				break;
			case "q":
			case "Q":
				System.out.println("program closing..");
				System.out.println("-----------------------------------\n" + "------- UPDATED TABLE RECORD ------");
				System.out.println(custDao.getCustomer(ssn) + "\n");
				return;
			default:
				System.err.println("Invalid input. Try again!!");
			}

		}

	}

	public void fetchCategoryTotals() {

		TransactionDAOImplementation groupCust = new TransactionDAOImplementation();

		while (true) {
			System.out.println();
			System.out.println("Pick a Categoryto view totals OR press 'Q' to quit ");
			System.out.println("#1 - Bills");
			System.out.println("#2 - Education");
			System.out.println("#3 - Entertainment");
			System.out.println("#4 - Gas");
			System.out.println("#5 - Grocery");
			System.out.println("#6 - Healthcare");
			System.out.println("#7 - Test");
			System.out.println(" Q - to save and exit program");
			System.out.println();

			String input = sc.next();
			System.out.println("You entered: " + input);
			System.out.println("-------- TRANSACTION GROUP --------");
			System.out.println("");

			switch (input) {
			case "1":
				String bills = "Bills";
				groupCust.groupByTransactionType(bills);
				break;
			case "2":
				String education = "Education";
				groupCust.groupByTransactionType(education);
				break;
			case "3":
				String entertainment = "Entertainment";
				groupCust.groupByTransactionType(entertainment);
				break;
			case "4":
				String gas = "Gas";
				groupCust.groupByTransactionType(gas);
				break;
			case "5":
				String grocery = "Grocery";
				groupCust.groupByTransactionType(grocery);
				break;
			case "6":
				String healthcare = "Healthcare";
				groupCust.groupByTransactionType(healthcare);
				break;
			case "7":
				String test = "Test";
				groupCust.groupByTransactionType(test);
				break;
			case "Q":
			case "q":
				System.out.println("program closing....");
				return;
			default:
				System.err.println("Invalid input. Try again!!");

			}
		}

	}

	public void fetchMonthlyBill() {

		TransactionDAOImplementation monthBill = new TransactionDAOImplementation();

		System.out.println("\nPress ENTER to get MONTHLY BILL\n     \n            Q to quit   \n ");
		String s = sc.nextLine();

		if (s.equals("")) {

			System.out.println();
			System.out.println("Enter __CUSTOMER SSN #__");
			String ssn = sc.next();
			System.out.println("Enter __MONTH #__");
			int month = sc.nextInt();
			System.out.println("Enter __ YEAR #__");
			int year = sc.nextInt();
			System.out.println("");

			List<Transaction> transactions = monthBill.getMonthlyBill(month, year, Integer.parseInt(ssn));
			transactions.get(1).printBillHeader();
			for (int i = 0; i < transactions.size(); i++) {
				transactions.get(i).printBillRange();

			}

		}
		if (s.equalsIgnoreCase("q")) {
			System.out.println("      !!!  Program Exit  !!!");
			return;
		}
	}

	public void viewTransactionsInDateRange() {

		TransactionDAOImplementation betweenDates = new TransactionDAOImplementation();

		System.out.println("\nPress ENTER to fetch transaction range");
		System.out.println("\n                Q to quit   \n ");
		String s = sc.nextLine();

		if (s.equals("")) {

			System.out.println();
			System.out.println("Enter __CUSTOMER SSN #__");
			String ssn = sc.next();
			System.out.println("----------------------------------");
			System.out.println("| Required DATE format: YYYY-MM-DD |");
			System.out.println("----------------------------------");
			System.out.println("Enter______First Date String____");
			String first = sc.next();
			System.out.println("Enter______Second Date String____");
			String second = sc.next();
			System.out.println("");

			// TEST VALUES: 2018-02-12, 2018-03-13, 123452072
			List<Transaction> btwnDates = new LinkedList<Transaction>();
			btwnDates = betweenDates.viewSelectDates(first, second, ssn);
			btwnDates.get(1).printBillHeader();
			btwnDates.get(1).toString();
			for (int i = 0; i < btwnDates.size(); i++) {
				btwnDates.get(i).printBillRange();
			}

		}
		if (s.equalsIgnoreCase("q")) {
			System.out.println("      !!!  Program Exit  !!!");
			return;
		}

	}

	public void viewTransactionsInAZipcode() {

		TransactionDAOImplementation zips = new TransactionDAOImplementation();
		System.out.println("\n           Press Enter  \n\n__To View Transactions In Zipcode__\n");
		String s = sc.nextLine();

		if (s.equals("")) {

			System.out.println("   Enter Zipcode Number   ");
			int zip = sc.nextInt();
			System.out.println("   Enter Month (MM)   ");
			int month = sc.nextInt();
			System.out.println("   Enter Year (YYYY)   ");
			int year = sc.nextInt();
			System.out.println("");

			// test --> WHERE CUST_ZIP = 39120 AND MONTH = 2 AND YEAR = 2018
			List<modelClasses.Zipcodes> zipcodes = zips.byZipandDate(zip, month, year);
			Zipcodes zipcode = new Zipcodes();
			zipcode.printZipHeader();
			for (int i = 0; i < zipcodes.size(); i++) {
				zipcodes.get(i).printZipRange();
			}

		}
		if (s.equalsIgnoreCase("q")) {
			System.out.println("      !!!  Program Exit  !!!");
			return;
		}

	}

	public void viewCountbyTotalbyBranchesbyState() {

		TransactionDAOImplementation branches = new TransactionDAOImplementation();
		String state = null;

		do {
			System.out.println("\n             ___ Enter State Abbreviation (**)___");
			state = sc.nextLine();
			System.out.println("\n");
			System.out.println("to view Transactions for Branches in Zipcode by State__\n");
			System.out.println("                      \"Q\" to quit!");
			System.out.println("You entered " + state.toUpperCase() + " ");
			System.out.println(branches.totalsByBranch(state.toUpperCase()));

		} while (!state.equalsIgnoreCase("q"));
		System.out.println("Program Exit....");
	}
}
