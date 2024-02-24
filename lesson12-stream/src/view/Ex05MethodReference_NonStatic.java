package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataMode;

public class Ex05MethodReference_NonStatic {
	
	public static void main(String[] args) {
		//var inventorys = DataMode.getApples(); // sẽ bị lỗi do là dùng list of phải convert qua ArraysList
		
		List<Apple> inventorys = new ArrayList<>(DataMode.getApples());
		
		/*
		 * //Bài tập: Cho danh sách các apples trong inventory
		 * 
		 * 1. Lấy danh sách tất cả các id trong inventory
		 * 2.                          color
		 * 3.                           selesPrice
		 */
		
		//(ClassA tenBien) -> tenBien.tenHam();
		//ClassA::temHam (thường dùng nhiều nhất 90%)
		
		//hamB return KDL B
		//tenBien -> ClassA.hamB().hamC(tenBien)
		//ClassA.hamB()::hamC
		
		var ids = transfer(inventorys, apple -> apple.getId()); 
		//(Apple apple) chuyển thành apple   1 tham số nên sẽ bỏ luôn kiểu dữ liệu ngầm hiểu là kiểu Apple
		
		var colors = transfer(inventorys, apple -> apple.getColor());
		//kiểu MethodReference
		var colors2 = transfer(inventorys, Apple::getColor);
		
		var weights = transfer(inventorys, apple -> apple.getWeight());
		
		inventorys.sort(Comparator.comparing((Apple a) -> a.getId()));  // phải gõ tay k hiện gợi ý T_T
		
		inventorys.sort(Comparator.comparing((Apple a) -> a.getId()));
		inventorys.sort(Comparator.comparing(Apple::getId)); // in ra
		
		ids.forEach(id -> System.out.println(id));
		colors.forEach(color -> System.out.println(color));   //ít dùng hàm này
		weights.forEach(weight -> System.out.println(weight));
	}
	
	private static <T,R> List<R> transfer (List<T> elements ,Function<T, R> function){
		List<R> result = new ArrayList<>();
		for (T element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	private static List<Integer> getIds (List<Apple> intventorys) {
		List<Integer> ids = new ArrayList<>();
		for (Apple apple : intventorys) {
			ids.add(apple.getId());
		}
		return ids;
	}
	
	
}
