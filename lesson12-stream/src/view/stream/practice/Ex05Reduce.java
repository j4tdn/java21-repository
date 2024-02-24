package view.stream.practice;

import java.util.List;

import bean.Dish;
import common.Category;
import model.DataModel;

public class Ex05Reduce {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 3, 5, 7, 9, 8, 6, 4, 2);
		
		// Tìm max
		Integer max = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
		System.out.println("max --> " + max);
		
		// Tìm min
		Integer min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("min --> " + min);
		
		// Tìm sum
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum --> " + sum);
		
		// Tìm tổng calories của các dish của fish
		var menu = DataModel.mockDishes();
		Integer sumCal = menu.stream()
		    .filter(d -> Category.FISH == d.getCategory())
		    // .mapToInt(Dish::getCalories) // IntStream
		    // .sum();
		    .map(Dish::getCalories) // Stream<Integer>
		    .reduce(0, Integer::sum);
		System.out.println("Sum calories --> " + sumCal);   
	}
}
