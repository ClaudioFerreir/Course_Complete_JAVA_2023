package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro e diremos se ele é negativo ou não");
		int num = sc.nextInt();
		
		//FUNCAO TERNARIA
		//System.out.println((num < 0) ? "NEGATIVO" : "NAO NEGATIVO");		
		
		//FUNCAO NORMAL
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();	
	}
}
