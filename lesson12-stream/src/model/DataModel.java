package model;

import java.util.List;

import bean.Apple;

public class DataModel {
	
	private DataModel() {
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

}
