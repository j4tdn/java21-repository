package view.exam;

public class Ex03RemoveSpaceAndReverseString {
	public static void main(String[] args) {
		String inputStr = "      Welcome   to   JAVA10    class";
		String removeSpaceStr = removeSpaceString(inputStr);
		String reverseWordInStr = reverseWordInString(removeSpaceStr);
		System.out.println("result: " + reverseWordInStr);
	}
	// remove space unneed function
	public static String removeSpaceString(String inputStr) {
		// Remove spaces at the beginning and end of the string
		String trimString = inputStr.trim();
		// Remove spaces between words
		trimString = trimString.replaceAll("\\s+", " ");
		return trimString;
	}
	
	// reverse words of string
	public static String reverseWordInString(String inputStr) {
		StringBuilder reverseWordsOfString = new StringBuilder();
		String[] words = inputStr.split(" ");
		for(String word : words) {
			String reverseWords = reverseWord(word);
			reverseWordsOfString.append(reverseWords).append(" ");
		}
		return reverseWordsOfString.toString();
	}
	
	// reverse word
	public static String reverseWord(String input) {
		return new StringBuilder(input).reverse().toString();
	}
}
