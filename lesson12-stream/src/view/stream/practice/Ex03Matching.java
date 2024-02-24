package view.stream.practice;

import java.util.List;

public class Ex03Matching {

	public static void main(String[] args) {
		var numbers = List.of(1, 2, 1, 16, 5, 8, 56, 4, 12);
		
		boolean r1 = numbers.stream().anyMatch(nb -> nb%10 == 0);
		System.out.println("1st: is there any element that is divisible by 10 --> " + r1);
	}

}
