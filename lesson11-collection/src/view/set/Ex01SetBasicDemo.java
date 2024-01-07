package view.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static utils.CollectionUtils.*;
public class Ex01SetBasicDemo {
	
	public static void main(String[] args) {
		//Set<T>
		//HashSet --> k đảm bảo thứ tự đưa vào
		//LinkedHashSet --> đảm bảo thứ tự đưa vào
		//Treeset --> Tự động sắp xếp các phẩn tử
		//         --> yêu cầu: T phải là còn của Comparable<T>
		
		Set<Integer> numbers = new TreeSet<>(); // tự động sắp xếp
		numbers.add(35);
		numbers.add(72);
		numbers.add(46);
		numbers.add(58);
		numbers.add(15);
		
		numbers.add(46); // trùng nên k add thêm
		
		// add một phần tử T mới vào  set
		// kiểm tra xem
		// 1. newValue có hashcode trùng với háhcode của phần tử nào trong Set chưa
		// 2. newValue có equals với phần tử nào trong set chưa
		
		// nếu vừa equals vừa có hashcode trùng --> newValue đã tồn tại trong add
		
		/*
		 
	    Set<E>
		  private Map<E, Object> map;
		
		set.add(e)
		
		map.put(e, PRESENT);
		
		--> add 1 phần tử vào set, đưa phần tử đó vào entry
		
		add(e) --> put(e, PRESENT)
		
		--> add thành công khi put key, PRESENT
		thành công
	 
	 */
		
		generate("1. Number", numbers);
	}
}
