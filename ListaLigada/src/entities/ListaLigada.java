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
			NoTemp = NoTemp.prox;
		}
		return tamanho;
		
	}
	
}
