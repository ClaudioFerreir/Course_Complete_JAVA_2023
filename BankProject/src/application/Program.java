package application;

import java.util.Locale;
import javax.swing.JOptionPane;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		int numero =  Integer.parseInt(JOptionPane.showInputDialog("Enter your account number: "));
		String titular = JOptionPane.showInputDialog("Enter account holder: ");
		String option = "";
		double valor;
 		
		do {
			option = JOptionPane.showInputDialog("Is there na initial deposit (y/n)?");
			valor =  Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value: "));
		} while (option == "y");
		
		Conta conta = new Conta(numero, titular, valor);
		System.out.println("Account data: ");
		System.out.println("Account " + numero + ", Holder: " + titular + ", Balance: $ " + valor);

	}

}
