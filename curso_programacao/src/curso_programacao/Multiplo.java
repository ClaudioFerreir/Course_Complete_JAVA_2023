package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		
		int A, B;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		A = sc.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();

	}

}
