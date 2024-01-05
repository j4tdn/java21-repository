package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import common.GreenApplePredicate;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex01StrategyPattern_Review {

	public static void main(String[] args) {
		var inventory = DataModel.getApples();
		
		// filter all green apples in inventory
		
		// Cách 1: Implementation class
		var greenApples = filterApples(inventory, new GreenApplePredicate());
		generate("1. Green Apples (use implementation class)", greenApples);
		
		// Cách 2: Anonymous class
		greenApples = filterApples(inventory, new Predicate<Apple>() {

			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		generate("2. Green Apples (use anonymous class)", greenApples);
		
		 /* 
		   + Cách 3: Anonymous function = Lambda expression
		 Là đoạn code override hàm trừu tượng bên trong functional interface
		 nhưng mà không có tên hàm
		 cấu trúc: 
		 (danh sách tham số của hàm trừu tượng) -> {
		      body, override hàm trừu tượng
		 }
		 
		  + Lưu ý: 
		    - tham số của lamda --> không yêu cầu phải điền KDL
		    - nếu chỉ có 1 tham số --> có thể bỏ luôn (...)
		    - nếu body chỉ có 1 dòng --> bỏ luôn {}, bỏ luôn ;
		       . nếu return type !void --> bỏ luôn chữ return, 
		  */
		
		greenApples = filterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor());
		});
		generate("3. Green Apples (use anonymous function)", greenApples);
		
		// filter all red apples in inventory and weight heavier than 150g
		var redAndHeavyApple = filterApples(inventory, (Apple apple) -> {
			return "red".equals(apple.getColor()) && apple.getWeight() > 150;
		});
		generate("4. Red and heavy Apples (use anonymous function)", redAndHeavyApple);					
		
		// filter all apples from VietNam
		var vnApples = filter(inventory, (Apple apple) -> "vietnam".equalsIgnoreCase(apple.getCountry()));
		generate("5. Viet Nam apples (use anonymous function)", vnApples);
		
		// What is lambda ? <Interview>
		// 1:40:00 (1/2/2024)
		
	}
	
	// công thức chung của các điều kiện: boolean method(Apple apple);
	// thường: tạo ra 1 functional interface chứa hàm trừu tượng trên
	
	// --> Java có sẵn: Predicate<T>
	
	private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
		var result = new ArrayList<Apple>();

		for (var apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}

}
