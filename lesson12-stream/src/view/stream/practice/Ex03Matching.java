package view.stream.practice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex03Matching {
	
	public static void main(String[] args) {
		// Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
		var numbers = List.of(1, 2, 1, 16, 5, 14, 50, 4, 12);
		
		// 1st: is there any element that is divisible by 10
		boolean r1 = numbers.stream().anyMatch(nb -> nb % 10 == 0);
		System.out.println("1st: is there any element that is divisible by 10 --> " + r1);
		
		// 2nd: find the first element that is divisible by 4
		// Optional --> Hạn chế NPE
		// T: null, non-null
		// Optional --> luôn khác null, trước khi lấy T hỗ trợ các hàm kiểm tra như isPresent, ifPresent
		//    T
		Optional<Integer> optR2 = numbers.stream().filter(nb -> nb % 7 == 0).findFirst();
		optR2.ifPresent(val -> System.out.println("R2 --> " + val));
		
		// 3rd: find the elements that is divisible by 5 in the list
		numbers.stream().filter(nb -> nb % 5 == 0).collect(Collectors.toSet())
			.forEach(System.out::println);
		
		// 4th: does all elements less than 100
		boolean r4 = numbers.stream().allMatch(nb -> nb < 100);
		System.out.println("R4 --> " + r4);
		
		// 5th: does no elements greater than 0
		boolean r5 = numbers.stream().noneMatch(nb -> nb > 0);
		System.out.println("R5 --> " + r5);
		
		// reduce
		// primitive streams
		// --> file
		// --> thread(video)
		// --> bài tập
	}
	
}
