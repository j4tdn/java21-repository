package view.inheritance.iiterface;

import view.inheritance.abstractclass.JsBehavior;

public interface Shape extends JsBehavior {
	/*
		Trước JDK 1.8
		Hàm trong interface chỉ được phép là hàm trừu tượng (abstract methods)
		Hàm trừu tượng là hàm chỉ có phần khai báo kh có phần thực thi
		Mặc định: public abstract
	*/
	
	void paint();
	void calS();
	
}
