package generic.method;

import java.util.Collection;
import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListParam {
	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Long> longs = List.of(11L, 22L, 33L, 44L, 55L);
		List<Double> doubles = List.of(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
		List<String> strings = List.of("a", "b", "c", "d", "e");
		System.out.println("\\\\\\====== Generic Type ======//////");
		generate("1. Ints", ints);
		generate("2. longs", longs);
		generate("3. doubles", doubles);
		//generate("4. strings", strings);
		
	}
	// List<Object> KDL là List, tham số truyền vào là object
	// List<Integer> KDL List, tham số truyền vào Integer
	// --> List<Object> và List<Integer> đều là KDL List với tham số truyền vào khác nhau 
	// --> Chúng không phải cha con
	
	// List<Object> có thể là cha của ArrayList<Object>, LinkedList<Object>
	// <T extend >: T cho phép truyền bất kỳ KDL đối tượng là Number hoặc con của Number
	//			  : Giới hạn trên
	public static <E extends Number> void generate(String prefix, List<E> collection) {
		System.out.print(prefix + " --> ");
		for(E item: collection) {
			System.out.print(item + ", ");
		}
		System.out.println();
	}
	
	
}
