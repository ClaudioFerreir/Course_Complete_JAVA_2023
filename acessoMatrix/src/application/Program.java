package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero para linhas:");
		int l = sc.nextInt();
		System.out.print("Digite um numero para colunas:");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(mat);
		
		System.out.print("Digite um numero da matrix:");
		
		
		sc.close();
	}

}
