package textbook;

import java.util.ArrayList;

/*
 * Our ATM class is just an ArrayList with a couple of Account-specific methods
 */
@SuppressWarnings("serial")
public class ATM extends ArrayList<Account> {
	
	/**
	 * checks if account with given id is in the list
	 * 
	 * @param id the id to check
	 * @return true if this list contains the account with given id
	 */
	public boolean hasAccountId(int id){
		for(Account account : this){
			if (account.getId() == id){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * gets the account by the id
	 * 
	 * @param id the id to get
	 * @return the account associated with the id
	 */
	public Account getAccountById(int id){
		for(Account account : this){
			if (account.getId() == id){
				return account;
			}
		}
		return null;
	}
}
