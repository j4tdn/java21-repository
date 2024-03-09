package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.BankTransaction;
import bean.Dish;
import bean.Item;
import bean.Store;
import common.Kind;

public class Datamodel {
	private Datamodel() {
		
	}
	
	public static List<BankTransaction> mockBankTransactions(){
		return List.of(new BankTransaction("A1", "B1", bd("100"), time("02/03/2024 20:52:10"), true),
				new BankTransaction("A2", "B2", bd("200"), time("02/03/2024 20:52:10"), false),
				new BankTransaction("A3", "B3", bd("300"), time("02/03/2024 20:52:10"), false),
				new BankTransaction("A4", "B4", bd("400"), time("02/03/2024 20:52:10"), true),
				new BankTransaction("A5", "B5", bd("500"), time("02/03/2024 20:52:10"), true));
	}
	
	public static List<Apple> getApples() {
		return List.of(
				new Apple(1, "green", 1200d, "Vietnam"),	
				new Apple(16, "green", 2300d, "Vietnam"),	
				new Apple(22, "red", 300d, "Lao"),	
				new Apple(4, "yellow", 400d, "Thailand"),	
				new Apple(17, "red", 600d, "Vietnam"),	
				new Apple(6, "green", 100d, "Thailand")	
		);
	}
	public static List<Dish> getDishes() {
		return Arrays.asList(
				new Dish("1", "D1", 308, Kind.FISH, false),
				new Dish("2", "D2", 420, Kind.OTHER, true),
				new Dish("3", "D3", 129, Kind.OTHER, true),
				new Dish("4", "D4", 308, Kind.MEAT, false),
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
	
	public static LocalDateTime time(String val) {
		return LocalDateTime.parse(val, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
}