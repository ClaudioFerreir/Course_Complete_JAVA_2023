package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MediaFor {

	public static void main(String[] args) {
		
		double valor, soma = 0, media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de casos que vem a seguir: ");
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++ ) {
			System.out.print("Digite um valor real: ");
			valor = sc.nextDouble();
			if (i == 0) {
				soma += valor * 2;
			} else if (i == 1) {
				soma += valor * 3;
			} else {
				soma += valor * 5;
			}
		}
		
		media = soma / 10;
		
		System.out.printf("%.1f", media);
		
		sc.close();

	}

}
