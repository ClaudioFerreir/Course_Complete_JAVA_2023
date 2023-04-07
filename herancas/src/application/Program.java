package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAcount;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
	}

}
