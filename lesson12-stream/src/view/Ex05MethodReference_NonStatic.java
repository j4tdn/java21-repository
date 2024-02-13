package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReference_NonStatic {

	public static void main(String[] args) {
		var inventory = new ArrayList<>(DataModel.getApples());
		
		/*
		 Bài tập: Cho ds các apples trong inventory
		 1. Lấy ds all Id trong inventory
		 2. Lấy ds all color trong inventory
		 3. Lấy ds all weight trong inventory
		 */
		
		// (ClassA tenBien) -> tenBien.tenHam();
		// ClassA::tenHam
		
		// hamB return KDL B
		
		// tenBien -> ClassA.hamB().hamC(tenBien)
		// ClassA.hamB()::hamC
		
		var ids = transfer(inventory, apple -> apple.getId());
		var colours = transfer(inventory, Apple::getColor);
		var weights = transfer(inventory, apple -> apple.getWeight());
		
		inventory.sort(Comparator.comparing(Apple::getId));
		
		ids.forEach(id -> System.out.println(id));
		colours.forEach(System.out::println);
		weights.forEach(weight -> System.out.println(weight));
		
//		System.out.println("ids: " + ids + "\n" +
//						   "colours: " + colours + "\n" +
//						   "weights: " + weights 
//				);
	}
	
	private static List<Integer> getId(List<Apple> inventory){
		List<Integer> ids = new ArrayList<Integer>();
		for(Apple apple:inventory) {
			ids.add(apple.getId());
		}
		return ids;
	}
	
	private static <T,R> List<R> transfer(List<T> elements, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for(T element: elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
}
