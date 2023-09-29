package c5.strategypattern;

@FunctionalInterface
//arbitrary interface name
public interface Strategy {
	
	//strategy method
	//arbitrary abstract method
	
	//import: list of parameter and return type
	// example:  (x, y) -> x/y; 
	int process(int a, int b);
	
}
