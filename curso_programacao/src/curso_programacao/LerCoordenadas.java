package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class LerCoordenadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma coordenada X: ");
		int X = sc.nextInt();
		System.out.println("Digite uma coordenada Y ");
		int Y = sc.nextInt();
		
		while (X != 0 || Y != 0) {
						
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X > 0 && Y < 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			
			System.out.println("Digite uma coordenada X: ");
			X = sc.nextInt();
			System.out.println("Digite uma coordenada Y ");
			Y = sc.nextInt();
		} 
		
	
		sc.close();
	}

}
