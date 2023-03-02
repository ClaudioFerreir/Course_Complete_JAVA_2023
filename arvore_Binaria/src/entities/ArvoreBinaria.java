package entities;

import javax.swing.JOptionPane;

public class ArvoreBinaria {
	
	public static void visita (No ABB) {
		System.out.println(ABB.num + " ");
	}
	
	public static int menu() {
		
		String msg = "";
		public int op;
		
		msg = msg + "Digite 1 para Em Ordem\n";
		msg = msg + "Digite 2 para Em Pré Ordem\n";
		msg = msg + "Digite 3 para Em Pós Ordem\n";
		msg = msg + "Digite 0 para sair do sistema\n";
		
		op = Integer.parseInt(JOptionPane.showInputDialog(msg));
		return op;
	}
	
	public void emOrdem (No ABB) {
		
		if (ABB != nulo) {
			emOrdem(ABB.esquerda);
			visita(ABB);
			emOrdem(ABB.direita);
		}
	}
	
	public void preOrdem (No ABB) {
		
		if (ABB != nulo) {
			visita(ABB);
			preOrdem(ABB.esquerda);
			preOrdem(ABB.direita);
		}
	}
	
	public void posOrdem (No ABB) {
		
		if (ABB != nulo) {
			posOrdem(ABB.esquerda);
			posOrdem(ABB.direita);
			visita(ABB);
		}
	}

}
