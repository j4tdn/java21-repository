package generic.method;

import java.util.Collection;
import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListParam {

	public static void main(String[] args) {
		List<Integer> ints = List.of(1,2,3,4,5);
		List<Long> longs = List.of(11L,22L,33L,44L,55L);
		List<Double> doubles = List.of(1.1d,2.2d,3.3d,4.4d,5.5d);
		List<String> strings = List.of("a","b","c","d","e");
		List<Object> objects = List.of("a", 1, 2d, 7L);
		
		//generateObject("1. Ints", ints);
		//generateObject("2. Ints", longs);
		//generateObject("3. Ints", doubles);
		//generateObject("4. Ints", strings);
		generateObject("5. Objects", objects);
		
		System.out.println("=== Generic Type ===");
		
		generate("1. Ints", ints);
		generate("2. Ints", longs);
		generate("3. Ints", doubles);
		generate("4. Ints", strings);
		generate("5. Objects", objects);
	}
	
	// List<Object> --> KDL List --> tham số truyền vào Object
	// List<Integer> --> KDL List --> tham số truyền vào Integer
	// --> List<Object> và List<Interger> đều là KDL List với tham số truyền vào khác nhau
	// --> chúng không phải cha con
	
	// List<Object> có thể là cha của ArrayList<Object>, LinkedList<Object>
	
	
	public static void generateObject(String prefix, List<Object> collection) {
		System.out.println(prefix + " --> ");
		for (Object item: collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
	
	
	// <T> cho phéo truyền bất kỳ KDL đối tượng nào vào
	// <T extend Number>: T cho phéo truyền bất kỳ KDL đối tượng nào vào
	//					: giới hạn trên
	public static <T> void generate(String prefix, List<T> collection) {
		System.out.println(prefix + " --> ");
		for (T item: collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}

}
