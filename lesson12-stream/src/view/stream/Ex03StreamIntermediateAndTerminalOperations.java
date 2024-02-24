package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamIntermediateAndTerminalOperations {
	
	public static void main(String[] args) {
		
		// Hàm nào mà chấm xong vẫn trả vè stream --> intermediate operations
		
		// Hàm nào mà chấm xong trả về KDL khác (void, list, string, ...) --> terminal operations
		
		List<Dish> menu = DataModel.mockDishes();
		
		System.out.println("menu size: " + menu.size());
		
		// B1. Duyệt(12) từng phần tử trong menu, lấy danh sách dish có calo > 300 --> 5 phần tử
		// B2. Lấy name của 5 cái dish được chọn từ B1
		// B3. Lấy 3 trong 5 từ B2
		
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
