package curso_programacao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int A, B, C, D;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		A = sc.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		B = sc.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		C = sc.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		D = sc.nextInt();
		
		System.out.println("DIFERENÇA: " + (A * B - C * D));

		sc.close();
	}

}
