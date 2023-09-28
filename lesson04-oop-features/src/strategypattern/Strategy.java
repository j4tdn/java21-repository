package strategypattern;


@FunctionalInterface
// arbitrary interface name (arbitrary: tuỳ ý)
public interface Strategy {

	// strategy method
	// arbitrary abstract method
	
	// important: list of parameters and return type
	// (x, y) -> x / y;
	
	
	int process(int x, int y);
	
}
