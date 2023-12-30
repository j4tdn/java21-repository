package view.list;

import java.util.ArrayList;
import java.util.List;

import static utils.CollectionUtils.*;
public class Ex04AList_AddRemoveRetainAll {

	public static void main(String[] args) {
		List<String> listA = List.of("a", "b", "c", "d");
		List<String> listB = List.of("c", "d", "e", "f", "g", "k");

		List<String> resultOfAddAll = new ArrayList<>(listA); // hợp
		resultOfAddAll.addAll(listB);
		generateString("1. Result of add all method", resultOfAddAll);

		List<String> resultOfRemoveAll = new ArrayList<>(listA);
		resultOfRemoveAll.removeAll(listB);
		generateString("2. Result of remove all method", resultOfRemoveAll); // hiệu

		List<String> resultOfRetainAll = new ArrayList<>(listA); // giao
		resultOfRetainAll.retainAll(listB);
		generateString("3. Result of retain all method", resultOfRetainAll);

	}

	
}
