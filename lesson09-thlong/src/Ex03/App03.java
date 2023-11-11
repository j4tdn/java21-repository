package Ex03;

public class App03 {
	public static void main(String[] args) {
		String str = "Welcome  to JAVA10  class";
		reverseString(str);

	}

	public static void reverseString(String str) {
		String result = "";
		String regex = "\\s+";
		String strRemoveSpace = str.strip().replaceAll("\\s+", " ");
		for (int i = strRemoveSpace.length(); i > 0; i--) {
			char charText = strRemoveSpace.charAt(i - 1);
			String strText = Character.toString(charText);
			result = result.concat(strText);
		}
		String[] tokens = result.strip().split(regex);
		for (int i = tokens.length; i > 0; i--) {
			System.out.print(tokens[i - 1] + " ");
		}

	}

}
