package view.stream.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Dish;
import model.Datamodel;
import utils.StreamUtils;

public class Ex01FilterDistinct {
	public static void main(String[] args) {
		List<Dish> menu = Datamodel.getDishes();
		
		Collection<Dish> collection = menu.stream()
				.collect(Collectors.toMap(Dish::getName, Function.identity(), (e1, e2) -> e2))
				.values();
		
		StreamUtils.generate("2.2 Liệt kê các đĩa thức ăn không trùng nhau theo thuộc tính", collection);
	}
	
	//Function<T, T> f = Class.itself();
	
	private static <T> Function<T, T> itself(){
		return t -> t;
	}
	
//	private static <T, R> List<T> distintByKey(List<T> elements, Function<T, R> keyExtractor){
//		Set<R> nonOverlapKeys = new HashSet<>();
//		
//		return elements.stream()
//				
//	}
}
