package fatorialSemCauda;

import javax.swing.JOptionPane;

public class fatorialProgram {

	public static void main(String[] args) {
		
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		if (numero >= 0) {
			fatorial(numero, numero, 1);
		}
		
	}
	
	static void fatorial (int num, int x, int f) {
		
		if (x == 0 || x == 1) {
			JOptionPane.showMessageDialog(null, "Fatorial de " + num + " = " + f);
		} else {
			fatorial (num, x - 1, f * x);
		}
	}

}
