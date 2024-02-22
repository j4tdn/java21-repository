package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import common.GreenApplePredicate;
import model.Datamodel;
import static utils.StreamUtils. *;

public class Ex01StrategyPattern_Review {
	public static void main(String[] args) {
		var inventory = Datamodel.getApples();
		/*
		 -filter all green apples in inventory
		 -filter all red apples and weight heavier than 150g
		 -Là đoạn code override hàm trừu tượng bên trong functional interface
		 -Nhưng mà không có tên hàm
		 */
		// cách 1: Anonymous function = Lambda expression
		var greenApples1 = filter(inventory, a -> a.getColor().equals("green"));
		generate("1 .Green Apples (Anonymous function)", greenApples1);
		
		// cách 2: Implementation
		var greenApples2 = filter(inventory, new GreenApplePredicate());
		generate("2 .Green Apples (implementation class)", greenApples2);
		
		// cách 3: Anonymous class
		var greenApples3 = filter(inventory, new Predicate<Apple>() {
			
			@Override
			public boolean test(Apple t) {
				if(!t.getColor().equals("green")) {
					return false;
				}
				return true;
			}
		});
		generate("3 .Green Apples (anonymous class)", greenApples3);
		// filter all red apples and weight heavier than 150g
		var greenApples4 = filter(inventory, a -> a.getColor().equals("red") && a.getWeight() > 150);
		generate("4. Red and heavier than 150g Apples", greenApples4);
		var vnApples = filter(inventory, Ex01StrategyPattern_Review::isVietNam);
		/*
		 Lưu ý:
		 + Tham số của lambda --> không yêu cầu điền KDL
		 + Nếu chỉ có 1 tham số --> có thể bỏ luôn (...)
		 + Nếu body chỉ có 1 dòng --> bỏ luôn {}
		 	.Nếu retyrn type !void --> bỏ luôn return
		 */
	}
	
	// Công thức chung của các điều kiện: boolean method(Apple apple)
	// thường: tạo ra 1 functional interface chứa hàm trừu tượng trên
	
	// Java có sẵn
	
	private static boolean isVietNam(Apple apple) {
		return "vietnam".equalsIgnoreCase(apple.getCountry());
	}
}
