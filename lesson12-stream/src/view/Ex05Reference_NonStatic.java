package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05Reference_NonStatic {
	
	public static void main(String[] args) {
		
		var inventory = DataModel.getApples();
		
		List<Apple> inventory_mutable = new ArrayList<>(DataModel.getApples());
		
		/*
		 Bài tập: Cho danh sách các apples trong inventory
		 
		 1. Lấy danh sách tất cả các id trong inventory
		 2. Lấy danh sách           color
		 3.                         sell price
		 
		 */
		var ids = transfer(inventory_mutable, Apple::getId);
		
		// (ClassA tenBien) -> tenBien.tenHam();
		// ClassA::tenHam
 		
		// ham B return KDL B
		
		// tenBien -> ClassA.hamB().hamC(tenBien)
		// ClassA.hamB()::hamC
		var colors = transfer(inventory_mutable, apple -> apple.getColor());
		var weights = transfer(inventory_mutable, apple -> apple.getWeight());
		
		inventory_mutable.sort(Comparator.comparing(Apple::getId));
		
		ids.forEach(id -> System.out.println(id));
		colors.forEach(color -> System.out.println(color));
		weights.forEach(weight -> System.out.println(weight));
	}
	
	
	private static List<Integer> getId(List<Apple> inventory_mutable) {
		List<Integer> ids = new ArrayList<>();
		for (Apple apple : inventory_mutable) {
			ids.add(apple.getId());
		}
		return ids;
	}
	
	private static <T, R> List<R> transfer(List<T> elements, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for(T element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	
}
