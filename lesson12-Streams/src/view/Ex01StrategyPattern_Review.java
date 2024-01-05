package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import common.GreenApplePredicate;
import model.DataModel;

import static Utils.PredicateUtils.*;

public class Ex01StrategyPattern_Review {

	public static void main(String[] args) {

		var inventory = DataModel.getApples();

		// filter all green apple in inventory

		// cách 1 : Implementation class
		var greenApple = filterApples(inventory, new GreenApplePredicate());
		generate("1. Green Apples(use implementation class", greenApple);

		// cách 2 : Anonymus class
		greenApple = filterApples(inventory, new Predicate<Apple>() {
			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});

		generate("2. Green Apples(use anonymus class", greenApple);

		// cách 3 : anonymus function = Lambda expression
		// Là đoạn code override hàm trừu tượng bên trong functional interface
		// nhưng mà ko có tên hàm
		// cấu trúc:
		// )danh sách tham số của hàm trừu tượng) ->{
		// body, override hàm trừu tượng
		// }
		greenApple = filterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor());
		});
		generate("3. Green Apples(use anonymus functiona", greenApple);
		
		/*
		 Lưu ý 
		 + Tham số của lambda --> ko yêu cầu phải điền KDL
		 + Nếu chỉ có 1 tham số --> có thể bỏ luôn(...)
		 + Nếu body chỉ có 1 dòng --> bỏ luôn {}
		 	.Nếu return type |void --> bỏ luôn chữ return
		 */
		
		// filter all red apples and weight geavier than 150g
		var redAndHeavyApple = filterApples(inventory, (Apple apple) ->{
			return "red".equals(apple.getColor()) && apple.getWeight() > 150d;
		});
		generate("4. Filter all red apples and weight geavier than 150g", redAndHeavyApple);
		
		// filter all apples from Vietnam
		var vietnamApple = filter(inventory, (Apple apple) -> {
			return "vietnam".equalsIgnoreCase(apple.getCountry());
		});
		generate("5. filter all apples from Vietnam", vietnamApple);
		
	}
	
	
	
	
	// công thức chung cua các điều kiện: boolean method(Apple apple)
	// thường : tạo ra 1 functinal interface chứa hàm trừu tượng trên

	// JAVA có sẵn : Predicate<T>
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
