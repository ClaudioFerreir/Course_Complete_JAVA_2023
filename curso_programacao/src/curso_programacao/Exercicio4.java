package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int id, hr; 
		double pay_hour, salary; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu ID - funcionario: ");
		id = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		hr = sc.nextInt();
		System.out.println("Digite o valor pago por hora: ");
		pay_hour = sc.nextDouble();
		salary = hr * pay_hour;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();

	}

}
