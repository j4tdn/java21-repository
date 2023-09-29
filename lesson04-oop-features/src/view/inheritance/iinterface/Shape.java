package view.inheritance.iinterface;

public interface Shape {

	/*
	 - Trước JDK 1.8
	   Hàm trong interface chỉ đc phép là hàm trừu tượng (abstract methods)
	   Hàm trừu tượng là hàm chỉ có phần khai báo ko có phần thực thi
	   Mặc định: public abstract
	   
	 */
	
	void paint();
	
	void calS();
}
