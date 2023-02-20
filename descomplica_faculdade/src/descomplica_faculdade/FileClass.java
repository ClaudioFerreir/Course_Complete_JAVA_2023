package descomplica_faculdade;

import java.io.File;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o nome de um arquivo com o seu path:\n");
		String nome = sc.next();
		
		File objFile = new File(nome);
		if (objFile.exists()) {
			if (objFile.isFile()) {
			System.out.println("Nome do arquivo: " + objFile.getName());
			System.out.println("Tamanho do arquivo: " + objFile.length());
			}
		} else {
			System.out.println("Arquivo Inexistente");
		}
		
		sc.close();
	}

}
