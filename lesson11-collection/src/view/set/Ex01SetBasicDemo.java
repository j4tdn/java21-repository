package view.set;

import java.util.HashSet;
import java.util.Set;

import static utils.CollectionUtils.*;

public class Ex01SetBasicDemo {
	
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(23);
		numbers.add(10);
		numbers.add(75);
		numbers.add(58);
		numbers.add(46);
		
		generate("1. Numbers", numbers);
	}

}
