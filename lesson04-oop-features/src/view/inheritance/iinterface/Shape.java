package view.inheritance.iinterface;

public interface Shape extends JsBehavior{
	
	/*
	 	Trước JDK 1.8
	 	Hàm trong interface chỉ được phép là hàm trừu tượng(abstract methods)
	 	Hàm trừu tượng là hàm chỉ có phần khai báo không có phần thực thi
	 	Mặc định: public abstract
	 	thuộc tính mặc định trong interface là public static final
	 	Không được khia báo thuộc tính trong interface
	 */
	void paint();
	
	void calS();
}
