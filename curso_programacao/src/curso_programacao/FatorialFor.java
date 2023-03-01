package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class FatorialFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o numero da qual desejamos ver o fatorial: ");
		int x = sc.nextInt();
		
		int multi = 1;
		
		for (int i = x; i > 0; i--) {
			multi *= i;
			if (x == 0) {
				multi = 1;
			}
		}
		
	System.out.println(multi);
	
		sc.close();

	}

}
