package descomplicaSimpleThreadNoSync;

public class MinhaThread extends Thread {
	String mensagem;
	MinhaClasseComum minhaClasseComum;
	
	MinhaThread(MinhaClasseComum classeComum, String msg) {
		minhaClasseComum = classeComum;
		mensagem = msg;
		start();
	}
	
	public void run () {
		minhaClasseComum.exibir(mensagem);
	}

}
