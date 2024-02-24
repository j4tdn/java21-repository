package view.stream.pratice;

import java.util.List;
import java.util.Map;

import bean.Dish;
import common.Category;
import model.DataMode;

public class Ex05Reduce {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 3, 5, 7, 7, 8, 6, 4 ,2);
		
		//Tìm max
		Integer max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
		//Tìm min
		Integer min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
		//Tìm sum
		Integer sum	 = numbers.stream().reduce(0, Integer::sum);
		
		System.out.println("max:" +max);
		System.out.println("min:" +min);
		System.out.println("sum:" +sum);
		
		//Tìm tổng calories của các đĩa thức ăn thuộc loại là fish
		
		var menu = DataMode.mockDishes();
		Integer sumOfCalories = menu.stream()
		.filter(d -> Category.FISH == d.getCategory())
		//.mapToInt(Dish::getCalories) //insTream
		//.sum();
		.map(Dish::getCalories) //Stream<Integer> Stream<T>
		.reduce(0, Integer::sum);
		
		System.out.println("Tìm tổng calories của các đĩa thức ăn thuộc loại là fish:");
		System.out.println("sumOfCalories:" +sumOfCalories);
	}
}
