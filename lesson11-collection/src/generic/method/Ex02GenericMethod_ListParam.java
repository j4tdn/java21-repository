package generic.method;

import java.util.Collection;
import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListParam {
	public static void main(String[] args) {
		List<Integer> ints =List.of(1, 2, 3, 4, 5) ;
		List<Long> longs = List.of(11L, 22L, 33L, 44L, 55L);
		List<Double> doubles = List.of(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
		List<String> strings = List.of("a", "b", "c", "d", "e" );
		List<Object> objects = List.of("a", 1, 2d, 7L);
		//generate("1. Ints", ints);  fail
		//generate("2. longs", longs);   fail
		//generate("3. doubles", doubles);   fail
		//generate("4. strings", strings);   fail
		generateObject("5. Object", objects);
		
		System.out.println("---- Generic Type----");
		
		generate("1. Ints", ints); 
		generate("2. longs", longs); 
		generate("3. doubles", doubles); 
		//generate("4. strings", strings);
		//generate("5. Object", objects);
		
	}
	
	//List<objec> --> KDL list --> tham số truyền vào là Object
	//List<Integer> --> KDL list --> tham số truyền vào là Integer
	//-->List Object laf List Integer đều là KDL List vơi tham số truyền vào khác nhau
	//--> trúng không phải là cha con
	//List <object> có thể là cha cả ArrayList<Object>, LinkedList<Object>
	public static void generateObject(String prefix, List<Object> collection) {
		System.out.println(prefix + " --> ");
		for (Object item : collection) {
			System.out.println("+ " + item);
		}
		System.out.println();

	}
	// <T> Cho phép truyền vào bất kỳ KDL đối tượng nào vào
	//<T extends Number>: T cho phép truyền vào KDL đối tượng là Number hoặc con của Number
	//					: Giới hạn trên
	
	//CharSequence: Cha của String
	public static<T extends Number> void generate(String prefix, List<T> collection) {
		System.out.println(prefix + " --> ");
		for (T item : collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
}
