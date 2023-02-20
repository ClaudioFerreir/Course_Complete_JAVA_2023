package descomplicaThreadsSync;

public class ListaNumeros {
	synchronized void printTable (int n) { /* sicronizado com isso este e feito de modo que os outros 
	precisam esperar. Muito usado quando as threads tem acesso aos mesmos dados.*/
		for (int i = 1; i <= 4; i++) {
			System.out.println(n + i);
		
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
	
	}
}
