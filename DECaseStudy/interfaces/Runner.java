package interfaces;

import java.util.Scanner;

import dataAccessObj.CustomerDAOImplementation;
import modelClasses.Customer;

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
			System.out.println("Enter the correct # to update OR press 'Q' to quit ");
			System.out.println("#1 - Apartment number");
			System.out.println("#2 - Street name");
			System.out.println("#3 - City");
			System.out.println("#4 - State");
			System.out.println("#5 - Country");
			System.out.println("#6 - Zipcode");
			System.out.println("#7 - Phone number");
			System.out.println("#8 - Email");
			System.out.println(" Q - to exit program");

			String input = sc.next();
			System.out.println("You entered: " + input);

			switch (input) {
			case "1":
				System.out.println("enter new apartment #: ");
				String apt = sc.next();
				customer.setAptNumber(apt);
				break;
			case "2":
				System.out.println("enter new street name: ");
				String street = sc.next();
				customer.setStreetName(street);
				break;
			case "3":
				System.out.println("enter new city: ");
				String city = sc.next();
				customer.setCity(city);
				break;
			case "4":
				System.out.println("enter new State: ");
				String state = sc.next();
				customer.setState(state);
				break;
			case "5":
				System.out.println("enter new country: ");
				String country = sc.next();
				customer.setCountry(country);
				break;
			case "6":
				System.out.println("enter new zipcode: ");
				String zip = sc.next();
				customer.setZipcode(zip);
				break;
			case "7":
				System.out.println("enter new phone number: ");
				int phone = Integer.parseInt(sc.next());
				customer.setPhoneNumber(phone);
				break;
			case "8":
				System.out.println("enter new email address: ");
				String email = sc.next();
				customer.setEmail(email);
				break;
			case "q":
			case "Q":
				System.out.println("You choose to quit. Program exiting.....");
				return;
			default:
				System.out.println("invalid input. Try again!!");
			}
			custDao.updateCustomerD(customer);

		}

	}

}
