package application;

import javax.swing.JOptionPane;
import entities.ArvoreBinaria;

public class Teste {

	public static void main(String[] args) {
		
		ArvoreBinaria arv = new ArvoreBinaria();
		
		arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
		
		arv.exibirNo();
		System.exit(0);

	}

}
