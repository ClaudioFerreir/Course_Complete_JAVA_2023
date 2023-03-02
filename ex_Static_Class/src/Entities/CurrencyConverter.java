package Entities;

public class CurrencyConverter {
	
	public static final double TAX = 0.06;
	
	public static double conversao (double price, double quantity) {
		return (price * (quantity + quantity * TAX));
	}
	

}
