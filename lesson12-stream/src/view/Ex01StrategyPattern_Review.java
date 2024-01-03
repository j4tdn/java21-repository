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
		
		// filter all green apples in inventory
		
		// Cách 1: Implementation class
		var greenApples = filterApples(inventory, new GreenApplePredicate());
		generate("1. Green Apples(use implementation class)", greenApples);
		
		// Cách 2: Anonymous class
		greenApples = filterApples(inventory, new Predicate<Apple>() {
			
			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		
		generate("2. Green Apples(use anonymous class)", greenApples);
		
		/* 
		   Cách 3: Anonymous function = Lambda expression
		   Là đoạn code override hàm trừu tượng bên trong functional interface
		   nhưng mà ko có tên hàm
		   cấu trúc:
		   (danh sách tham số của hàm trừu tượng) -> {
				// body, override hàm trừu tượng
		   }
		   
		   Lưu ý:
		   + tham số của lambda --> ko yêu cầu phải điền KDL
		   + nếu chỉ có 1 tham số --> có thể bỏ luôn (...)
		   + nếu body chỉ có 1 dòng --> bỏ luôn {}
		   	 . nếu return type !void --> bỏ luôn chữ return
		*/
		greenApples = filterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor());
		});
		
		generate("3. Green Apples(use Anonymous function class)", greenApples);
		
		// filter red apples and weight heavier than 150g
		var redAndHeavyApples = filterApples(inventory, (Apple apple) -> {
			return "red".equals(apple.getColor()) && apple.getWeight() > 150;
		});
		generate("4. Red and Heavy Apples", redAndHeavyApples);
		
		// filter all apples from VietNam
		var vnApples = filterApples(inventory, apple -> 
			 "vietnam".equalsIgnoreCase(apple.getCountry())
		);
		generate("5. Viet Nam Apples", vnApples);
		
		// Lambda là gì
		
		// Lambda(anonymous function) là cách viết ngắn gọn để tạo ra giá trị/đối tượng
		// cho biến KDL functional interface
		
		// Dùng Lambda chỗ nào?
		
		// Chỗ nào cần khởi tạo function interface -> dùng lambda cho code ngắn gọn thay vì
		// phải dùng anonymous class | implementation class
		
		// Vì sao lambda chỉ khởi tạo đc cho cho function interface thôi, interface bình thường 
		
	}
	
	// Công thức chung của các điều kiện: boolean method(Apple apple)
	// Thường: tạo ra 1 functional interface chứa hàm trừu tượng trên
	
	// Java có sẵn: Predicate<T> 
	
	private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate){
		var result = new ArrayList<Apple>();
		
		for(var apple : inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
}
