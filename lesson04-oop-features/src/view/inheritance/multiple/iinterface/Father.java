package view.inheritance.multiple.iinterface;

public interface Father {
	void cooking();
	
	void running();
	
	
	default void coding() {
		System.out.println("Father --> code backend");
	}
	
	
	// default ở đây là giúp hàm có phần thân hàm 
	
	/*
	 From JDK 1.0 - 1.7
	 + interface: 
	  . only have abstract methods
	 + abstract class: 
	  . can have abstract & body methods
	 */

	 //Từ java 8 trở đi --> default, static hàm có thể có body
	 
	 //Từ java 9 trở đi --> private
	
	
	/*
	 Có 2 khái niệm: 
	 
	//Static type
	 Ví dụ 
	  int a = 5;
	  
	  thì khi đó mình gán a = "";
	                      a = void hello(){}
	   --> thì không được
	   
	//Dynamic type 
	 
	// design pattern ==> strategy pattern 
	 
	 
	 */
	
}
