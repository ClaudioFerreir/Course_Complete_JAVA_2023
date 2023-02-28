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

	public void Desempilhar() {

	}

	public void ElementoTopo() {

	}

	public void MostrarPilha() {

	}

}
