package view.map;


import java.util.Comparator.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import generic.class_interface.K21CustomerList;

import java.lang.Comparable;

public class Ex01MapBasicDemo {
	public static void main(String[] args) {
		//Map<Integer, String> vehicles = new HashMap<>(); // K (Integer), V (String)
		
		//var vehicles = new HashMap<Integer, String>();
		
		Map<Integer, String> vehicles = new HashMap<>();  //K(Integer), V(String)
		
//		Map<Integer, String> vehicles = new TreeMap()<>(new Comparator<T>() {
//			@Override
//			public int compare(Integer k1, Integer k2) {
//				if (k1 == null) {
//					return 1;
//				}
//				if (k2 == null) {
//					return -1;
//				}
//				return k2.compareTo(k1);
//		
		//Map<Integer, String> vehicles = new TreeMap<>(nullsFirst(comparing(K21CustomerList -> k, reverseOrder())));
		
		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "ĐN");
		vehicles.put(75, "Huế");
		vehicles.put(74, "Quảng trị");
		vehicles.put(73, "Quảng Bình");
		
		vehicles.put(75, "TTHuee"); //Override value if exting key
		vehicles.putIfAbsent(92, "Quảng Nôm"); //put new entry if key is not existed
		
		String value = vehicles.get(73);
		System.out.println("value by K = 73 -->" + value); // O(1)
		System.out.println("value by K = 88 -->" + vehicles.getOrDefault(88, "Not found")); // O(1)
		
		System.out.println("vehicles size " + vehicles.size());
		printf("1. Vehicles", vehicles);
		
		
		
		/*
		 * 
		 HashMap: k đảm bảo thứ tự đúng như lúc put vào
		 Linkeshashmap; đảm bảo duy trì đúng thứ tự các phần tử đưa vào
		 TreeMap: hỗ trợ tự động sort theo K, yêu cầu <K extends Comparable<?>
		 		  nếu ko phải là extends comparable<?> thì nó sẽ báo lỗi lúc runtime, casting
		 		  có thể sử dụng comparable để sort
		 * 
		 * 
		 * */
		
	}
	private static void printf(String prefix, Map<Integer, String> map) {
		System.out.println(prefix + "{");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry:entries) {
			System.out.println(" " + entry.getKey() + "-->" + entry.getValue());
		}
		System.out.println("}");
	}
}
