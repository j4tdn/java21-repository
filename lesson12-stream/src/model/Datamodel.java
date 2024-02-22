package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.Dish;
import bean.Item;
import bean.Store;
import common.Kind;

public class Datamodel {
	private Datamodel() {
		
	}
	
	public static List<Apple> getApples() {
		return List.of(
				new Apple(1, "green", 200d, "Vietnam"),	
				new Apple(16, "green", 300d, "Vietnam"),	
				new Apple(22, "red", 300d, "Lao"),	
				new Apple(4, "yellow", 400d, "Thailand"),	
				new Apple(17, "red", 600d, "Vietnam"),	
				new Apple(6, "green", 100d, "Thailand")	
		);
	}
	public static List<Dish> getDishes() {
		return Arrays.asList(
				new Dish("1", "D1", 308, Kind.FISH, false),
				new Dish("2", "D2", 620, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true),
				new Dish("4", "D4", 308, Kind.FISH, false),
				new Dish("5", "D5", 480, Kind.MEAT, false),
				new Dish("6", "D6", 480, Kind.MEAT, false),
				new Dish("7", "D7", 818, Kind.MEAT, false));
	}
	public static Map<Integer, String> mockVehicles(){
		var vehicles = new HashMap<Integer, String>();
		
		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Quảng Nam");
		vehicles.put(75, "Thừa Thiên Huế");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");
//		vehicles.put(null, "Việt Nam");
		vehicles.put(75, "T-T-Huế");
		
		return vehicles;
	}
	
	public static List<Item> mockItems(){
		Store s1 = new Store(1, "Store 1");
		Store s2 = new Store(2, "Store 2");
		Store s3 = new Store(3, "Store 3");
		Store s4 = new Store(4, "Store 4");
		Store s5 = new Store(5, "Store 5");
		Store s6 = new Store(6, "Store 6"); // chưa bán hàng
		Store s7 = new Store(7, "Store 7"); // chưa bán hàng
				
		return List.of(
				
				new Item(101, "Item 101", new BigDecimal("202"), List.of(s1, s2)),
				new Item(102, "Item 102", new BigDecimal("303"), List.of(s1, s2, s3)),
				new Item(103, "Item 103", new BigDecimal("404"), List.of(s1, s2, s3, s4)),
				new Item(104, "Item 104", new BigDecimal("505"), List.of(s1, s2, s3, s4, s5))
				
				);
				
	}
}
