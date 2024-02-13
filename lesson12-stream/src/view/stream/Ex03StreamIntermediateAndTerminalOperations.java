package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamIntermediateAndTerminalOperations {

	public static void main(String[] args) {
		
		// Hàm mô mờ chấm xong vẫn trả về stream --> intermediate operations
		
		// Hàm nào mà chấm xong trả về KDL khác (void, list, string...) --> terminal operations
		
		List<Dish> menu = DataModel.mockDishes();
		
		System.out.println("menu size: " +menu.size());
		
		// B1. Duyệt(12) từ phần tử trong menu, lấy những dish có calo > 300 --> 5 phần tử
		// B2. Lấy name của 5 dish được chọn từ B1
		// B3. lấy 3 trong 5 từ B2
		
		
		List<String> names = menu.stream() // Stream<Dish>
			.filter(d -> {
				System.out.println("filter --> " + d.getId());
				return d.getCalories() > 300;
			})
			.map(d -> {
				System.out.println("map --> " + d.getId());
				return d.getName();
			})
			.limit(3)
			.collect(Collectors.toList());
		
		CollectionUtils.generate("1. Name of dish which have calo > 300", names);
	}
}
