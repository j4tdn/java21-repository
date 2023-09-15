package view;

import bean.Car;

public class Ex01CarDemo {
	
	public static void main(String[] args) {
		
		
		
		// Tạo n đối tượng car
		Car c1 = new Car();
		
		c1.setId("C1");
		//c1.setModel("MG5");
		c1.setColor("Yellow");
		c1.setSalesPrice(500d);
		
		Car c2 = new Car("C2", "Black", 800);	
		Car c3 = new Car("C3", "Black", 800);
		Car c4 = new Car("C4", "Red", 620);
		
		/*
		Phân biệt khi nào sử dụng constructor và setter, getter
			+ Khi tạo ra một đối tượng(tạo ô nhớ mới ở HEAP): 					constructor
		
			+ Khi muốn cập nhật giá trị( cập nhật lại giá trị tại ô nhớ HEAP): 	setter
		
			+ Khi muốn lấy giá trị từng thuộc tính: 								getter
		
		
		 Tại sao phải khai báo cái thuộc tính của class là private, rối sau đó dùng
		 getter và setter để truy cập mà k khai báo thẳng thuộc tính public để code ngắn gọn
			+ public 
				--> được phép truy cập từ bất kỳ class nào
				--> giống FOP
				--> k quản lý dữ liệu riêng của từng đối tượng (class)
				
			+ private
				--> được phép truy cập từ class hiện tại
				--> bên ngoài chỉ có thể truy cập thông qua getter, setter để thao tác với giá trị
				
					+ bên ngoài k thể thay đổi cấu trúc dữ liệu của thuộc tính bên trong class
					
					+ bên ngoài nên tăng/ giảm thay đổi giá trị của thuộc tính chứ k nên biết chính xác giá trị
					nguồn gốc của thuộc tính đó như thế nào
 		*/
		System.out.println("c1 -->" + c1);
		System.out.println("c2 -->" + c2);
		System.out.println("c3 -->" + c3);
		System.out.println("c4 -->" + c4);
			
	}
	
}
