package descomplicaSimpleThreadSync;

public class Principal {

	public static void main(String[] args) {
		MinhaClasseComum minhaClasseComum = new MinhaClasseComum();
		MinhaThread minhaThread_1 = new MinhaThread(minhaClasseComum, "welcome");
		MinhaThread minhaThread_2 = new MinhaThread(minhaClasseComum, "new");
		MinhaThread minhaThread_3 = new MinhaThread(minhaClasseComum, "programmer");

	}

}
