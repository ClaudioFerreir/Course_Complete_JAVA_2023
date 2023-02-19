package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ValoresIntervaloFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de numeros inteiros: ");
		int n = sc.nextInt();
		int in = 0, out = 0;
		
		for (int i = 0; i < n; i++ ) {
						
			System.out.print("Digite um numero inteiro: ");
			int x = sc.nextInt();
		
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
		}
	
	}


