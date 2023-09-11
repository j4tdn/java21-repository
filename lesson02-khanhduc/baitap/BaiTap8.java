package baitap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class BaiTap8 {
	

	    public static void main(String[] args) {
	        Set<Integer> set = new HashSet<>();
	        Random random = new Random();

	        while (set.size() < 5) {
	            int randomNumber = random.nextInt(11) + 20; 
	            set.add(randomNumber);
	        }

	        System.out.println("5 số nguyên ngẫu nhiên không trùng nhau từ 20 đến 30:");
	        for (int number : set) {
	            System.out.println(number);
	        }
	    }
	}
