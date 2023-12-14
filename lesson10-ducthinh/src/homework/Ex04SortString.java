package homework;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04SortString {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
				"b", "xx"};
		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1 == null) {
					return 1;
				}
				if(o2 == null) {
					return -1;
				}
				if(o1.equals("Special")) {
					return -1;
				}
				if(o2.equals("Special")) {
					return 1;
				}
				boolean isNum1 = o1.matches("-?\\d+(\\.\\d+)?");
				boolean isNum2 = o2.matches("-?\\d+(\\.\\d+)?");
				if(isNum1 && isNum2) {
					int num1 = Integer.parseInt(o1);
					int num2 = Integer.parseInt(o2);
					return num1-num2;
				}
				return o1.compareTo(o2);
			};
		});
		ArrayUtils.generate("Sort String [asc]", strings);
		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1 == null) {
					return -1;
				}
				if(o2 == null) {
					return 1;
				}
				if(o1.equals("Special")) {
					return 1;
				}
				if(o2.equals("Special")) {
					return -1;
				}
				boolean isNum1 = o1.matches("-?\\d+(\\.\\d+)?");
				boolean isNum2 = o2.matches("-?\\d+(\\.\\d+)?");
				if(isNum1 && isNum2) {
					int num1 = Integer.parseInt(o1);
					int num2 = Integer.parseInt(o2);
					return num2-num1;
				}
				return o2.compareTo(o1);
			};
		});
		ArrayUtils.generate("Sort String [desc]", strings);
	}
}
