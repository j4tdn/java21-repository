package functional;

import Bean.Item;

@FunctionalInterface
public interface Compare_Item {
	int compare (Item i1, Item i2);
}
