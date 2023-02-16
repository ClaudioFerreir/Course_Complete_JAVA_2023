package descomplica_faculdade;

public class SomaPares {

	public static void main(String[] args) {
		
		int[] numbers = {10, 23, 19, 34, 54, 23, 76, 39, 65, 24, 8, 0, 12, 55};
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] <= 0) {
				System.out.println("Break porque numero = " + numbers[i]);
				break;
			} else if (numbers[i] % 2 != 0) {
				System.out.println("Numero impar encontrado na matriz, ignorando o numero " + numbers[i]);
				continue;
			} else {
				sum += numbers[i];
			}
		}
		System.out.println("Soma de todos os numeros = " + sum);
	}

}
