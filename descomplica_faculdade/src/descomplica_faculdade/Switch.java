package descomplica_faculdade;

public class Switch {

	public static void main(String[] args) {
		
		int numero = 3;
		
		switch(numero) {
		
		case 1:
		case 2:
			System.out.println("Voce digitou 1 ou 2");
			break;
			// este modo pode ser usado como quando abrangemos "A" ou "a" 
		case 3:
			System.out.println("Voce digitou 3");
			break;
		default:
			System.out.println("Voce digitou um valor invalido");
		}

	}

}
