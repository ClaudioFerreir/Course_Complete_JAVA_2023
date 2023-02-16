package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		
		int num;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
