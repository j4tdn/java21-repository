package view;

import bean.Car;

public class Ex01CarDemo {

	public static void main(String[] args) {
		
		//Tạo n đối tượng car
		Car c1 = new Car();
		c1.setId("C1"); 
		c1.setModel("MG5");
		c1.setColer("Yellow");
		c1.setSalesPrice(550d);
		
		Car c2 = new Car("C2", "Toyota Cross", "Black", 800);
		Car c3 = new Car("C3", "Honda CRV", "White", 880);
		Car c4 = new Car("C4", "Huyndai Creta", "Red", 620);
		
		System.out.println("c1 -->" + c1);
		System.out.println("c2 -->" + c2);
		System.out.println("c3 -->" + c3);
		System.out.println("c4 -->" + c4);

		
		/**
		 1. Phân biệt, khi nào sử dụng constructor và setter, getter
		 + khi tạo một đối tượng (tạo ô nhớ mới ở heap) : constructor
		 + khi muốn cập nhật giá trị(cập nhật lại giá trị tại ô nhớ trên heap): setter
		 + khi muốn lấy giá trị từng thuộc tính
		 
		 2. tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng getter, setter để truy cập
		 mà không khai báo thẳng thuộc tính là public để code ngắn gọn
		 + public
		  	--> được phép truy cập từ bất kỳ class nào -> giống FOP 
		 	--> không quản lý dữ liệu riêng của từng đối tượng(class)
		 + private
		 	--> được phép truy cập từ class hiện tại
		 	--> bên ngoài chỉ có thể truy cập thông qua getter, setter để thao tác với giá trị
		 	
		 		+ bên ngoài không thể thay đổi cấu trúc dữ liệu của thuộc tính bên trong class
		 		  VD: class Store {
		 		  	public List<Item> items; // dynamic list
		 		  }
		 		  
		 		  class App(){
		 		  	main(){
		 		  		
		 		  		}		 		  
		 		  	}		 		  
		 		+ bên ngoài nên truy cập tăng/giảm/thay đổi giá trị của thuộc tính chứ không nên biết chính xác
		 		  giá trị của nguồn gốc của thuộc tính đó như thế nào
		 		  VD: class Company {
		 		  		private 
		 		  }
		 */
		
	}

}
