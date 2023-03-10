package descomplica_faculdade;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratMultiplosExceptions {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		try {
			
			System.out.println("Digite o denominador: ");
			valor = sc.nextInt();
			
			int resultado = 0 / valor;
			System.out.println(resultado);
			
		}
		/*
		 * seguem os tratamentos do mais especifico para o mais generico
		 */
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException => " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception => " + e.getMessage());
		}
		finally { 
			System.out.println("Fim"); // executado independente de ter erros
		}
		
		sc.close();

	}

}
