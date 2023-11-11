package Ex02;

public class Ex02 {

	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		
		System.out.println("s1: " +s1);
		
		String largestNumber = findMax(s1);
		
		System.out.println("");
	}
	
	public static String findMax(String s) {
		String currentSequence = "";
		String maxSequence = "";
		
		for(int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if(Character.isDigit(currentChar)) {
				currentSequence += currentChar;
			}
		}
	}
}
