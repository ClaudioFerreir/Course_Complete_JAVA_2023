package descomplica_faculdade;

public class Threads extends Thread {
	
	public void run () {
		System.out.println("Thread Secundaria");
	}

	public static void main (String[] args) {
		
		MinhaThread minhaThread = new MinhaThread();
		// Thread thread = new Thread(minhaThread); adicionado caso use 'implements Runnable'
		minhaThread.start();
		System.out.println("Thread Principal");

	}

}
