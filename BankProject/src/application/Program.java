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
		
		accountOP(conta);
	}
		

		
		public static void accountOP(Conta conta) {
			int option3 = 0;
			
			do {
				char option2 = (JOptionPane.showInputDialog("Would you like to do any operation (y/n)?")).charAt(0);
				if (option2 == 'y') {
					System.out.println("COD-------OPERATION");
					System.out.println("-------------------");
					System.out.println(" 1          Deposit");
					System.out.println(" 2         Withdraw");
					System.out.println(" 0             Exit");
					
					option3 =  Integer.parseInt(JOptionPane.showInputDialog("Enter operation code: "));
						
					switch(option3) {
					case 1:
						double deposito = Double.parseDouble(JOptionPane.showInputDialog("Enter a deposit value: "));
						conta.depositar(deposito);
						break;
					case 2:
						double retirada = Double.parseDouble(JOptionPane.showInputDialog("Enter a withdraw value: "));
						conta.saque(retirada);
						break;
					case 0:
						System.out.println("Thanks for using our bank!!!");
						break;
					default:
						System.out.println("Invalid Code");
						break;
					}
					System.out.println("Udapted account data: ");
					System.out.println(conta);
				}
			} while (option3 != 0);

		}
	
}


