package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
		}
		
		double sumAltura = 0.0;
		int menor16 = 0;
		for (int i = 0; i < alturas.length; i++) {
			sumAltura += alturas[i];
			if (idades[i] < 16) {
				menor16++; 
			}
		}
		
		System.out.printf("Altura média: %.2f%n", (sumAltura/alturas.length));
		double percMenor16 = menor16/(idades.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f", percMenor16*100);


		
	}

}
