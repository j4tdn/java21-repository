package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02AList_SingleType {
	
	public static void main(String[] args) {
		
//		var sequences = new ArrayList<String>(); // JDK 10
		
		 List<String> sequences = new ArrayList<>(); // 	JDK 1.7	
		
		sequences.add("hello");
		
		sequences.add("my");
		
		sequences.add("name");

		
		System.out.println("1. Sequences size: " + sequences.size());
		
		printf("1. Sequences printf", sequences, " ");
	}
	
	private static void printf(String prefix, List<String> sequences, String delimiter) {
		System.out.print("\n" + prefix + " -->" + delimiter);
		for (String sequence : sequences) {
			System.out.print(sequence + delimiter);
		}
	}
}
