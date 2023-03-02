package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will you be bought? ");
		double quantity = sc.nextDouble();
		
		double reais = CurrencyConverter.conversao(price, quantity);
		
		System.out.printf("Amout to be paid in reais = %.2f%n", reais);
		
		sc.close();
	}

}
