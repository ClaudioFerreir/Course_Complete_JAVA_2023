package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int cod1, n1, cod2, n2;
		double valor_unit1, valor_unit2, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo da peça 1: ");
		cod1 = sc.nextInt();
		System.out.println("Digite o numero de peças cod " + cod1);
		n1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 1: ");
		valor_unit1 = sc.nextDouble();
		
		System.out.println("Digite o codigo da peça 2: ");
		cod2 = sc.nextInt();
		System.out.println("Digite o numero de peças cod " + cod2);
		n2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 2: ");
		valor_unit2 = sc.nextDouble();
		
		total = (n1 * valor_unit1) + (n2 * valor_unit2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		
	}

}
