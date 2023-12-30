package functional;

import Bean.Item;

@FunctionalInterface
public interface ItemCond {
	
	boolean test (Item item);
	
}
