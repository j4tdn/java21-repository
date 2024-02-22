package view.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.Datamodel;
import utils.StreamUtils;

public class Ex03StreamIntermediateAndTerminalOperations {
	public static void main(String[] args) {
		
		//Hàm nào mà chấm xong vẫn trả về steam --> intermediate operations
		
		//Hàm nào mà chấm xong trả về KDL khác (void, list, string ) --> terminal operations
		List<Dish> menu = Datamodel.getDishes();
		
		List<String> names = menu.stream()
			.filter(d -> d.getCalories() > 300)
			.map(d -> d.getName())
			.limit(3) // Stream<String>
			.collect(Collectors.toList());
		
		StreamUtils.generate("1. Name of dish which have calo > 300", names);
	}
}
