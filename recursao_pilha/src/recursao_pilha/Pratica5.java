package recursao_pilha;

import javax.swing.JOptionPane;

public class Pratica5 {

	public static void main(String[] args) {
		
		int b, e, p;
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base para cálculo da potência"));
		e = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente para cálculo da potência"));
		
		if (b < 0 || e < 0) {
			JOptionPane.showMessageDialog(null, "valor digitado incorretamente, valores devem ser maiores ou iguais a zero");
		} else {
			p = pot(b, e);
			JOptionPane.showMessageDialog(null, b + " elevado a " + e + " é igual a " + p);
		}
		
	}

	static int pot(int base, int exp) {
		if (base == 0) { // parada recursiva, caso 1 da recursao
			return 0;
		} else if (exp == 0) { // parada recursiva, caso 1 da recursao
			return 1;
		} else {
			return pot(base, exp-1) * base; // chamada recursiva, casos 2 e 3 da recursao
		}
	} // fim da recursao
}
