package view.stream.practice;

import java.util.List;

import bean.Dish;
import common.Category;
import model.DataModel;

public class Ex05Reduce {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 3, 5, 7, 9, 8, 6, 4, 2);
		
		// tìm max
		Integer max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
		
		// tìm min
		Integer min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
		
		// tìm sum
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("sum: " + sum);
		
		// tìm tổng calories của các đĩa thuộc loại là fish
		var menu = DataModel.mockDishes();
		Integer sumOfCalories = menu.stream()
			.filter(d -> Category.FISH == d.getCategory())
			// .mapToInt(Dish::getCalories) // IntStream
			// .sum();
			.map(Dish::getCalories) // Stream<Integer> Stream<T>
			.reduce(0, Integer::sum);
		
		System.out.println("sumOfCalories --> " + sumOfCalories);

	}

}
