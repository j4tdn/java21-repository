package view.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04_AList_AddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> listA =List.of("a", "b", "c", "d");
		List<String> listB =List.of("c", "d", "e", "f", "g", "h");
		
		List<String> resultOfAddAlll = new ArrayList<>(listA);
		resultOfAddAlll.addAll(listB);
		generateString("1. add", resultOfAddAlll);
		
		List<String> resultOfRemoveAll = new ArrayList<>(listA);
		resultOfRemoveAll.removeAll(listB);
		generateString("1. hieu", resultOfRemoveAll);
		
		List<String> resultOfRetainAll = new ArrayList<>(listA);
		resultOfRetainAll.retainAll(listB);
		generateString("1. giao", resultOfRetainAll);
	}
	
	
}
