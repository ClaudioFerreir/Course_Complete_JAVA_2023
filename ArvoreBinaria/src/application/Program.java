package application;

public class Program {

	public static void main(String[] args) {
		
		ArvoreBinaria ABB;
		ABB = new ArvoreBinaria();
		
		do {
			op = menu();
			vi = LerNum();
			switch (op) {
				case 1: emOrdem(ABB);
						break;
				case 2: preOrdem(ABB);
						break;
				case 3: posOrdem(ABB);
						break;
			}
		} while (op < 1 && op > 3);
		
		System.exit(0);

	}

}
