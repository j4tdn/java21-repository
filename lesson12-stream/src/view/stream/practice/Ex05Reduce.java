package view.stream.practice;

import java.util.List;
import model.Datamodel;
import bean.Dish;
import common.Kind;

public class Ex05Reduce {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1, 4, 3, 5, 3, 1, 24, 7, 9);
        
        // find max
        Integer max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        // find min
        Integer min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
        // find sum
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("sum: " + sum);
        
        // find the total calories of dishes of type "fish"
        var menu = Datamodel.getDishes();
        Integer sumOfCalories = menu.stream()
            .filter(d -> Kind.FISH.equals(d.getKind()))
            .mapToInt(Dish::getCalories) // IntStream
            .sum();
        
        System.out.println("Total calories of fish dishes: " + sumOfCalories);
    }
}
