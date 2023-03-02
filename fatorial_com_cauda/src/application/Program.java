package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		int numero, fat;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		
		if (numero >= 0) {
			fat = fatorial(numero);
			JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " = " + fat);
		} else {
			JOptionPane.showMessageDialog(null, "Número inválido para fatorial");
		}

	}
	
	static int fatorial(int num) {
		
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * fatorial (num-1);
		}

	}

}
