package application;

import java.util.Locale;

import entities.BusinessAcount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		BusinessAcount conta = new BusinessAcount(4568, "Claudio ferreira", 4000.00, 2000.00); 
	}

}
