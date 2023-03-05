package entities;

public class BIntNo {
	double valor;
	BIntNo esq;
	BIntNo dir;
	
	//construtor
	public BIntNo (double novoValor) {
		this.valor = novoValor;
		this.esq = null;
		this.dir = null;
	}
}
