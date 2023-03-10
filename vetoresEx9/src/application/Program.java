package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] vetorNomes = new String[n];
		int[] vetorIdades = new int[n];
		
		for (int i = 0; i < vetorNomes.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			vetorNomes[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdades[i] = sc.nextInt();
		}
		
		int idadeMaior = vetorIdades[0];
		String nomeMaisVelho = "";
		for (int i = 0; i < vetorIdades.length; i++) {
			if (idadeMaior < vetorIdades[i]) {
				idadeMaior = vetorIdades[i];
				nomeMaisVelho = vetorNomes[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
		
		sc.close();
	}

}
