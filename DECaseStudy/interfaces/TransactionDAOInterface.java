package interfaces;

import java.util.List;
import modelClasses.Transaction;

public interface TransactionDAOInterface {

	public List<Transaction> byZipandDate();
	public List<Transaction> groupByType();
	public List<Transaction> totalsByBranch();
	
}
