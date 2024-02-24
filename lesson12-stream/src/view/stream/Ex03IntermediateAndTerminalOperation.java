package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex03IntermediateAndTerminalOperation {

	public static void main(String[] args) {

		// Hàm nào mà chấm xong vẫn trả về stream --> intermediate operations

		// Hàm nào chấm xong trả về KDL khác(void, list, string,...) --> terminal operations
		
		List<Dish> menu = DataModel.mockDishes();

		System.out.println("Menu size: --> " + menu.size()); // 12

		List<String> names = menu.stream() // Stream<Dish>
				.filter(d -> {
					System.out.println("filter: --> "+ d.getId());
					return d.getCalories() > 300;
				}) // Stream<Dish>
				.map(d -> {
					System.out.println("map --> "+ d.getId());
					return d.getName();
				}) // Stream<String>
				.limit(3) // Stream<String>
				.collect(Collectors.toList()); // List<String>

		CollectionUtils.generate("1. Name of dishes which have calo > 300", names);
	}

}
