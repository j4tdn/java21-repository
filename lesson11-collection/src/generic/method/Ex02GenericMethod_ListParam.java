package generic.method;

import java.util.Collection;
import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListParam {
	
	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 2, 3);
		List<Long> longs = List.of(11L, 22L, 33L, 44L, 55L);
		List<Double> doubles = List.of(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
		List<String> strings = List.of("a", "b", "c", "d", "e");
		List<Object> objects = List.of("a", 1, 2d, 7L);
		
//		generateObjects("1. ints", ints);	
//		generateObjects("2. longs", longs);
//		generateObjects("3. doubles", doubles);
//		generateObjects("4. strings", strings);
		generateObjects("5. objects", objects);
		
		System.out.println("========== Generic Type ==========	");
		
		generate("1. ints", ints);	
		generate("2. longs", longs);
		generate("3. doubles", doubles);
		// generate("4. strings", strings);
		// generate("5. objects", objects);	
		
	}
	
	// List<Object> --> KDL List --> tham số truyền vào Object
	// List<Integer> --> KDL List --> tham số truyền vào Integer
	// --> List<Object> và List<Integer> đều là KDL list với tham số truyền vào khác nhau
	// --> chúng ko phải cha con
	
	// List<Object> có thể là cha của ArrayList<Object>, LinkedList<Object>
	
	public static void generateObjects(String prefix, List<Object> lists) {
		System.out.println(prefix + " --> ");
		for (Object item: lists) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
	
	// <T> cho phép truyền bất kì KDL đối tượng nào
	// <T extends Number>: T cho phép truyền vào KDL đối tượng là Number hoặc là con của 
	//                     Number - giới hạn trên
	// CharSequence
	public static <T extends Number> void generate(String prefix, List<T> lists) {
		System.out.println(prefix + " --> ");
		for (T item: lists) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
	
}
