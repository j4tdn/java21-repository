package view.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04AList_AddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> listA = List.of("a", "b", "c", "d");
		List<String> listB = List.of("c", "d", "e", "f", "g", "h");
		// hàm hợp
		List<String> resultOfAddAll = new ArrayList<>(listA);
		resultOfAddAll.addAll(listB);
		generate("1. Result of add All Method", resultOfAddAll);
		// hàm hiệu
		List<String> resultOfRemoveAll = new ArrayList<>(listA);
		resultOfAddAll.removeAll(listB);
		generate("2. Result of remove All Method", resultOfAddAll);
		// hàm giao
		List<String> resultOfRetainAll = new ArrayList<>(listA);
		resultOfAddAll.retainAll(listB);
		generate("3. Result of retain All Method", resultOfAddAll);
		
	}
}
