package view.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01SetBasicDemo {

	public static void main(String[] args) {
		// Set<T>
		// HashSet --> ko đảm bảo đúng thứ tự các phần tử đưa vào
		// LinkedHashSet --> đảm bảo đúng thứ tự các phần tử đưa vào
		// TreeSet --> tự động sắp xếp các phần tử
		// 		   --> yêu cầu: T phải là con của Comparable<T>
		
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(35);
		numbers.add(72);
		numbers.add(46);
		numbers.add(58);
		numbers.add(15);
		
		// add 1 phần tử T mới vào set
		// ktra xem
		// 1. newValue có hashcode 
		
	}
	
}
