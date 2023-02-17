package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		
		double salary, tax;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario sujeito a imposto: ");
		salary = sc.nextDouble();
		tax = 0;
		
		if (salary > 4500.00) {
			tax = (1000.00 * 0.08) + (1500.00 * 0.18) + (salary - 4500.00) * 0.28;
			System.out.printf("R$: %.2f", tax);
		} else if (salary >= 3000.00) {
			tax = (1000.00 * 0.08) + (salary - 3000.00) * 0.18;
			System.out.printf("R$: %.2f", tax);
		} else if (salary >= 2000.00) {
			tax = (salary - 2000.00) * 0.08;
			System.out.printf("R$: %.2f", tax);
		} else {
			tax = 0.00;
		}
		
		if (tax == 0.00) {
			System.out.println("Isento");
		} else {
			System.out.println("R$ %.2f", imposto);
		}
				
		sc.close();

	}

}
