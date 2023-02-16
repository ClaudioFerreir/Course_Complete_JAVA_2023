package descomplica_faculdade;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite o valor da nota 1: ");
		nota1 = input.nextDouble();

		System.out.println("Digite o valor da nota 2: ");
		nota2 = input.nextDouble();

		System.out.println("Digite o valor da nota 3: ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("A media é igual a %.2f", media);
		
		input.close();
	}

}
