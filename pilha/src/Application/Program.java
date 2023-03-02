package Application;


import javax.swing.JOptionPane;
import Entities.Pilha;

public class Program {

	public static void main(String[] args) {
		
		Pilha intPilha = new Pilha(5);
		int i;
		int entrada;
		
		for (i = 1; i <= 6; i++) { // Ha um elemento a mais para vermos a chamada de pilha cheia
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			intPilha.Empilhar(entrada);
		}
		intPilha.MostrarPilha();
		int x = intPilha.Desempilhar();
		System.out.println("Desempilhado: " + x);
		intPilha.ElementoTopo();
		System.exit(0);
	}

}
