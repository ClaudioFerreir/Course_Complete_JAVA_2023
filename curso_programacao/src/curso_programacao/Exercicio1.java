package curso_programacao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int num1, num2;
		
		// usamos a classe Scanner para adicionar o recurso de leitura de dados
		Scanner teclado = new Scanner(System.in);
		
		// nestes dois pontos de leitura fazemos uso da variavel de scanner
		System.out.println("Digite um valor inteiro: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite outro valor inteiro: ");
		num2 = teclado.nextInt();
		
		// Resultado final
		System.out.println("A soma dos numeros inteiros é: " + (num1 + num2));
		
		//temos que sempre fechar 
		teclado.close();
	}

}
