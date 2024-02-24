package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;import bean.Apple;
import model.DataModel;

public class Ex05MethodReference_NonStatic {

	public static void main(String[] args) {
		
		var inventory = new ArrayList<>(DataModel.getApples());
		
		/*
		  Bài tập: Cho danh sách các apples trong inventory
		  1. Lấy danh sách tất cả các ID trong inventory
		  2. Lấy danh sách tất cả các Color trong inventory
		  3. Lấy danh sách tất cả các weight trong inventory
		 
		 */
		 
		// (Class A tenBien) -> tenBien.tenHam();
		// ClassA :: tenHam
		
		// hamB return KDL B
		
		// tenBien -> classA.hamB().hamC(tenBien)
		// ClassA.hamB()::hamC()
		var ids = transfer(inventory, apple -> apple.getId());
		var colors = transfer(inventory, Apple::getColor);
		var weights = transfer(inventory, apple -> apple.getWeight());
		
		inventory.sort(Comparator.comparing(Apple::getId));
		inventory.forEach(System.out::println);

		ids.forEach(id -> System.out.println(id));
		// colors.forEach(color -> System.out.println(color));
		colors.forEach(System.out::println);
		weights.forEach(weight -> System.out.println(weight));

		

	}

	private static <T, R> List<R> transfer(List<T> elements, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	

}
