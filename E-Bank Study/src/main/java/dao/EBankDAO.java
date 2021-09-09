package dao;

import com.model.Customer;
import com.model.Transaction;

public interface EBankDAO {

	int register(Customer customer);
	
	int login(Customer customer);
	
	int addMoney(Transaction transaction);
	
}
