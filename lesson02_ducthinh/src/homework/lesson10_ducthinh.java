package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lesson10_ducthinh {
	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> randomNumberList = new ArrayList<>();
		while(randomNumberList.size()<5) {
			int randomNumber = rd.nextInt(11)+20;
			if(!randomNumberList.contains(randomNumber)) {
				randomNumberList.add(randomNumber);
			}
		}
		System.out.print("5 number random without duplicates is: " );
		for(int num : randomNumberList) {
			System.out.print(" "+num);
		}
	}
}
