package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		int timeStart, timeEnd, time;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de inicio do jogo: ");
		timeStart = sc.nextInt();
		
		System.out.println("Digite a hora do fim do jogo: ");
		timeEnd = sc.nextInt();
		
		if (timeStart > timeEnd) {
			time = (24 - timeStart) + timeEnd;
		} else if (timeStart == timeEnd) {
			time = 24;
		} else {
			time = timeEnd - timeStart;
		}
		System.out.println("O JOGO DUROU " + time + " HORA(S)");
		sc.close();

	}

}
