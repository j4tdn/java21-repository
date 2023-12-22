package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02AList_SingleType {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>(20); //jdk 1.7
		
		//var sequences = new ArrayList<String>(); //jdk 10
		
		//List<String> sequences = new ArrayList<>;
		
		sequences.add("123");
		sequences.add("123");
		System.out.println(sequences);
		
		sequences.add("hello");
		sequences.add("hello");
		sequences.add("hello");
		sequences.add("hello");
		sequences.add("hello");
		sequences.add("hello");
		
		sequences.addAll(List.of("a", "b", "c"));
		
		sequences.add("hello");
		sequences.set(1, "2");
		sequences.remove(2);
		
		
	}
	
	private static void pritf(String prefix, List<String> sequences, String delimiter) {
		System.out.println("prefix + " + "-->" );
		for (String sequence: sequences) {
			System.out.println(sequence + delimiter);
		}
	}
	
}
