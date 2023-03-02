package Entities;

public class Student {
	
	public String name;
	public double nota1, nota2, nota3;
	
	public double media() {
		return (nota1 + nota2 + nota3) ;
	}
	
	public void result () {
		if (media() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", (60.00 - media()));
		}
	}
	

}
