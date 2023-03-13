package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		//problema com a insercao de nome e sobrenome separado por espaco
		String[] vetorNomes = new String[n]; 
		double[] vetorNota1 = new double[n];
		double[] vetorNota2 = new double[n];
		
		for (int i = 0; i < vetorNomes.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			vetorNomes[i] = sc.next();
			vetorNota1[i] = sc.nextDouble();
			vetorNota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < vetorNomes.length; i++) {
			media = (vetorNota1[i] + vetorNota2[i])/2;
			if (media >= 6.0) {
				System.out.println(vetorNomes[i]);
			}
		}
		sc.close();
	}

}
