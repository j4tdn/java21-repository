package reneric.method;

import java.util.Collection;
import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListParam {

	public static void main(String[] args) {
		
		List<Integer> ints = List.of(1,2,3,4,5);
		List<Long> longs = List.of(11L,22L,33L,44L,55L);
		List<Double> doubles = List.of(1.1d,2.2d,3.3d,4.4d,5.5d);
		List<String> strings = List.of("a","b","c","d","e");
		
		
		System.out.println("======= Generic Type ========");
		generate("1. Generic ints", ints);
		generate("2. Generic longs", longs);
		generate("3. Generic doubles", doubles);
//		generate("4. Generic strings", strings);
		
	}
	
	
	// <E> cho phep truyen bat kif KDL doi tuong nao
	// <E extends Number>: E cho phep truyen vao KDL doi tuong la Number hoac con cua NUmber
	//                   : gioi han tren
	// --> NUmber        : gioi han cua so
	// --> CharSequence  : gioi han cua chuoi
	public static <E extends Number> void generate(String prefix,List<E> collection) {
		System.out.println(prefix+ " -->");
		for(E item: collection) {
			System.out.print(" "+ item);
		}
		System.out.println();
		System.out.println();
	}
	
	
	// List<Object> --> KDL List --> tham so truyen vao Object
	// List<Interger> --> KDL List --> tham so truyen vao Interger
	// --> List<Object> --> vaf List<Interger> deu la KDL List vowis tham so truyen vao khac nhau
	// --> chung khong phai cha con
	
	// List<object> cos the la cha con cua ArrayList<Object> , LinkedList<Oject>
	
	public static void generateString(String prefix,List<Object> collection) {
		System.out.println(prefix+ " -->");
		for(Object string: collection) {
			System.out.println("+ "+ string);
		}
		System.out.println();
	}
	
}
