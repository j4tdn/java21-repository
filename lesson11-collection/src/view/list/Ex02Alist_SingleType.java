package view.list;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

public class Ex02Alist_SingleType {
	public static void main(String[] args) {
		
//		List<String> sequences = new ArrayList<>();
		
		var sequences = new ArrayList<String>();
		
		// Arrayys.asList(....) --> fixed size list, không add, remove nhưng có thể set
		// List.of(...) --> immutable list (không thể thay đổi gtri trên HEAP)
		sequences.add("word");
		sequences.add("text");
		sequences.add("hello");
		sequences.addAll(List.of("a", "b", "c"));

		
		System.out.println("sequences size: " + sequences.size());
		printf("1. Sequences", sequences, " ");
	}
	
	private static void printf(String prefix, List<String> sequences, String delimiter) {
		System.out.print("\n" + prefix + "-->" + delimiter);
		for(String sequence: sequences) {
			System.out.print(sequence + delimiter);
		}
	}

}
