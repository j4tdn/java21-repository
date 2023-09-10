package view;

import bean.Car;

public class Ex01CarDemo {
	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.id = "C1";
//		c1.model = "MG5";
//		c1.color = "Yellow";
//		c1.salesPrice = 550d;
//		===>
		c1.setId("C1");
		c1.setModel("MG5");
		c1.setColor("Yellow");
		c1.setSalesPrice(550d);
		
		Car c2 = new Car("C2", "Toyota Cross", "Black", 800d);
		Car c3 = new Car("C3", "Honda CRV", "Blue", 900d);
		Car c4 = new Car("C4", "KIA", "Red", 500d);
		
		/*
		 1.Phân biệt, khi nào sẽ sử dụng constructor và setter, getter
		   Khi tạo ra một đối tượng(tạo ô nhớ ở HEAP) lưu trữ thì dùng    : constructor
		   Khi muốn cập nhật giá trị(cập nhật lại giá trị ô nhớ trên HEAP): setter
		   Khi muốn lấy giá trị từng thuộc tính                           : getter
		  
		 2.Tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng getter, setter để truy cập
		  mà không khai báo thẳng thuộc tính là public để code ngắn gọn
		  + public:
		    --> Được phép truy cập từ bắt kỳ class nào  --> Giống FOP
		    --> Bên ngoài chỉ 
		    
		    
		    
		  + private:
		    +) bên ngoài nên truy cập tăng/giảm/thay đổi giá trị của thuộc tính chứ không nên biết chính xác giá trị
		       nguồn gốc của thuộc tính đó như thế nào.
		  
		  
		 */
		
		
		System.out.println("C1 -->: " + c1);
		System.out.println("C2 -->: " + c2);
		System.out.println("C3 -->: " + c3);
		System.out.println("C4 -->: " + c4);
	}
}
