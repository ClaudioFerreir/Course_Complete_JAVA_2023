package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A, B, C, pi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva uma medida: ");
		A = sc.nextDouble();
		System.out.println("Escreva uma medida: ");
		B = sc.nextDouble();
		System.out.println("Escreva uma medida: ");
		C = sc.nextDouble();
		
		pi = 3.14159;
		
		System.out.println("Area das figuras geometricas de acordo com as medidas");
		System.out.printf("TRIANGULO: %.3f%n", ((A * C) / 2));
		System.out.printf("CIRCULO: %.3f%n", (pi * C * C));
		System.out.printf("TRAPEZIO: %.3f%n", (((A + B) * C) / 2));
		System.out.printf("QUADRADO: %.3f%n", (B * B));
		System.out.printf("RETANGULO: %.3f%n", (A * B));
		
		sc.close();
	}

}
