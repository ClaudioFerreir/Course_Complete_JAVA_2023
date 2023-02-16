package descomplica_faculdade;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = teclado.nextInt();
		
		System.out.println(valor/2);
		System.out.println(valor%2);

		teclado.close();
	}

}
