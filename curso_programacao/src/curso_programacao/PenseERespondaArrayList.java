package curso_programacao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PenseERespondaArrayList {

	public static void main(String[] args) {
		
		int num;
		char option;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> listNum = new ArrayList<>();
		
		do {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			listNum.add(num);
			System.out.print("Deseja inserir um novo numero? (s/n)");
			option = sc.next().charAt(0);
		} while (option == 's'); 
		
		int soma = 0;
		for(int numero: listNum ) {
			soma += numero;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
