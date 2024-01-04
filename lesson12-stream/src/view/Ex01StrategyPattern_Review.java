package view;

import static utils.CollectionUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import common.GreenApplePredicate;
import model.DataModel;

public class Ex01StrategyPattern_Review {
	
	public static void main(String[] args) {
		var inventory = DataModel.getApples();
		
		// Filter all green apples in inventory
		
		// Cách 1: implementation class
		
		var greenApples = filterApple(inventory, new GreenApplePredicate());
		generate("1. Green Apples(use implementation class", greenApples);
		
		// Cách 2: Anonymous class
		
		 greenApples = filterApple(inventory, new Predicate<Apple>() {
			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		}); 
		generate("2. Green Apples(use anonymous class", greenApples);
		
		// Cách 3: Anonymous function = Lamda expression
		// là đoạn code override hàm trừu tượng bên trong functional interface 
		// nhưng mà không có tên hàm 
		// cấu trúc: 
		// (danh sách tham số) -> { body(override hàm trừu tượng}
		
		// Lamda là gì? 
		// lamda(anonymous function) là cách viết ngắn gọn 
		/*
		 Lưu ý: 
		 + Tham số của lamda --> không yêu cầu phải điền KDL
		 + nếu chỉ có 1 tham số --> có thể bỏ luôn (...)
		 + nếu body chỉ có 1 dòng --> bỏ luôn {}, bỏ luôn ;
		     . Nếu return type !void --> bỏ luôn chữ return
		 */
		greenApples = filterApple(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor()); 
		});
		
		generate("3. Green Apples(use anonymous function", greenApples);
		
		
		// filter all red apples and weight heavier than 150g
		var redAndHeavyApple = filterApple(inventory, (Apple apple) -> {
			return "red".equals(apple.getColor()) && apple.getWeight() > 400;
		});
		generate("4. Red And Heavy Apple(use anonymous function", redAndHeavyApple);
		
		
		//filter all apple from vietnam
		
		var vnApples = filter(inventory,  apple ->  "vietnam".equalsIgnoreCase(apple.getCountry()));
		generate("5. Apple from Vietnam (use anonymous function", redAndHeavyApple);
		
	}
	// công thức chung của các điều kiện: boolean method(Apple apple)
	// thường: tạo ra 1 functional interface chứa hàm trừu tượng trên
	
	//  Java có sẵn: Predicate<T>
	
	private static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate) {
		
		var result = new ArrayList<Apple>();
		
		for(var apple: inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
		
	}
}
