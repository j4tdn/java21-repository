package view.inheritance.iinterface;

public interface Shape extends JsBehavior{

	/*
	 - Trước JDK 1.8
	   Hàm trong interface chỉ được phép là hàm trừu tượng (abstract method)
	   Hàm trừu tượng là hàm chỉ có phần khai báo không có phần thực thi
	   Mặc định: public abstract
	   
	 */
	
	void paint();
	
	void calS();
}
