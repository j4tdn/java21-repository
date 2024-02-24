package view.stream.practice;

import bean.Dish;
import bean.Item;
import bean.Store;
import model.DataModel;

import static utils.CollectionUtils.*;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Ex02MapFlatMap {
	
	public static void main(String[] args) {
		
		var menu = DataModel.mockDishes();
		
		System.out.println("============ Stream#map ============\n");
		var ids = menu.stream()
					.map(Dish::getId)
					.toList();
		generate("1. Ids", ids);
		
		var idCats = menu.stream()
				.map(d -> new SimpleEntry<>(d.getId(), d.getCategory()))
				.toList();
		generate("2. IdCats", idCats);
		
		var names = map(menu, Dish::getName);
		generate("3. Names", names);
		
		System.out.println("============ Stream#flatMap ============\n");
		// stream<collection<T>> -> flatMap -> stream<T>
		// stream<array<T>> -> flatMap -> stream<T>
		
		// Liệt kê danh sách tên của các store đã bán hàng, có items
		var items = DataModel.mockItems();
		
		// List<List<Store>> stores = items.stream() // Stream<Item>
		//  .map(Item::getStores) // Stream<List<Store>> {s1, s2}, {s1, s2, s3}, ...
		//	.collect(Collectors.toList()); // List<List<Store>>
		
		String storeNames = items.stream() // Stream<Item>
			.map(Item::getStores) //  Stream<List<Store>>
			.flatMap(list -> list.stream()) // Stream<Store> --> s1, s2, s1, s2, s3
			.map(Store::getName)
			.distinct()
			.collect(Collectors.joining(", "));
		
		System.out.println("Store Names: " + storeNames);
		
		// Dùng flatMap để flat(làm phẳng)/gộp các mảng 1 chiều trong mảng 2 chiều thành các ptu trong mảng 1 chiều
		Integer[][] a2D = {{1,5,7}, {2,2,2}, {8,7,1}};
		
		// Arrays.stream(Integer[]) --> Stream<Integer>
		// Arrays.stream(Integer[][]) --> Stream<Integer[]>
		
		Integer[] newA = Arrays.stream(a2D) // Stream<Integer[]>
			.flatMap(a1D -> Arrays.stream(a1D)) // Stream<Integer>
			.toArray(Integer[]::new);
		Arrays.stream(newA).forEach(e -> System.out.print(e + " "));
		
		System.out.println();
		
		int[][] a2DP = {{1,5,7}, {2,2,2}, {8,7,1}};
		int[] newAP = Arrays.stream(a2DP) // IntStream
			.flatMapToInt(a1DP -> Arrays.stream(a1DP))
			.toArray();
		Arrays.stream(newAP).forEach(e -> System.out.print(e + " "));
	}	
	
	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		return list.stream().map(e -> function.apply(e)).toList();
	}
	
}