package entities;

public class BIntNo {
	int valor;
	BIntNo esq;
	BIntNo dir;
	
	//construtor
	public BIntNo (int valor) {
		this.valor = valor;
		this.esq = null;
		this.dir = null;
	}
}
