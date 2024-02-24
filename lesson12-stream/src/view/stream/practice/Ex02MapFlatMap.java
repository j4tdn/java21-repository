package view.stream.practice;

import model.DataModel;
import static utils.CollectionUtils.*;

import bean.Dish;
public class Ex02MapFlatMap {
	
	public static void main(String[] args) {
		var menu = DataModel.mockDishes();
		
		System.out.println("=============== Stream#Map ================");
		var ids = menu.stream()
					.map(Dish::getId)
					.toList();
		
		generate("1. Ids", ids);
		
		System.out.println("=============== Stream#FlatMap ================");
	}

}
