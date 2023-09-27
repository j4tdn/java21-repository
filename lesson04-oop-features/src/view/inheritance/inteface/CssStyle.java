package view.inheritance.inteface;

public interface CssStyle extends Shape{
	void setColor();

	void setBackground();
	
	default void coding() {
		
	}
	
}
