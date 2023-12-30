package view.list;

import java.util.ArrayList;
import java.util.List;
import static utils.CollectionUtils.*;

public class Ex04List_AddRemoveRetainAll {

	public static void main(String[] args) {
		List<String> listA = List.of("a", "b", "c", "d");
		List<String> listB = List.of("c", "d", "e", "f", "g", "h");

		List<String> resultOfAddAll = new ArrayList<>(listA);
		resultOfAddAll.addAll(listB);
		generate("1. Result of Add All Method", resultOfAddAll);

		List<String> resultOfRemoveAll = new ArrayList<>(listA);
		resultOfRemoveAll.removeAll(listB);
		generate("2. Result of Remove All Method", resultOfRemoveAll);

		List<String> resultOfRetainAll = new ArrayList<>(listA);
		resultOfRetainAll.retainAll(listB);
		generate("3. Result of Retain All Method", resultOfRetainAll);
	}

}