package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		double sum = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			System.out.print(" ");
			sum += vetor[i];
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f", (sum / vetor.length));
		
		sc.close();
	}

}
