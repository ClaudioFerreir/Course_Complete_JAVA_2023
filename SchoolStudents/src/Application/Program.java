package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Student's name: ");
		student.name = sc.nextLine();
		System.out.print("Student's nota1: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Student's nota2: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Student's nota3: ");
		student.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.media());
		student.result();
		
		sc.close();
	}

}
