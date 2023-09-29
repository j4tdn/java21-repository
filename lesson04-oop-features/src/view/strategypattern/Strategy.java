package view.strategypattern;

@FunctionalInterface
// any interface name
public interface Strategy {
	
	// strategy method
	// arbitrary abstract method
	// importan: list of parameters and return type
	// (x, y) -> x / y;
	int process(int a, int b);
}
