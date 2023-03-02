package Entities;

import javax.swing.JOptionPane;

public class Fila {
	
	int tamanho, inicio, fim, total;
	int vetor[];
	
	public Fila(int tamanho) {
		inicio = 0;
		fim = 0;
		total = 0;
		this.tamanho = tamanho;
		vetor = new int[tamanho]; 
	}
	
	public boolean FilaVazia() {
		
		if (total == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public boolean FilaCheia() {
		
		if (total >= tamanho) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void Enfileirar (int elemento) {
		
		if (FilaCheia()) {
			System.out.print("Fila Cheia");
		} else {
			vetor[fim] = elemento;
			fim = fim + 1;
			total = total + 1;
			if (fim >= tamanho) {
				fim = 0;
			}
		}
		
	}
	
	public int Desenfileirar() {
		
		int desenfileirado = 0;
		if (FilaVazia()) {
			System.out.println("Fila Vazia");
		} else {
			desenfileirado = vetor[inicio];
			inicio = inicio + 1;
			total = total - 1;
			if (inicio >= tamanho) {
				inicio = 0;
			}
		}
		return desenfileirado;
	}
	
	public void ElementoInicio() {
		
		if (FilaVazia()) {
			System.out.println("Fila Vazia");
		} else {
			System.out.println("O primeiro elemento é " + vetor[inicio]);
		}
		
	}
	
	public void MostrarFila() {
		
		int i, aux;
		
		aux = inicio;
		for (i = 1; i <= total; i++) {
			JOptionPane.showInputDialog(null, "Elemento " + vetor[aux] + " posição " + i);
			aux = aux + 1;
			if (aux >= tamanho) {
				aux = 0;
			}
		}
	}
}
