package view.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04AListAddRemoveRetainAll {
	
	public static void main(String[] args) {
		List<String> listA = List.of("a", "b", "c", "d");
		List<String> listB = List.of("c", "d", "e", "f", "g", "h");
		
		List<String> resultOfAddAll = new ArrayList<>(listA);
		resultOfAddAll.addAll(listB);
		
		generateString("1. Result of add all method(Hợp)", resultOfAddAll);
		
		List<String> resultOfRemoveAll = new ArrayList<>(listA);
		resultOfRemoveAll.removeAll(listB);
		
		generateString("2. Result of remove all method(Hiệu)", resultOfRemoveAll);
		
		List<String> resultOfRetainAll = new ArrayList<>(listA);
		resultOfRetainAll.retainAll(listB);
		
		generateString("3. Result of retain all method(Giao)", resultOfRetainAll);
		
		
	}
}