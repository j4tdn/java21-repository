package view.stream;


import java.util.List;

import bean.Dish;
import model.DataMode;

public class Ex03StreamIntermediateAndTerminalOperations {
	
	public static void main(String[] args) {
		
		// Hàm nào mà chấm xong vẫn trả về stream --> intermediate operations
		
		// Hàm nào mà chấm xong trả về KDL khác (void, list, string ..) --> terminal operations
		
		List<Dish> menu = DataMode.mockDishes();
		
		System.out.println("menu size: " + menu.size()); // 12
		
		// B1. Duyệt(12) từ phần tử trong menu, lấy những dish có calo > 300 --> 10 phần tử
		// B2. Lấy name của 10 dish được chọn từ B1
		// B3. Lấy 3 trong 10 từ B2
		
		menu.stream() // Stream<Dish>
			.filter(d -> {
				System.out.println("filter --> " + d.getId());
				return d.getCalories() > 300;
			}) // Stream<Dish>
			.map(d -> {
				System.out.println("map --> " + d.getId());
				return d.getName();
			}) // Stream<String>
			.limit(3); // Stream<String>
			// .count();
			// .collect(Collectors.toList()); // List<String>
		
		// CollectionUtils.generate("1. Name of dish which have calo > 300", names);
		System.out.println("hello");
		
	}
	
}