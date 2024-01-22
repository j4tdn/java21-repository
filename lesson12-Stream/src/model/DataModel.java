package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.Dish;
import common.Category;


public class DataModel {
private DataModel() {
		
	}
public static Map<Integer, String> mockVehicles(){
	var vehicles = new HashMap<Integer, String>();
	
	vehicles.put(92, "A Quảng Nam");
	vehicles.put(43, "Z Đà Nẵng");
	vehicles.put(75, "K Thừa Thiên Huế");
	//vehicles.put(null, "B Việt Nam");
	vehicles.put(74, "F Quảng Trị");
	vehicles.put(73, "C Quảng Bình");
	vehicles.put(73, "Z Quảng Bình");
	vehicles.put(11, "Cao Bằng");
	return vehicles;
	
}
	
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple(1, "green", 200d, "Vietnam"),	
				new Apple(16, "green", 300d, "Vietnam"),	
				new Apple(22, "red", 300d, "Lao"),	
				new Apple(4, "yellow", 400d, "Thailand"),	
				new Apple(17, "red", 600d, "Vietnam"),	
				new Apple(6, "green", 100d, "Thailand")	
		);
	}
	public static List<Dish> mockDishes() {
		return List.of(
			new Dish("D01", "Dish A1", 220, Category.FISH),	
			new Dish("D02", "Dish A2", 782, Category.MEAT),
			new Dish("D03", "Dish A3", 100, Category.VEGGIE),
			new Dish("D04", "Dish A4", 150, Category.EGG),
			new Dish("D05", "Dish B5", 220, Category.FISH),	
			new Dish("D06", "Dish B6", 782, Category.MEAT),
			new Dish("D07", "Dish C7", 111, Category.VEGGIE),
			new Dish("D08", "Dish C8", 1020, Category.EGG),
			new Dish("D09", "Dish D9", 220, Category.FISH),	
			new Dish("D10", "Dish D10", 777, Category.MEAT),
			new Dish("D11", "Dish E11", 111, Category.EGG),
			new Dish("D12", "Dish E12", 1500, Category.EGG)
		);
	}
	
}