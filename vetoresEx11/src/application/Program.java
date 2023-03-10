package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int n;
			System.out.println("Quantas pessoas serao digitadas? ");
			n = sc.nextInt();
			
			double[] vetorAltura = new double[n];
			char[] vetorGenero = new char[n];
			
			for (int i = 0; i < vetorGenero.length; i++) {
				System.out.print("Altura da " + (i+1) + "a pessoa: ");
				vetorAltura[i] = sc.nextDouble();
				System.out.print("Genero da " + (i+1) + "a pessoa: ");
				vetorGenero[i] = sc.next().charAt(0);
			}
			
			double maior_altura = 0.0;
			double menor_altura = 0.0;
			int total_female = 0;
			for (int i = 0; i < vetorAltura.length; i++) {
				if (vetorAltura[i] > maior_altura) {
					maior_altura = vetorAltura[i];
				} 
				
				if (vetorAltura[i] < menor_altura) {
					menor_altura = vetorAltura[i];
				}
				
				if (vetorGenero[i] == 'F') {
					total_female++;
				}
			}
			
			sc.close();
	}

}
