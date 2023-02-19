package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class LinhasProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.print(i * i * i);
			System.out.println();
		}
		
		sc.close();
		
	}

}
