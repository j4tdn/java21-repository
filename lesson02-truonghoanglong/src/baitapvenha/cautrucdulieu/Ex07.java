package baitapvenha.cautrucdulieu;
import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 0;
		
		System.out.println("Nhập số tự nhiên: ");
		Scanner ip = new Scanner(System.in);
		
		String[] arr = {};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		
		int n = ip.nextInt();
		i = n;
		while (i != 0) {
			i = n / 2;
			j = n % 2;
			n = i;
			//System.out.println("i = " + i);
			//System.out.println("j = " + j);
			String str = String.valueOf(j);
			arrList.add(str);
		}
		
		arr = arrList.toArray(new String[0]);
		
		StringBuilder stringBuilder = new StringBuilder();
		for (int len = 0; len < arr.length; len++) {
			stringBuilder.append(arr[len]);
		}
		
		String joinString = stringBuilder.toString();	
		System.out.println("Số nhị phân: " + joinString);
	}
}
