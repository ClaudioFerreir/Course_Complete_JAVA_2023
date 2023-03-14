package lists;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Dulce");
		list.add("Galrao");
		list.add("Robgol");
		
		for (String x : list) {
			System.out.println(x);
		}

	}

}
