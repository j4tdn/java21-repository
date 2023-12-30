package view.list;

import java.util.ArrayList;
import java.util.List;

import static utils.CollectionUtils.*;

public class Ex04AList_AddRemoveRetailAll {

	public static void main(String[] args) {
		List<String> listA	= List.of("a", "b" , "c", "d");
		List<String> listB	= List.of("c", "d" , "e", "f", "g", "h");
		
		List<String> resultOfAddAll = new ArrayList<>(listA);
		
		resultOfAddAll.addAll(listB);
		generateString("1. Result Of Add All Method(hợp) ", resultOfAddAll);
		
		List<String> resultOfRemoveAll = new ArrayList<>(listA);
		resultOfRemoveAll.removeAll(listB);
		generateString("2. Result Of Remove All Method(hiệu) ", resultOfRemoveAll);
		
		List<String> resultOfRetainAll = new ArrayList<>(listA);
		resultOfRemoveAll.retainAll(listB);
		generateString("3. Result Of Retain All Method(giao) ", resultOfRetainAll);
	}
}
