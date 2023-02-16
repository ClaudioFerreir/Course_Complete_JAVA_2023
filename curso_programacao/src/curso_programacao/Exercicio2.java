package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double r, a, PI = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
				
		r = teclado.nextDouble();
		
		a = PI * r * r;
		
		System.out.printf("A área do circulo é %.4f%n", a);
		
		teclado.close();

	}

}
