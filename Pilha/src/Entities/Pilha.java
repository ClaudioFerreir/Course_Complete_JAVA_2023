package Entities;

public class Pilha {

	int tamanho;
	int topo;
	int[] vetor;

	public Pilha(int tamanho) {
		topo = -1;
		this.tamanho = tamanho;
		vetor = new int[tamanho];
	}

	public boolean PilhaVazia() {
		
		if (topo == -1)	{
			return true;
		} else {
			return false;
		}
		
	}

	public boolean PilhaCheia() {
		
	    if (topo >= tamanho-1) {
          return true;
	    } else {
	      return false;
	    }

	}

	public void Empilhar(int elemento) {
		
		  if (! PilhaCheia( )) {
		      topo = topo + 1;
		      vetor[topo] = elemento;
		  } else {
		      System.out.println ("Pilha Cheia");
		    }
	}

	public int Desempilhar() {
		
		   int desempilhado = 0;

		   if (PilhaVazia()) {
		      System.out.println("Pilha Vazia");
		   } else {
		      desempilhado = vetor[topo];
		      topo = topo - 1;
     	    }

		   return desempilhado;

	}

	public void ElementoTopo() {
		
		   if (topo >= 0) {
		      System.out.println("O elemento do topo é " + vetor[topo]);
		    } else {
		      System.out.println("Pilha Vazia");
		    }

	}

	public void MostrarPilha() {

	}

}
