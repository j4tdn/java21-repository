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

		// Implementation class
		var greennApples = filterApples(inventory, new GreenApplePredicate());
		generate("1.Green Apple(use Implementation class)", greennApples);

		// filter: all green Apples in inventory
		// Cách 2: anonymous class
		greennApples = filterApples(inventory, new Predicate<Apple>() {

			@Override
			public boolean test(Apple apple) {

				return "green".equals(apple.getColor());
			}
		});
		generate("2.Green Apple(use anonymous class)", greennApples);

		/*Cách 3: anonymous function = Lambda expression
		 Lambda: là đoạn code override hàm trừu tượng bên trong functional interface
		 nhưng không có tên hàm
		 Cấu trúc: (danh sách tham số)-> {
		            body, override hàm trường tượng
		*/
		
		/*
		 Lưu ý: 
		 + tham số của lambda --> không yêu cầu điền KDL
		 + nếu chỉ có 1 tham số--> có thể bỏ luôn ()
		 +nếu body chỉ có 1 dòng --> bỏ luôn {}
		 nếu return type !void --> bỏ luôn chữ return 
		 */
		
		greennApples = filterApples(inventory, (Apple apple)-> {
			return "green".equals(apple.getColor());
		});
		generate("3.Green Apple", greennApples);
	    
		// filter: all red apple and weight heavier than 150g
		var redAndHeavyApple = filterApples(inventory, (Apple apple)->{
			return "red".equals(apple.getColor()) && apple.getWeight() > 400;
		});
		generate("4.Red and Heavy Apples", redAndHeavyApple);
		
		//filter all apples from vietnam
		var vnApple = filter(inventory, apple -> "vietnam".equalsIgnoreCase(apple.getCountry()));
		generate("5. Viet Nam apples", vnApple);
		
		
		/*
		 
		 
		 */
	}

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
