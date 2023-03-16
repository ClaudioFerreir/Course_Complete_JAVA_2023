package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer id_employee = sc.nextInt();
		
		Object name = ((Object) list.stream().filter(x -> x.getId() == id_employee));
		System.out.println(name);
		
		ArrayList<Employee> result = (ArrayList<Employee>) list.stream().filter(x -> x.getId() == id_employee).collect(Collectors.toList());
		for (Employee x : result) {
			System.out.println(x);
		} 
		
		for (Object x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
