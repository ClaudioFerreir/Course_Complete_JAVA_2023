package Entities;

public class Pilha {
	
	int tamanho;
	int topo;
	int vetor;
	
	Pilha (int tam) {
		topo = -1;
		tamanho = tam;
		vetor = new int(tam);
	}

}
