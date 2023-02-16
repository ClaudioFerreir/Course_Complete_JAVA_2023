package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char c;
		
		x = sc.next();
		y = sc2.nextInt();
		z = sc3.nextDouble();
		c = sc4.next().charAt(0);
		
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou o numero inteiro: " + y);
		System.out.printf("Voce digitou o numero float: %.2f", z);
		System.out.println("Voce digitou a letra: " + c);
		
		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();

	}
	
}
