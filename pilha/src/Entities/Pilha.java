package Entities;

public class Pilha {
	// atributos:
	int tamanho;
	int topo;
	int[] vetor;

	// construtor:
	public Pilha(int tamanho) {
		topo = -1;
		this.tamanho = tamanho;
		vetor = new int[tamanho];
	}
	
	//metodos:
	
	public boolean PilhaVazia() {
		
		// return topo == -1;
		if (topo == -1)	{
			return true;
		} else {
			return false;
		}
		
	}

	public boolean PilhaCheia() {
		
		// return topo >= tamanho-1;
	    if (topo >= tamanho-1) {
          return true;
	    } else {
	      return false;
	    }

	}

	public void Empilhar(int elemento) {
		
		  if (! PilhaCheia( )) {
		      topo = topo + 1; // topo++;
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
		      topo = topo - 1; // topo--;
     	    }

		   return desempilhado;

	}

	public void ElementoTopo() {
		
		   // if(!pilhaVazia)
		   if (topo >= 0) { 
		      System.out.println("O elemento do topo é " + vetor[topo]);
		    } else {
		      System.out.println("Pilha Vazia");
		    }

	}

	public void MostrarPilha() {
		   
		   int i;

		   for (i = topo ; i >= 0 ; i--) {
		      System.out.println("Elemento " + vetor[i] + " posição " + i);
		    }
	}

}
