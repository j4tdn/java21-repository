package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02AList_SingleType {
	
	public static void main(String[] args) {
		
		var sequences = new ArrayList<String>(); // JDK 10
		
		// new ArrayList --> add, remove, set
		// List<String> sequences = new ArrayList<>(20); // JDK 1.7 dynamic length
		
		// Arrays.asList(....) --> fixed size list
		// List<String> sequences = Arrays.asList("startAsList");
		
		
		// List.of(...) --> immutable list
		// List<String> sequences = List.of("startAsList");
		
		// sequences.set(0, "empty");
		
		sequences.add("hello");
		sequences.add("teo");
		sequences.add("---");
		sequences.add("2023");
		sequences.addAll(List.of("a", "b", "c"));
		
		sequences.set(1, "nam");
		
		sequences.remove(2); // remove by index
		
		sequences.remove("hello"); // remove object
		
		System.out.println("1. Sequences size: " + sequences.size());
		
		printf("2. Sequences printf", sequences, " ");
	}
	
	private static void printf(String prefix, List<String> sequences, String delimiter) {
		System.out.print("\n" + prefix + " -->" + delimiter);
		for (int i = 0; i < sequences.size(); i++) {
			System.out.print(sequences.get(i) + delimiter);
		}
	}
}