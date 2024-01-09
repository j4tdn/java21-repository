package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import common.GreenApplePredicate;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex01StrategyPattern_Review {

	public static void main(String[] args) {

		var inventory = DataModel.getApples();

		// filter all green apples in inventory

		// Cách 1:
		var greenApples = filterApples(inventory, new GreenApplePredicate());
		generate("1. Green Apple(use implementation class)", greenApples);

		// Cách 2: Anonymous class
		greenApples = filterApples(inventory, new Predicate<Apple>() {

			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		generate("2. Green Apple(use anonymous class)", greenApples);

		// Cách 3: Anonymous Function = Lambda expression
		greenApples = filterApples(inventory, apple -> "green".equals(apple.getColor()));
		generate("3. Green Apple(use anonymous function)", greenApples);

		// filter all red apples and weight heavier than 150g in inventory
		var redAndHeavyApples = filterApples(inventory, (Apple apple) -> {
			return "green".equals(apple.getColor()) && apple.getWeight() > 150;
		});
		generate("4. Red and Heavy Apple(use anonymous function)", redAndHeavyApples);

		// filter all apples from Vietnam

		var vnApple = filter(inventory, apple -> "vietnam".equalsIgnoreCase(apple.getCountry()));
		generate("5. Apple from Vietnam(use anonymous function)", vnApple);
	}

	private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
		var result = new ArrayList<Apple>();
		for (var apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}

}