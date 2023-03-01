package application;

import javax.swing.JOptionPane;
import entities.ListaLigada;
import entities.No;

public class Program {

	public static void main(String[] args) {
		
		ListaLigada intLista = new ListaLigada();
		int i, num;
		
		for (i = 1; i <= 10; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
			
			if (num % 3 == 0) {
				intLista.InserirFinal(new No(num));
			}
		}
		intLista.MostrarLista();
		System.exit(0);
	}

}
