package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02AList_SingleType {
	public static void main(String[] args) {
		
		List<String> sequences = new ArrayList<String>();
		
		//var sequences = new ArrayList<String>();
		sequences.add("word");
		sequences.add("text");
		
		System.out.println("1. Sequences size: " + sequences.size());
		
		printf("2. Sequences", sequences, " ");
	}
	
	private static void printf(String prefix, List<String> sequences, String delimiter) {
		System.out.println("\n" + prefix + " --> ");
		for (String sequence : sequences) {
			System.out.print(sequence + delimiter);
		}
	}
}
