package common;
import java.util.function.Predicate;

import bean.Apple;

	public class GreenApplePredicate implements Predicate<Apple>{

		public boolean test(Apple apple) {
			return "green".equals(apple.getColor());
		}
}
