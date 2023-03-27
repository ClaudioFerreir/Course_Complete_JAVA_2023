package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println(cli);
		
		/*System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		date = sc.nextLine();
		System.out.println("Enter order data:");
		System.out.print("Status: ");*/
		
		
		sc.close();
	}

}
