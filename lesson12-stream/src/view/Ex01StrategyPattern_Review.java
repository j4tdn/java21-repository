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
		
		//filter all green apples in inventory
		
		// cách 1: Implementation class
		
		var greenApples = filterApples(inventory, new GreenApplePredicate());
		generate("1. Green apples (use implementation class)", greenApples);
		
		// cách 2: anonymous class
		 greenApples = filterApples(inventory, new Predicate<Apple>() {

			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		
		generate("2. Green apples (use anynymous class)", greenApples);
		
		// cách 3: anonymous function = Lambda expression
		// là đoạn code override hàm trừu tượng bên trong functional interface
		// nhưng mà ko có tên hàm
		// cấu trúc:
		// (dánh sách tham số của hàm trừu tượng) -> {
			// body, override hàm trừu tượng 
	    //});
		
		/*
		 Lưu ý:
		 + Tham số của lambda: --> ko yêu cầu phải điền KDL
		 + nếu chỉ có 1 tham số --> có thể bỏ luôn (...)
		 + nếu body chỉ có 1 dòng --> bỏ luôn {}
		 	. nếu return type !void --> bỏ luôn chữ return
		 	
		 */
		greenApples = filterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor());
		});
		generate("3. Green apples (use anonymous function)", greenApples);
		
		// filter all red apples and weight heavier than 150g
		var redAndHeavyApples = filterApples(inventory, apple -> {
			return "red".equals(apple.getColor()) && apple.getWeight() > 150;
		});
		generate("4. Red and Heavy Apples", redAndHeavyApples);
		
		// filter all apples from vietnam
		var vnApples = filter(inventory, apple -> 
							"vietnam".equalsIgnoreCase(apple.getCountry()));
		
		generate("5. Viet Nam Apples", vnApples);
	
		// Lambđa là gì
		
		// Lambda(anonymous function) là cách viết ngắn gọn để tạo ra giá trị/đối tượng
		// cho biến KDL functional interface
		
		// Dùng lambda chỗ nào ?
		
		// Chỗ nào cần khởi tạo functional interface -> dùng lambda cho code ngắn gon thay vì 
		// phải dùng anonymous class | implementation class
		
		// Vì sao lambda chỉ khởi tạo dc cho functional interface thôi, interface bình thường đc không
		
		// Không, vì lambda(hàm ko tên) override hàm trừu tượng trong interface ko có tên
		// nếu interface có nhiều hơn 1 hàm trừu tượng, nếu các hàm trừu tượng đó có cùng số lượng tham số, 
		// lúc override sẽ ko biết đang override cho hàm nào
		
		// Predicate<T> 
		// boolean test(T t);
		// boolean isTrue(T t);
		
		// Predicate<Apple> pre = (apple) ->.true;
		
		// Functional interface là gì
		
		// Là interface chỉ có 1 abstract method
		
		// Dùng FI chỗ nào
		
		// Thường dùng khi các đoạn code có dạng strategy pattern 
		
	}
	
	// công thức chung của các điều kiện: boolean method()
	// thường: tạo ra 1 functional interface chứa hàm trừa tượng trên
	
	// java có sẵn: predicate
	
	private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate){
		var result = new ArrayList<Apple>();
		
		for(var apple: inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
