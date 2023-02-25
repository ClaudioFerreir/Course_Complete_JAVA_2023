package Entities;

public class Employee {

	public String name;
	public double glossSalary;
	public double tax;
		
	public double netSalary() {
		return glossSalary - tax;
	}
	
	public double increaseSalary(double increase) {
		return (glossSalary - tax) + (glossSalary / increase); 
	}
	
}
