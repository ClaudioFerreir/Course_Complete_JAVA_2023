package descomplica_faculdade;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("--------------");
			System.out.println("Menu Principal");
			System.out.println("--------------");
			System.out.println("Selecione uma das opções abaixo:");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Conservador");
			System.out.println("0 - Sair");
			
			System.out.println("Qual opção deseja?");
			op = sc.nextInt();
			
						
		if (op == 0) 
			
		 break;
		
		
		switch(op) {
		
		case 1:
			System.out.println("Voce selecionou a opção de Aluno");
			break;
		case 2:
			System.out.println("Voce selecionou a opção de Professor");
			break;
		case 3:
			System.out.println("Voce selecionou a opção de Coordenador");
			break;
		default:
			System.out.println("Voce selecionou a opção inválida");
			
		}
		
		sc.close();

	} while (true);
	
	System.out.println("Fim");
	}
}
