package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02AList_SingleType {

	public static void main(String[] args) {
		
		
		var sequences = new ArrayList<String>();  // JDK 10
//		List<String> sequences =  new ArrayList<>(Arrays.asList("heloo"));  
		
		// Array.asList(....) --> Fixed size list
		// List<String> sequences = new ArrayList<>(20); // JDK 1.7
		
		
		// Tạo hàm không thể thêm xóa,......
//		List<String> sequences = List.of("startAslist");
		
		
//		List<String> immutableList = Collections.unmodifiableList(sequences);
		
		sequences.add("word");
		sequences.remove(1);
		
		sequences.add("text");
		
		System.out.println("1. Sequences size :" + sequences.size());
		
		
		printf("2. Sequencse size", sequences, " ");
	}
	
	private static void printf(String prefix , List<String> requences , String delimiter) {
		System.out.print(prefix +" :");
		for(String requence : requences) {
			System.out.print(requence + delimiter);
		}
	}
	
}
