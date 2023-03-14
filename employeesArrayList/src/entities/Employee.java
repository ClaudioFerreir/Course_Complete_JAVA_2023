package entities;

public class Employee {
	
	private Integer Id;
	private String Name;
	private Double Salary;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double salary) {
		Id = id;
		Name = name;
		Salary = salary;
	}
	public Integer getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return Id + ", " + Name + ", " + Salary;
	}
	
	
	

}
