package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Comment;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Comment c1 = new Comment("Have a nice trip!");
		
		
		sc.close();
	}

}
