package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		String name, email;
		Date date;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product("TV", 1000.0);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		date = sc.nextLine();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		
		

	}

}
