package condition;

import java.util.Map.Entry;

public interface EntryCondition {
	boolean test(Entry<Integer, Integer> entry);
}
