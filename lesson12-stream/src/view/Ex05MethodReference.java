package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.Datamodel;
import utils.StreamUtils;

public class Ex05MethodReference {
	public static void main(String[] args) {
		var inventory = Datamodel.getApples();
		
		// apple.getID()
		// apple.getColor()
		List<Double> listWeights = transfer(inventory, Apple::getWeight);
		StreamUtils.generate("List weight --> ", listWeights);
		
	}
	
	private static <T, R> List<R> transfer(List<T> elements, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for(T element:elements) {
			result.add(function.apply(element));
		}
		return result;
	}
}
