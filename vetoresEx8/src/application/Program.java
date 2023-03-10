package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		int[] vetor = new int[n];
		
		double soma = 0.0;
		int q = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				q++;
			}
		}
			
		if (soma != 0.0) {
			System.out.printf("MEDIA DOS PARES = %.1f", soma/q);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
