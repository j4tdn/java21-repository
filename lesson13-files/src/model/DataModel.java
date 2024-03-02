package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import bean.Apple;
import bean.BankTransaction;
import bean.Dish;
import common.Category;

public class DataModel {

	private DataModel() {
	}
	
	public static List<BankTransaction> mockBankTransactions(){
		return List.of(
		
			new BankTransaction("A1", "B1", bd("200"), time("02/03/2024 20:52:10"), true),
			new BankTransaction("A2", "B2", bd("100"), time("01/03/2024 20:52:10"), true),
			new BankTransaction("A3", "B3", bd("400"), time("18/03/2024 20:52:10"), false),
			new BankTransaction("A4", "B4", bd("500"), time("20/03/2024 20:52:10"), false),
			new BankTransaction("A5", "B5", bd("300"), time("19/03/2024 20:52:10"), true)
		);
	}
	
	public static LocalDateTime time(String val) {
		return LocalDateTime.parse(val, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	public static BigDecimal bd(String val) {
		return new BigDecimal(val);
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
	public static List<Apple> getApples() {
		return List.of(
				new Apple(1,  "green", 200d, "Vietnam"),	
				new Apple(16, "green", 300d, "Vietnam"),	
				new Apple(22, "red", 300d, "Lao"),	
				new Apple(4,  "yellow", 400d, "Thailand"),	
				new Apple(17, "red", 600d, "Vietnam"),	
				new Apple(6,  "green", 100d, "Thailand")	
		);
	}
	
}
