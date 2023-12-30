package view;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02ArrayCrud {
	public static void main(String[] args) {
		int[] numbers = {2,9,3,17,7};
		//create => add( int [] elements,int pos: vị trí, int new value: giá trị )
		int[] added = add(numbers, 2, 55);
		ArrayUtils.generate("Mang sau khi duoc them la: ", added);
		
		//read = numbers[i]
		//update = numbers [i]= ?
		//delete = remove(int[] elements, int pos, int posToBeRemove)
		int[] removed = remove(numbers, 1);
		generate("Mang sau khi xoa la: ", removed);
		
	}
	private static int[] add(int[] origin, int location, int newValue) {
		if(location < 0 || location >= origin.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return origin;
		}
	//B1: tạo mảng mới với độ dài tăng lên 1
	int[] target = new int[origin.length+1];
	
	//B2: copy mảng phần tử ở mảng cũ qua mảng mới
	for(int i = 0; i < origin.length; i++) {
		target[i] = origin[i];
	}
	
	//B3: dịch phần tử sang phải, nghĩa là dịch từ phải qua trái
	
	for(int i = target.length - 1 ; i < location; i--) {
		target[i] = target[i-1];
		
	}
	// B4: Gán giá trị mới vào vị trí được chỉ định trong mảng
    // và trả về mảng kết quả sau khi thêm
	
	target[location] = newValue;
	return target;
	
}
	private static int[] remove(int[] origin, int location) {
		if(location < 0 || location >= origin.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return origin;
		}
		int[] target = new int[origin.length];
		System.arraycopy(origin, 0, target, 0, origin.length);
		
		for(int i = location; i < target.length -1 ; i++) {
			target[i] = target[i+1];
		}
		return Arrays.copyOfRange(target, 0, target.length -1 );
	}
	
}
