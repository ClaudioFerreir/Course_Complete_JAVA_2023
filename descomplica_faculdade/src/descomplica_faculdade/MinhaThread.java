package descomplica_faculdade;

public class MinhaThread extends Thread{ /* ou 'implements Runnable' com a vantagem que posso 
passar o extends uma classe, ja que em Java so podemos implementar uma classe*/
	
	public void run () {
		System.out.println("Thread secundaria");
	}

}
