package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero para linhas: ");
		int l = sc.nextInt();
		System.out.print("Digite um numero para colunas: ");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
			
		System.out.print("Digite um numero da matrix: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (n == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.print("Left: " + mat[i][(j-1)]);
						System.out.println();
					}
					if (j < mat[i].length-1) {
						System.out.print("Right: " + mat[i][j+1]);
						System.out.println();
					}
					if (i > 0) {
						System.out.print("Up: " + mat[i-1][j]);
						System.out.println();
					}
					if (i < mat.length-1) {
						System.out.print("Down: " + mat[i+1][j]);
						System.out.println();
					}
				}
			}
		}
		
		
		sc.close();
	}

}
