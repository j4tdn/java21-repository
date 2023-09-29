package view.strategypattern;

@FunctionalInterface
// arbitrary interface name đặt tên lớp interface là gì cũng dược
public interface Strategy {
	
	// strategy method
	// arbitrary abstract method đặt tên hàm abstract là gì cũng dược
	// important: list of parameter and return type
	// (x, y) -> x / y;
	int process(int x, int y);
}
