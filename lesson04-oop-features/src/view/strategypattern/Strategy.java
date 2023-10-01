package view.strategypattern;

@FunctionalInterface
// arbitrary interface name
public interface Strategy {

	// strategy method
	// arbitrary abstract method name
	
	// important: list of parameters and return type
	int process(int x, int y);
}
