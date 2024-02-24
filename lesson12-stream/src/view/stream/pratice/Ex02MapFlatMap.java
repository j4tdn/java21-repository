package view.stream.pratice;

import bean.Dish;
import bean.Item;
import bean.Store;
import model.DataMode;
import static utils.CollectionUtils.*;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Ex02MapFlatMap {

	public static void main(String[] args) {
		
		System.out.println("--StreamMap----");
		//1. Ví dụ Chỉ lấy mối Id
		var menu = DataMode.mockDishes();
		var ids = menu.stream()
				.map(Dish::getId)
				.toList();
	generate("1. Ids", ids);
	
		//2. Ví dụ lấy ID và 1 thuộc tính khác Category
	var idCats = menu.stream()
			.map(d -> new SimpleEntry<>(d.getId(), d.getCategory()))
			.toList();
	
	generate("2. IdCats", idCats);
	
	var names = map(menu, Dish::getName);
	generate("3.Name",  names);
	
	System.out.println("--StreamflatMap----");
	//stream<T> -> colection<T>
	
	//stream<collection<T>> -> flatMap -> stream<T> -> collection<T>
	
	// ví dụ 3: Liệt kê dánh sách tên của cá store đã bán hàng, có Items
	var items = DataMode.mockItems();
	
	// List<List<Store>> stores = items.stream() //stream<Item>
	// .map(Item::getStores)  //Stream <List<Store>> {s1,s2} , {s1, s2, s3}, /...
	// .collect(Collectors.toList());    //List<List<Store>>
	
	String storeNames = items.stream()
	.map(Item::getStores) //Stream<List<Store>>
	.flatMap(list -> list.stream()) //Stream<Store> -> s1, s2, s1, s2, s3
	.map(Store::getName)      //flatMap làm phẳng k có các { } 
	.distinct()
	.collect(Collectors.joining(", "));
	
	System.out.println("Store Name: " +storeNames);
	
	//Dùng FlatMap để flat(làm phẳng, gộp) các 
	
	Integer[][] a2D = {{1,5,7}, {2, 2, 2}, {8,7,1}};
	
	//Arrays.stream(Integer[]) -> Stream<Integer>
	//Arrays.stream(Integer[][] -> Stream<Integer[]>
	
	Integer[] newA = Arrays.stream(a2D)// Stream<Integer[]>
	.flatMap(a1D -> Arrays.stream(a1D)) //Stream<Integer>
	.toArray(Integer[]:: new);
	Arrays.stream(newA).forEach(e -> System.out.println(e + ""));
	 System.out.println("-------------");
	int [][] a2DP = {{1,5,7}, {2, 2, 2}, {8, 7, 1}};
	int [] newAP = Arrays.stream(a2DP) //IntStream
			.flatMapToInt(a1DP -> Arrays.stream(a1DP))
			.toArray();
	Arrays.stream(newAP).forEach(e -> System.out.println(e + " "));
	}
	

	
	
	private static <T,R> List<R> map(List<T> list, Function<T, R> function){
		return list.stream().map( e->  function.apply(e)).toList();
	}
	
	
}
