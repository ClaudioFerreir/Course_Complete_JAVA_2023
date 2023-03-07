package application;

import java.util.Locale;
import javax.swing.JOptionPane;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		int numero =  Integer.parseInt(JOptionPane.showInputDialog("Enter your account number: "));
		String titular = JOptionPane.showInputDialog("Enter account holder: ");
		double saldoInicial = 0;
		Conta conta;
 		
		char option = (JOptionPane.showInputDialog("Is there na initial deposit (y/n)?")).charAt(0);
		if (option == 'y') {	
			saldoInicial =  Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value: "));
			conta = new Conta(numero, titular, saldoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		
		
		System.out.println(conta);
	}
		

		
		public static void accountOP(Conta conta) {
			
			char option2 = (JOptionPane.showInputDialog("Would you like to do any operation (y/n)?")).charAt(0);
			if (option2 == 'y') {
				System.out.println("COD-------OPERATION");
				System.out.println("-------------------");
				System.out.println(" 1          Deposit");
				System.out.println(" 2         Withdraw");
				
				int option3 =  Integer.parseInt(JOptionPane.showInputDialog("Enter operation code: "));
				int valor = 0;
				
				switch(option3) {
				case 1:
					conta.depositar(valor);
					break;
				case 2:
					conta.saque(valor);
					break;
				default:
					System.out.println("Invalid Code");
					break;
				}
				System.out.println("Udapted account data: ");
				System.out.println("Account " + conta.getConta() + ", Holder: " + conta.getTitular() + ", Balance: $ " + conta.getSaldo());
			}

		}
	
}


