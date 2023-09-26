package view.inheritance.iinterface;

public interface Shape extends JsBehavior {
	/* Trước JDK 1.8 chỉ được chứa interface không chưa body
		Hàm trong interface chỉ được phép là hàm trừu tượng (abstract methods)
		Hàm trừu tượng là hàm chỉ có phần khai báo không có phần thực thi
		Mặc định: public abstract
	*/
	
	void paint();
	
	void calS();
}
