package curso_programacao;

import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5390;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n" + 
				          "Computer, which price is $ %.2f%n" +
				          "Office desk, which price is $ %.2f%n%n" + 
				          "Record: %d years old, code %d and gender: %s%n%n" +
				          "Measure with eight decimal places: %.6f%n" +
				          "Rouded (three decimal places): %.3f%n",
				           price1, price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
