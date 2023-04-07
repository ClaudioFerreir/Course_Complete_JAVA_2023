package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
	}

}
