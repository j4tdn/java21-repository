package view.stream.practice;

import bean.Dish;
import bean.Item;
import bean.Store;
import model.Datamodel;
import static utils.StreamUtils.*;

import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex02MapFlatMap {
	
	public static void main(String[] args) {
		
		var menu = Datamodel.getDishes();
		
		System.out.println("========== Stream#map ==========\n");
		var ids = menu.stream()
				.map(Dish::getId)
				.toList();
		generate("1. Ids", ids);
				
	
		var idCats = menu.stream()
				.map(d -> new SimpleEntry<>(d.getId(), d.getCalories()))
				.toList();
		
		generate("2. Ids and category", idCats);
		
		var names = map(menu, Dish::getName);
		
		generate("3. Names", names);
		
		System.out.println("========== Stream#flatMap ==========\n");
		//Stream<T> -> collection<T>
		
		//Stream<collection<T>> -> flatMap -> stream<T> -> collection<T>
		
		// Liệt kê danh sách tên của các store đã bán hàng, có item
		var items = Datamodel.mockItems();
		
//		List<List<Store>> stores = items.stream() // stream
//			.map(Item::getStores) // Stream<List<Store>>
//			.collect(Collectors.toList());
		
		String stores = items.stream() // Stream<Item>
			.map(Item::getStores)
			.flatMap(list -> list.stream())
			.map(Store::getName)
			.distinct()
			.collect(Collectors.joining(", "));
		System.out.println("Store : " +  stores);
		
		// Dùng flatMap để flat(làm phẳng)/ gộp các mảng 1 chiều trong mảng 2 chiều thành các ptu trong mảng 1 chiều
		Integer[][] a2D = {{1,5,7}, {2,2,2}, {8,7,1}};
		
		// Arrays.stream(Integer[]) --> Stream<Integer<
		// Arrays.stream(Integer[][]) --> Stream<Integer[]>
		Integer[] newA = Arrays.stream(a2D)
			.flatMap(a1D -> Arrays.stream(a1D))
			.toArray(Integer[]::new);
		Arrays.stream(newA).forEach(e -> System.out.print(e + " "));
		
		int[][] a2DP = {{1,5,7}, {2,2,2}, {8,7,1}};
		Arrays.stream(a2DP)
			.flatMapToInt(a1DP -> Arrays.stream(a1DP))
			.toArray();
		System.out.println();
		Arrays.stream(newA).forEach(e -> System.out.print(e + " "));
		
		
		
	}
	
	private static <T, R> List<R> map(List<T> list, Function<T, R> function){
		return list.stream().map(e -> function.apply(e)).toList();
	}
}
