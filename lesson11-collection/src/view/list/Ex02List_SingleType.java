package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02List_SingleType {

	public static void main(String[] args) {

//		List<String> sequences = new ArrayList<>(); //JDK 1.7
		// var sequences = new ArrayList<String>(20); // JDK 10
		var sequences = new ArrayList<String>(); // JDK 10

		sequences.add("hello");
		sequences.add("my");
		sequences.add("name");
		sequences.addAll(List.of("a", "a", "a"));

		System.out.println("1. Sequences size: " + sequences.size());
		printf("2. Sequences", sequences, " ");

	}

	private static void printf(String prefix, List<String> sequences, String delimiter) {
		System.out.print("\n" + prefix + "-->" + delimiter);
		for (String sequence : sequences) {
			System.out.print(sequence + delimiter);
		}
	}
}
