package entities;

public class Conta {
	
	private int conta;
	private String titular;
	private double valor;
	
	// constructor
	public Conta (int conta, String titular, double valor) {
		this.conta = conta;
		this.titular = titular;
		this.valor = valor;
	}
	
	public Conta (int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	//getters and setters
	public int getConta() {
		return conta; 
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

}
