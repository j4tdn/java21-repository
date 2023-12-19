package generic.method;

import java.util.Arrays;

import bean.Item;

public class Ex01GenericMethod_ArrayPamam {
	
	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3};
		Long[] longs = {11L, 22L, 33L, 44L, 55L};
		Double[] doubles = {1.1d, 2.2d, 3.3d, 4.4d, 5.5d};
		String[] strings = {"a", "b", "c", "d", "e"};
		
		generateObjects("1. ints", ints);
		generateObjects("2. longs", longs);
		generateObjects("3. doubles", doubles);
		generateObjects("4. strings", strings);
		
		System.out.println("========== With generic ==========");
		
		generate("1. ints", ints);
		generate("2. longs", longs);
		generate("3. doubles", doubles);
		generate("4. strings", strings);
	}
	
	// Khi có tham số KDL x --> truyền vào KDL x hoặc con của x	
	// Object[] là mảng cha của bất kì mảng đối tượng nào
	public static void generateObjects(String prefix, Object[] objects) {
		System.out.println(prefix + " --> " + Arrays.toString(objects) + "\n");
	}
	
	public static <E> void generate(String prefix, E[] elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
}
