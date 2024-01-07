package view;

import static utils.CollectionUtils.filter;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import common.GreenApplePredicate;
import model.DataMode;

public class Ex01StrategyPattern_Review {
	
	public static void main(String[] args) {
		
		var inventory = DataMode.getApples();
		
		// filter all green apples in inventory
		
		// Cách 1: Implementation class
		var greenApples = filter(inventory, new GreenApplePredicate());
		generate("1. Green Apples(use implementation class)", greenApples);
		
		// Cách 2: Anonymous class
		greenApples = filter(inventory, new Predicate<Apple>() {

			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		
		generate("2. Green Apples(use anonymous class)", greenApples);
		
		/*
		 Cách 3: Anonymous function = Lambda expression
		 Là đoạn code override hàm trừu tượng bên trong functional interface
		 nhưng mà không có tên hàm
		 cấu trúc: 
		 (danh sách tham số của hàm trừu tượng) -> {
		     // body, override hàm trừu tượng
		 }
		 
		 Lưu ý:
		  + tham số của lambda --> ko yêu cầu phải điền KDL
		  + nếu chỉ có 1 tham số --> có thể bỏ luôn (...)
		  + nếu body chỉ có 1 dòng --> bỏ luôn {}, bỏ luôn ;
		    . nếu return type !void --> bỏ luôn chữ return
		 */
		greenApples = filter(inventory, apple -> "green".equals(apple.getColor()));
		generate("3. Green Apples(use anonymous function)", greenApples);
		
		// filter all red apples and weight heavier than 150g
		var redAndHeavyApples = filter(inventory, apple -> "green".equals(apple.getColor()) && apple.getWeight() > 150d);
		generate("4. Red and Heavy Apples", redAndHeavyApples);
		
		// filter all apples from Viet Nam
		var AppleVN = filter(inventory, apple -> "vietnam".equalsIgnoreCase(apple.getCountry()));
		generate("5. All apple from Viet Nam", AppleVN);
		
		// Lambda là gì ?
		
		// Lambda là cách viết ngắn gọn để tạo ra giá trị/đối tượng cho biến KDL
		// functional interface
		
		// Dùng lambda khi nào ?
		
		// Chỗ nào cần khởi tạo funciton interface -> dùng lambda cho code ngắn gọn thay vì 
		// phải dùng anoymous class | implementation class
		
		// Vì sao lambda chỉ khởi tạo đc cho functional interface thôi, interface bình thường có được ko ?
		// không, vì lambda (hàm ko tên) override hàm trừu tượng trong interface ko có tên
		// nếu interface có nhiều 1 hàm trừu tượng, nếu các hàm trừu tượng đó có cùng số 
	}
	public static <T> List<T> filter(List<T> elements, Predicate<T> predicate){
		var result = new ArrayList<T>();
		
		for (var element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		
		return result;
	}
	
	// công thức chung của các điều kiện: boolean method(Apple apple)
	// thường: tạo ra 1 functional interface chứa hàm trừu tượng trên
	
	// Java có sẵn: Predicate<T>
	
	
}