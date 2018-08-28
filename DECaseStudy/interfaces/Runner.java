package interfaces;

import java.util.Scanner;

import dataAccessObj.CustomerDAOImplementation;
import modelClasses.Customer;

public class Runner {

	// get customer example
	public void findCustomer() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a SSN to Get Customer Record: ");
		int userIn = sc.nextInt(); // CHECK FOR INTEGER -- EXCEPTION
		CustomerDAOImplementation getCust = new CustomerDAOImplementation();
		System.out.println(getCust.getCustomer(userIn) + "\n");
		sc.close();		
	}
	
	// update customer example
	public void updateCustomer() {		
		CustomerDAOImplementation updateCust = new CustomerDAOImplementation();
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a SSN to Update Customer Record: ");
		int ssn = sc.nextInt();
		
		String input = null;
		do {
			System.out.println("Enter a Field # to Change or press Q to quit ");
			System.out.println("#1 - Apartment number");
			System.out.println("#2 - Street name");
			System.out.println("#3 - City");
			System.out.println("#4 - State");
			System.out.println("#5 - Country");
			System.out.println("#6 - Zipcode");
			System.out.println("#7 - Phone number");
			System.out.println("#8 - Email");
			
			input = sc.nextLine().toString().toLowerCase();
			
			switch(input) {
			case "1":
				System.out.println("enter new apartment #: ");
				customer.setAptNumber(sc.nextLine());
				break;
			case "2":
				System.out.println("enter new street name: ");
				customer.setStreetName(sc.nextLine());
				break;
			case "3":
				System.out.println("enter new city: ");
				customer.setCity(sc.nextLine());
				break;
			case "4":
				System.out.println("enter new State: ");
				customer.setState(sc.nextLine());
				break;
			case "5":
				System.out.println("enter new country: ");
				customer.setCountry(sc.nextLine());
				break;
			case "6":
				System.out.println("enter new zipcode: ");
				customer.setZipcode(sc.nextLine());
				break;
			case "7":
				System.out.println("enter new phone number: ");
				customer.setPhoneNumber(Integer.getInteger(sc.nextLine()));
				break;
			case "8":
				System.out.println("enter new email address: ");
				customer.setEmail(sc.nextLine());
				break;
			default:
					System.out.println("Invalid input");
					break;
			}
			customer.setSsn(ssn);
			
			updateCust.updateCustomer(customer);
		}		
		while ( input != "q");
		
		
		sc.close();		
		
		
	}
}