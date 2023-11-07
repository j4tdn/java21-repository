package view.exercises;

import java.util.ArrayList;

public class TestEnum {
	public static void main(String[] args) {
		
//		String s1 = "I";
//		String s2 = "love";
//		String s3 = "Java";
//		
//		String joinedStr = String.join(" ", s1, s2, s3);
//		System.out.println(joinedStr);
		
		ArrayList<String> text = new ArrayList<>();
		
		// adding element to the arraylist
		text.add("Java");
		text.add("is");
		text.add("fun");
		
		String result;
		result = String.join("-", text);
		System.out.println(result);
		
		//replace
		
		String str1 = "bat ball";
		System.out.println(str1.replace("a", "o"));
	}
}