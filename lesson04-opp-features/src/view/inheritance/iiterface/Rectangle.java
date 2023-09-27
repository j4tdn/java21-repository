package view.inheritance.iiterface;

public class Rectangle implements Shape, CssStyle {

	@Override
	public void paint() {
		System.out.println("Rectangle--->paint");

	}

	@Override
	public void calS() {
		System.out.println("Rectangle--->calS");

	}

	@Override
	public void setColor() {
		System.out.println("Red");
		
	}

	@Override
	public void setBackground() {
		System.out.println("Blue");
		
	}
	
	@Override
	public void onload() {
		// TODO Auto-generated method stub
		
	}

	// Anonymous function

	// Để tạo 1 đối tượng cho biến KDL interface
	// Dùng
	// + External class
	// + Anonymous class
	// --> có thể có 1 hàm trừu tượng

	// +Anonymous function
	// -->

}
