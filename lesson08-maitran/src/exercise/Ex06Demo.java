package exercise;

public class Ex06Demo {
	
	    public static boolean isPalindrome(String str) {
	        // Loại bỏ khoảng trắng và đưa chuỗi về chữ thường
	        str = str.replaceAll("\\s", "").toLowerCase();

	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
//	        String input = "A man a plan a canal Panama";
	    	String input = "adfdgfhjnbvcsxx";
	        if (isPalindrome(input)) {
	            System.out.println("Chuỗi là chuỗi đối xứng.");
	        } else {
	            System.out.println("Chuỗi không phải là chuỗi đối xứng.");
	        }
	    }
	

}
