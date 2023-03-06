package application;

import java.util.Locale;
import javax.swing.JOptionPane;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		int numero =  Integer.parseInt(JOptionPane.showInputDialog("Enter your account number: "));
		String titular = JOptionPane.showInputDialog("Enter account holder: ");
		double valor = 0;
 		
		String option = JOptionPane.showInputDialog("Is there na initial deposit (y/n)?");
		if (option == "y") {	
			valor =  Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value: "));
		}; 
		
		Conta conta = new Conta(numero, titular, valor);
		
		System.out.println("Account data: ");
		System.out.println("Account " + conta.getConta() + ", Holder: " + conta.getTitular() + ", Balance: $ " + conta.getValor());
		
		
		
		
	}
		

		
		public static void accountOP(Conta conta) {
			
			String option2 = JOptionPane.showInputDialog("Would you like to do any operation (y/n)?");
			if (option2 == "y") {
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
				System.out.println("Account " + conta.getConta() + ", Holder: " + conta.getTitular() + ", Balance: $ " + conta.getValor());
			}

		}
	
}


