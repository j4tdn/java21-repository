package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03StreamIntermediateAndTerminalOperations {
	
	public static void main(String[] args) {
		
		// hàm nào mà chấm xong vẫn trả về stream --> Intermediate operations
		
		// hàm nào mà chấm xong trả KDL khác(void, string, list...) --> Terminal operations
		
		List<Dish> menu = DataModel.mockDishes();
		
		System.out.println("Menu size: " + menu.size()); // 12
		
		// B1. Duyệt(12) ptử trong menu, lấy những dish có calo > 300 --> 10
		// B2. Lấy name của 10 dish được chọn từ bước 1
		// B3. Lấy 3 ptử trong 10 ptử từ bước 2
		
		List<String> names = menu.stream()
			.filter(d -> {
				System.out.println("filter: " + d.getId());
				return d.getCalories() > 300;
			})
			.map(d -> {
				System.out.println("map: " + d.getId());
				return d.getName();
			})
			.limit(3)
			.toList();
		
		CollectionUtils.generate("1. Name of dish which have calo > 300", names);
	}

}
