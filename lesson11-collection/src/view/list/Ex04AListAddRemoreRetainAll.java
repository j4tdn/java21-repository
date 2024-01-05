package view.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04AListAddRemoreRetainAll {

	public static void main(String[] args) {
		
		List<String> listA = List.of("a","b","c","d");
		List<String> listB = List.of("c","d","e","f","g");
		
		
		// Add tat ca B vao A
		List<String> resultOfAddAll = new ArrayList<>(listA);
		resultOfAddAll.addAll(listB);
		generateString("1. Result Of Add All Method", resultOfAddAll);
		
		
		// Thuoc A khong thuoc B (A-B)
		List<String> resultOfRemoveAll = new ArrayList<>(listA);
		resultOfRemoveAll.removeAll(listB);
		generateString("2. Result Of Remove All Method", resultOfRemoveAll);
		
		
		// Lay chung giua A va B
		List<String> resultOfRetainAll = new ArrayList<>(listA);
		resultOfRetainAll.retainAll(listB);
		generateString("3. Result Of Retain All Method", resultOfRetainAll);
		
	}
	
}
