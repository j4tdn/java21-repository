package view.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04AList_AddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> listA = List.of("a", "b", "c", "d");
		List<String> listB = List.of("c", "d", "e", "f", "g", "h");
		
		List<String> resultOfAddAll = new ArrayList<>(listB);
		resultOfAddAll.addAll(listA);
		
		//addAll: phép hợp
		generate("1. Result Of Add All Method(Hợp)", resultOfAddAll);
		
		List<String> resultOfRemoveAll = new ArrayList<>(listB);
		resultOfRemoveAll.removeAll(listA);
		
		//removeAll: phép hiệu: có trong cái này nhưng không có trong cái kia
		generate("2. Result Of Remove All Method(Hiệu)", resultOfRemoveAll);
		
		List<String> resultOfRetainAll = new ArrayList<>(listB);
		resultOfRetainAll.retainAll(listA);
		
		//retainAll : phép giao
		generate("3. Result Of Retain All Method(Giao)", resultOfRetainAll);
		
	}
}
