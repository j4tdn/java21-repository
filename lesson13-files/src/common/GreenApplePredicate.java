package common;

import java.util.function.Predicate;

import bean.Apple;

public class GreenApplePredicate implements Predicate<Apple> {

	@Override
	public boolean test(Apple t) {
		if(!(t.getColor().equals("green"))) {
			return false;
		}
		return true;
	}
	

}
