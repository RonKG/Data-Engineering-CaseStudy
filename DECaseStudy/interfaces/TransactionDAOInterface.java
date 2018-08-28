package interfaces;

import java.util.List;

import dataAccessObj.TransactionDAOImplementation.Temp;
import modelClasses.Transaction;

public interface TransactionDAOInterface {

	public List<Temp> byZipandDate(int ZipCode, int month, int year);
	public List<Transaction> totalsByBranch();
	public List<Transaction> viewSelectDates(String startDate, String endDate);
	public void  groupByType(String s);
	public List<Transaction>getMonthlyBill(int month, int year, int ssn);
	
}

