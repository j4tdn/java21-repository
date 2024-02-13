package view.stream.pratice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex03Matching {

	public static void main(String[] args) {
		var numbers = List.of(1,2,1,4,5,8,50,4,12);
		
		boolean r1 = numbers.stream().anyMatch(nb -> nb % 10 == 0);
		System.out.println("1st: is there any element that is divisible by 10 --> " + r1);

		// Optional -> Hạn chế NPE
		// T: null, non-null
		// Optional --> luôn khác null, trước khi lất T hỗ trợ các hàm kiểm tra như isPresent, ifPresent
		// T
		Optional<Integer> optR2 = numbers.stream().filter(nb -> nb % 4 == 0).findFirst();
		optR2.ifPresent(val -> System.out.println("R2 --> " + val));
	
		numbers.stream().filter(nb -> nb % 5 == 0).collect(Collectors.toSet())
		.forEach(System.out::println);
		
		
		boolean r4 = numbers.stream().allMatch(nb -> nb < 100);
		System.out.println("R4 --> " + r4);
		
		boolean r5 = numbers.stream().noneMatch(nb -> nb > 0);
		System.out.println("R5 --> " + r5);
	}
}
