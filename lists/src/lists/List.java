package lists;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Dulce");
		list.add("Galrao");
		list.add("Robgol");
		list.add(2, "Marco");
		
	
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		//list.remove("Dulce");
		//list.remove(3);
		//list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		System.out.println("Index of Galrao: " + list.indexOf("Galrao"));
		System.out.println("Index of Joao: " + list.indexOf("Joao"));
		System.out.println("----------------------------------");
		
		ArrayList<String> result = (ArrayList<String>) list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'X').findFirst().orElse(null);
		System.out.println(name);
	}

}
