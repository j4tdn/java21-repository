package view.inheritance.iiterface;

public class InheritanceInterfaceDemo implements Shape, CssStyle {
	public static void main(String[] args) {
		// Extenal class
		Shape sh1 = new Rectangle();
		sh1.cals();
		sh1.paint();
		
		// Để tạo 1 đối tượng cho biến KDL interface
		// Dùng
		// + External class
		// + Anonymous class
		// --> Có thể có 1 hoặc nhiều hàm trừu tượng
		
		// + Anonymous function
		// --> có duy nhất 1 hàm trừu tượng
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackground() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cals() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onload() {
		// TODO Auto-generated method stub
		
	}
}
