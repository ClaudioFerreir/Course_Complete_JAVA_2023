package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		double price;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------MENU----------------");
		System.out.println("CODIGO-----ESPECIFICACAO-----PREÇO-");
		System.out.println("-----------------------------------");
		System.out.println(" 1       Cachorro Quente    R$ 4.00");
		System.out.println(" 2              X-Salada    R$ 4.50");
		System.out.println(" 3               X-Bacon    R$ 5.00");
		System.out.println(" 4       Torrada simples    R$ 2.00");
		System.out.println(" 5          Refrigerante    R$ 1.50");
		System.out.println("-----------------------------------");
		System.out.println("Digite o codigo do item desejado: ");
		int item = sc.nextInt();
		System.out.println("Digite a quantidade do item: ");
		int quant = sc.nextInt();
		price = 0;
		
		switch(item) {
		case 1:
			price = 4.00;
			break;
		case 2:
			price = 4.50;
			break;
		case 3:
			price = 5.00;
			break;
		case 4:
			price = 2.00;
			break;
		case 5:
			price = 1.50;
			break;
		default:
			System.out.println("valor inválido");
			break;
		}
		
		System.out.printf("Total: R$ %.2f", price * quant);
		sc.close();
	}

}
