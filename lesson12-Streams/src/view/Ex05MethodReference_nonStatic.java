package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex05MethodReference_nonStatic {

	
	public static void main(String[] args) {
		
		var inventory = new ArrayList<>(DataModel.getApples()) ;
		
		/*
		 *Bài Tập: Cho danh sách các apples trong inventory
		 *1. Lấy danh sách tất cả các id trong inventory
		 *2.                          color 
		 *3.                          salesPrice
		 */
		
		
		//(CLassA tenBien) -> tenBien.tenHam();
		// ClassA::tenHam
		
		//hamB return KDL B
		
		//tenBien -> ClassA.hamB().hamC(tenbien)
		// ClassA.hamB()::hamC
		
		var ids = transfer(inventory, apple -> apple.getId());
		System.out.println("ID: "+ ids);
		var colors = transfer(inventory, apple -> apple.getColor());
		System.out.println("Color: "+ colors);
		var salesPrice = transfer(inventory, apple -> apple.getWeight());
		System.out.println("salesPrice: "+ salesPrice);
		
		inventory.sort(Comparator.comparing(Apple::getId));
		System.out.println("-------");
		System.out.println(inventory);
	}
	
	private static <E,R> List<E> transfer(List<E> elements,Function<E, R> function){
		List<R> result = new ArrayList<>();
			for(E element:elements) {
//				result.add(apple.getId());
				result.add(function.apply(element));
			}
		
		return (List<E>) result;
	}
}
