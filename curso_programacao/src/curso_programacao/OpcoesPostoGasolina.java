package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class OpcoesPostoGasolina {

	public static void main(String[] args) {
		
		int fuel = 9, alcool = 0, gasolina = 0, diesel = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		while (fuel!=4) {
			
			System.out.println("Digite o combustivel a ser abastecido: ");
			fuel = sc.nextInt();
			
			switch (fuel) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
				break;
			default:
				System.out.println("Digite um codigo válido ...");
			}
			
											
		}
		
		sc.close();
	}

}
