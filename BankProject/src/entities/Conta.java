package entities;

public class Conta {
	
	private int conta;
	private String titular;
	private double saldo;
	
	// constructor
	public Conta (int conta, String titular, double saldoInicial) {
		this.conta = conta;
		this.titular = titular;
		depositar(saldoInicial); // assim o deposito inicial participa das regras do negocios
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
	
	public double getSaldo() {
		return saldo;
	}
	
	//metodos
	public void depositar(double valor) {
		saldo += valor;
		System.out.println(saldo);
	}
	
	public void saque(double valor) {
		saldo -= (valor + 5.00);
		System.out.println(saldo);
	}
	
	public String toString() {
		return "Account "
				+ conta
				+ ", Holder: "
				+ titular
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}

}
