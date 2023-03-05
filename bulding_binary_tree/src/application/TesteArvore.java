package application;

import javax.swing.JOptionPane;

import entities.ArvoreBinaria;

public class TesteArvore {

	public static void main(String[] args) {
		ArvoreBinaria arv = new ArvoreBinaria();
		
		arv.inserirNo(Double.parseDouble(JOptionPane.showInputDialog("Digite um número real")));
		arv.inserirNo(Double.parseDouble(JOptionPane.showInputDialog("Digite um número real")));
		arv.inserirNo(Double.parseDouble(JOptionPane.showInputDialog("Digite um número real")));
		arv.inserirNo(Double.parseDouble(JOptionPane.showInputDialog("Digite um número real")));
		arv.inserirNo(Double.parseDouble(JOptionPane.showInputDialog("Digite um número real")));
		
		System.out.println("Nós a esquerda: ");
		arv.exibirNoEsq();
		System.out.println("");
		System.out.println("Nós a direita: ");
		arv.exibirNoDireito();
		System.out.println("");
		System.out.println("Raiz: ");
		arv.exibirRaiz();
		
		arv.buscarValor(10.0);
		arv.removerValor(10.0);
		arv.buscarValor(10.0);
		
		System.exit(0);
	}
}
