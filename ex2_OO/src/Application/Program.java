package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Employee's name: ");
		employee.name = sc.nextLine();
		System.out.println("Gloss salary: ");
		employee.glossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		System.out.print("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		System.out.println("Updated data: " + employee.name + ", $ " 
		+ String.format("%.2f", employee.increaseSalary(increase)));
		
		sc.close();
	}

}
