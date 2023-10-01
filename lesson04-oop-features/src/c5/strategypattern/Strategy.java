package c5.strategypattern;
	
// CHương trinh có nhiều công thức chung thì dùng Strategy
	
	// arbitray interface name
public interface Strategy {
	
	//strategy method
	// arbitrary abstract method
	
	//important: list of parameters and return type
	//(x,y) -> x*y;
	int process(int x, int y);
}
