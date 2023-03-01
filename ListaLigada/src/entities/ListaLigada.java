package entities;

public class ListaLigada {

	No primeiro, ultimo;
	
	ListaLigada() {
		primeiro = null;
		ultimo = null;
	}
	
	public boolean ListaVazia() {
		
		if (primeiro == null && ultimo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void Destruir() {
		primeiro = null;
		ultimo = null;
	}
	
	public int ContarNos() {
		int tamanho = 0;
		No NoTemp = primeiro;
		
		while (NoTemp != null) {
			tamanho = tamanho + 1;
			NoTemp = NoTemp.prox; // ponteiro temporario que aponta para o inicio da lista
		}
		return tamanho;
	}
	
	public void MostrarLista() {
		
		int i =1;
		No NoTemp = primeiro;
		
		while (NoTemp != null) {
			System.out.println("Elemento " + NoTemp.elemento + " posição " + i);
			NoTemp = NoTemp.prox;
			i = i + 1;
		}
	}
	
}
