package funtional;

import bean.Item;

@FunctionalInterface
public interface ItemCond {

	boolean test(Item item);

}
