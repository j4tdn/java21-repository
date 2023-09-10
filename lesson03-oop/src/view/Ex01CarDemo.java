package view;

import bean.Car;

public class Ex01CarDemo {

	public static void main(String[] args) {
		
		// tạo n đối tượng car
		Car c1 = new Car();
		// c1.id = "C1";
		c1.setId("C1");
		
		//c1.model = "MG5";
		c1.setModel("MG5");
		
		//c1.color = "Yellow";
		c1.setColor("Yellow");
		
		//c1.salesPrice = 550d;
		c1.setSalesPrice(550d);
		
		Car c2 = new Car("C2", "Toyota Cross", "red", 800);
		
		Car c3 = new Car("C3", "Honda CRV", "black", 880);
		
		Car c4 = new Car("C4", "Huyndai Creta", "white", 620);
		
		/*
		  1. Phân biệt, khi nào sẽ sử dụng constructor và setter, getter
			  + Khi tạo ra 1 số đối tượng(tạo ô nhớ mới ở HEAP)                        : constructor
		      + Khi muốn cập nhật giá trị(cập nhật lại giá trị tại ô nhớ trên HEAP)    : setter
		      + khi muốn lấy giá trị từng thuộc tính                                   : getter
		
		  2. Tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng getter, setter để truy cập
		     mà ko khai báo thẳng thuộc tính là public để code ngắn gọn
		     + public --> được phép truy cập từ bất kì class nào
		      --> giống FOP
			  --> ko quản lí dữ liệu riêng của từng đối tượng(class)
			  + private
		      --> được phép truy cập từ class hiện tại
		      --> bên ngoài chỉ có thể truy cập thông qua getter, setter để thao tác với giá trị
		        + bên ngoài ko thể thay đổi cấu trúc dữ liệu của thuộc tính bên trong class
		          VD: class Store{
						    public List<Item>
		
		
				  + bên ngoài nên truy cập tăng/giảm/ thay đổi giá trị của thuộc tính chứ ko nên biết chính xác giá trị
		            nguồn gốc của thuộc tính đó như thế nào
		*/
		
		System.out.println("c1 --> " +c1);
		System.out.println("c2 --> " +c2);
		System.out.println("c3 --> " +c3);
		System.out.println("c4 --> " +c4);
		
	}

}
