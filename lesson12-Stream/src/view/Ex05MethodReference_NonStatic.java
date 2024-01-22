package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReference_NonStatic {
	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>(DataModel.getApples());
		/*
		 Bài Tập: cho danh sách các Apple trong invetory :
		 1. Lấy danh sách tất cả các id trong iventory
		 
		 2. Lấy danh sách tất cả các color trong iventory
		 
		 3.Lấy danh sách tất cả các weight trong iventory
		 */
		var ids    = transfer(inventory, Apple::getId);
		var color  = transfer(inventory, Apple::getColor);
		var weight = transfer(inventory, Apple::getWeight);
		
		System.out.println("id ="+ids +"\ncolor= "+color + "\nweight "+weight);
		
		inventory.sort(Comparator.comparing(Apple::getId));
		for(Apple apple : inventory) {
			System.out.println(apple.getId());
		}
	}
	private static <T, R> List<R> transfer(List<T> elements, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for(T element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
}
