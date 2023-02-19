package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class DivisoresFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro para calcularmos os divisores: ");
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i --) {
			if (n % i == 0) {
				System.out.println(n / i);
			}
		}
		
		sc.close();
	}

}
