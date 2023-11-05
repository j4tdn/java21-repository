package exercise;

import static utils.validationUtils.isValidString;

import java.util.Scanner;

public class Ex07Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";

		do {
			System.out.println("\nEnter your name: ");
			input = sc.nextLine().strip().replaceAll("\\s+", " ");
		} while (!isValidString("^[a-z]{1,255}+$", input,
				"The string should contain only lowercase letters from a to z."));
		findLongestCommonSubstring(input);
		sc.close();
	}

	public static void findLongestCommonSubstring(String input) {
	    String longestSubstring = "";
	    char commonChar = ' ';
	    int maxCommonLength = 0;
	    int startIndex = -1;

	    for (int i = 0; i < input.length(); i++) {
	        for (int j = i + 1; j <= input.length(); j++) {
	            String substring = input.substring(i, j);
	            int len = substring.length();

	            char firstChar = substring.charAt(0);
	            boolean isCommon = true;

	            for (int k = 1; k < len; k++) {
	                if (substring.charAt(k) != firstChar) {
	                    isCommon = false;
	                    break;
	                    
	                }
	            }

	            if (isCommon && len > maxCommonLength) {
	                maxCommonLength = len;
	                longestSubstring = substring;
	                commonChar = firstChar;
	                startIndex = i;
	            }
	           
	        }
	    }

	    System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxCommonLength);
	    System.out.println(longestSubstring + " [" + commonChar + "] với vị trí bắt đầu:" + " [" + startIndex + "]");
	    
	}

}
