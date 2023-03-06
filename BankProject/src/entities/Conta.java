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
	
	public String getTitular() {
		return titular;
	}
	
	public double getValor() {
		return valor;
	}
	
	//metodos
	public void depositar(double valor) {
		this.valor += valor;
		System.out.println(this.valor);
	}
	
	public void saque(double valor) {
		this.valor -= (valor + 5);
		System.out.println(this.valor);
	}

}
