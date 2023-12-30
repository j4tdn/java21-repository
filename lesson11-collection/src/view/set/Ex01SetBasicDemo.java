package view.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static utils.CollectionUtils.*;

public class Ex01SetBasicDemo {
	
	public static void main(String[] args) {
		// Set<T>
		// HashSet --> ko đảm bảo đúng thứ tự phần tử đưa vào
		// LinkHashSet --> Đảm bảo thứ tự phần tử đưa vào
		// TreeSet --> tự động sắp xếp các phần tử 
		//         --> yêu cầu: T phải là con của Comparable<T> 
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(35);
		numbers.add(72);
		numbers.add(46);
		numbers.add(58);
		numbers.add(15);
		
		
		// add một phần tử T mới vào Set
		// kiểm tra xem 
		// 1. newValue có hashcode trùng với hashcode của phần tử nào trong SET chưa
		// 2. newValue có equals với phần tử nào trong SET chưa
		
		// nếu vừa equals vừa có hashcode trùng  --> newValue đã tồn tại --> k thêm mới
		// ngược lại --> newValue chưa tồn tại trong SET --> thêm thành công
		
		numbers.add(46);
		generate("1. Numbers", numbers);
	}
}
