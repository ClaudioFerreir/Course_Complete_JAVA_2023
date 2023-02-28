package Application;


import javax.swing.JOptionPane;
import Entities.Pilha;

public class Program {

	public static void main(String[] args) {
		
		Pilha intPilha = new Pilha(5);
		int i;
		int entrada;
		
		for (i = 1; i <= 5; i++) {
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			intPilha.Empilhar(entrada);
		}
		intPilha.MostrarPilha();
		System.exit(0);
	}

}
