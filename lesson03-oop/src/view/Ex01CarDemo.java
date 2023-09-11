package view;

import bean.Car;

// Khai báo thì k cần tạo hàm main, còn hàm demo thì tạo hàm main
public class Ex01CarDemo {
	public static void main(String[] args) {
		
		//Tạo n đối tượng car
		
		Car c1 = new Car(); 	
		c1.setId("C1"); //c1.id = "C1";
		//c1.setModel("MG5");
	
		c1.setColor("Yello");  //c1.color = "Yello";
		c1.setSalesPrice(550d); //c1.salesPrice = 550d;
		
		Car c2 = new Car("C2",  "Black", 800d);
		Car c3 = new Car("C3",  "Black", 880d);
		Car c4 = new Car("C4",  "Black", 620);
		
		/*
		  // 1.Phân biệt, khi nào sẽ sử dụng constructor và getter, setter
		 /
		// --Trả lời//Khi tạo ra 1 đối tượng(tạo ô nhớ mới trên HEAP) để lưu trữ           : Constructor
					//Khi  muốn cập nhật giá trị (Cập nhật lại giá trị tại ô nhớ trên HEAP): setter
					//Khi  muốn lấy giá trị từng thuộc tính								   : getter
		
		// 2.Tại sao phải khai báo thuộc tính của class là private, rồi sau đó mới dùng getter và setter
		// mà phải khai báo thẳng thuộc tính là public để code cho ngắn gọn
		// -- Trả lời: +
			// pubic
			// --> được phép truy cập tù bát kỳ class nào --> giống FOP
			// --> không quản lý dữ liệu riêng của từng đối tượng (class)
			// private
			// --> được phép truy cập từ class hiện tại
			// --> bên ngoài chỉ có thể tủy cập thông qua getter, setter để thao tác với giá trị
			//	+ Bên ngoài không thể thay đổi cấy trúc dữ liệu của thuộc tính bên trong class
			// VD: class Store...
			//  + Bên ngoài nên truy cập tăng/giảm/thay đổi giá trị của thuộc tính chứ không nên biết chính xác giá trị của nguồn gốc
			//thuộc tính đó như thế nào
			// VD:
			 * 	class Company {
			 *  public double balance; // quỹ lương
			 *  }
			 *  class Employee{
			 *   public duouble income; // thu nhập
		*/
		System.out.println("c1 -->" +c1);
		System.out.println("c2 -->" +c2);
		System.out.println("c3 -->" +c3);
		System.out.println("c4 -->" +c4);
		
		
}
}