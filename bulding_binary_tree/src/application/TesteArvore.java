package application;

import entities.ArvoreBinaria;

public class TesteArvore {

	public static void main(String[] args) {
		ArvoreBinaria arv = new ArvoreBinaria();
		
		arv.inserirNo(8.5);
		arv.inserirNo(12.7);
		arv.inserirNo(4.3);
		arv.inserirNo(2.7);
		arv.inserirNo(3.7);
		
		System.out.println("Nós a esquerda: ");
		arv.exibirNoEsq();
		System.out.println("");
		System.out.println("Nós a direita: ");
		arv.exibirNoDireito();
		System.out.println("");
		System.out.println("Raiz: ");
		arv.exibirRaiz();
		

	}

}
