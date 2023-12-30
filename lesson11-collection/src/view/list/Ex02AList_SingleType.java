package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02AList_SingleType {

	public static void main(String[] args) {

		// var sequences = new ArrayList<String>(); // JDK 10

		// add, remove, set
		List<String> sequences = new ArrayList<>(20); // JDK 1.7 dynamic length

		// Version cũ: Array.asList(.....); --> fixed size list
		// List.of(....) --> immutable list() --> bất biến <ko thể thêm-sửa-xóa>

		sequences.add("hello");
		sequences.add("Ronaldo");
		sequences.add("------");
		sequences.add("2023");

		sequences.set(1, "Messi");

		sequences.remove(2); // remove by index
		
		sequences.remove("hello"); // remove object

		sequences.addAll(List.of("a", "b", "c"));

		System.out.println("1. Sequences size: --> " + sequences.size());

		printf("2. Sequences printf", sequences, " ");

	}

	private static void printf(String prefix, List<String> sequences, String delimiter) {
		System.out.print("\n" + prefix + " -->" + delimiter);

		for (String sequence : sequences) {
			System.out.print(sequence + delimiter);
		}

		// same above
		for (int i = 0; i < sequences.size(); i++) {
			System.out.print(sequences.get(i) + delimiter);
		}
	}

}
