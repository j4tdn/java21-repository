package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReference_NonStatic {
	public static void main(String[] args) {
		
//		var inventory = DataModel.getApples();
		
		List<Apple> inventory = new ArrayList<>(DataModel.getApples());
		/*
		 bài tập: Cho danh sách các apples trong inventory
		 1. Lấy danh sách tất cả các id trong inventory
		 2. Lấy danh sách tất cả các color trong inventory
		 3.                          salesPrice
		 */
		
//		var ids = transfer(inventory, apple -> apple.getId());
		var ids = transfer(inventory, Apple::getId);
		var colors = transfer(inventory, apple -> apple.getColor());
		var weights = transfer(inventory, apple -> apple.getWeight());
		
		
		
		ids.forEach(System.out::println);
		colors.forEach(color -> System.out.println(color));
		weights.forEach(weight -> System.out.println(weight));
	}
	
	private static <T, R> List<R> transfer(List<T> elements, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for(T element: elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	private static List<Integer> getIds(List<Apple> inventory){
		List<Integer> ids = new ArrayList<>();
		for(Apple apple: inventory) {
			ids.add(apple.getId());
		}
		return ids;
	}
	
	private static List<String> getColors(List<Apple> inventory){
		List<String> colors = new ArrayList<>();
		for(Apple apple: inventory) {
			colors.add(apple.getColor());
		}
		return colors;
	}
	
	private static List<Double> getWeights(List<Apple> inventory){
		List<Double> weights = new ArrayList<>();
		for(Apple apple: inventory) {
			weights.add(apple.getWeight());
		}
		return weights;
	}
}
