package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReference_NonStatic {
	public static void main(String[] args) {

		var inventory = DataModel.getApples();
		
		/*
		 * Bài tập: Cho ds các apples trong inventory
		 * 1. Lấy ds tất cả các id trong inventory
		 * 2. Lấy ds tất cả các color trong inventory
		 * 3. Lấy ds tất cả các weight trong inventory
		 * */
		
		//(ClassA tenBien) -> tenBien.tenHam()
		// ClassA::tenHam
		
		// hamB return KDL B
		
		// tenBien -> ClassA.hamB().hamC(tenBien)
		// ClassA.hamB()::hamC
		
		var ids = tranfer(inventory, Apple::getId);
		var colors = tranfer(inventory, apple -> apple.getColor());
		var weights = tranfer(inventory, apple -> apple.getWeight());
		
		ids.forEach(id -> System.out.println(id));
		colors.forEach(System.out::println);
		weights.forEach(weight -> System.out.println(weight));
		
	}
	
	// E method(Apple apple)
	// apple.getId()
	// apple.getColor()
	// apple.getWeight()
	// T method(Apple apple)
	// R method(T t) --> Function<T, R>

	private static <T, R> List<R> tranfer(List<T> elements, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for(T element: elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	private static List<Integer> getIds(List<Apple> inventory) {
		List<Integer> ids = new ArrayList<>();
		for (Apple apple: inventory) {
			ids.add(apple.getId());
		}
		return ids;
	}
	
	private static List<String> getColors(List<Apple> inventory) {
		List<String> colors = new ArrayList<>();
		for (Apple apple: inventory) {
			colors.add(apple.getColor());
		}
		return colors;
	}
	
	private static List<Double> getWeights(List<Apple> inventory) {
		List<Double> weights = new ArrayList<>();
		for (Apple apple: inventory) {
			weights.add(apple.getWeight());
		}
		return weights;
	}
}
