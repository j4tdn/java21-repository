package view.inheritance.iiterface;

public interface Shape extends JsBehavior {
	/*
	 - Trức JDK 1.8
	 Hàm trong interface chỉ được phép là hàm trừu tượng (abstract methods)
	 Hàm trừu tượng là hàm chỉ có phần khai báo không có phần thực thi
	 */
	void paint();
	
	void cals();
}
