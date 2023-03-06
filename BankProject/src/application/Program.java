package application;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		double conta =  Double.parseDouble(JOptionPane.showInputDialog("Enter your account number: "));
		String titular = JOptionPane.showInputDialog("Enter account holder: ");
		String option = "";
		double valor;
 		
		do {
			option = JOptionPane.showInputDialog("Is there na initial deposit (y/n)?");
		} while (option == "y") {
			valor =  Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value: "));
		}
		
		

	}

}
