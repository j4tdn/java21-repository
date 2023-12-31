import java.util.Arrays;

public class Ex01Exerciese {
	

	  public static void main(String[] args) {
	        String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};

	        Arrays.sort(strings, (s1, s2) -> {
	            if ("Special".equals(s1)) {
	                return 1;
	            } else if ("Special".equals(s2)) {
	                return -1;
	            }

	            if (s1 == null) {
	                return 1;
	            } else if (s2 == null) {
	                return -1;
	            }

	            try {
	                Integer num1 = Integer.parseInt(s1);
	                Integer num2 = Integer.parseInt(s2);

	                if (num1.equals(num2)) { // trường hợp số
	                    // Trường hợp cả hai là số âm hoặc số dương
	                    return s1.compareTo(s2);
	                }
	             // Sắp xếp theo thứ tự số
	                return num1.compareTo(num2);  
	                
	                
	            } catch (NumberFormatException e) {            	
	            	  // Trường hợp không phải số, sắp xếp theo thứ tự chuỗi
	                return s1.compareTo(s2);
	            }
	        });
	        System.out.println(Arrays.toString(strings));
	    }
	}