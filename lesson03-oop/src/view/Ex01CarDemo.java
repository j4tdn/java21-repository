package view;

import bean.Car;

public class Ex01CarDemo {
	
	public static void main(String[] args) {
		// Tạo n đối tượng car
		Car c1 = new Car("C1", "Yellow", 550d);
		Car c2 = new Car("C2", "Black", 800d);
		Car c3 = new Car("C3", "White", 880d);
		Car c4 = new Car("C4", "Black", 620d);
		
		/**
		 * 1. Phân biệt, khi nào sẽ sử dụng constructure và setter getter
		 * Khi tạo ra một đối tượng(Tạo ô nhớ mới ở HEAP): constructor
		 * Khi muốn cập nhật giá trị(Cập nhật giá trị tại ô nhớ trên HEAP): setter
		 * Khi muốn lấy giá trị từng thuộc tính: getter 
		 * 
		 * 2. Tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng getter, setter để truy cập
		 * mà không khai báo thẳng thuộc tính là public để code ngắn gọn.
		 * + public --> được phép truy cập từ bất kỳ class nào
		 * --> giống FOP
		 * --> không quản lý dữ liệu riêng của từng đối tượng(class)
		 * + private
		 * --> chỉ được phép truy cập từ class hiện tại
		 * --> bên ngoài chỉ có thể truy cập thông qua getter, setter để thao tác với giá trị
		 * 
		 *   + bên ngoài không thể thay đổi cấu trúc dữ liệu của thuộc tính bên trong class
		 *   VD: class Store {
		 *   		public List<Item> items = new ArrayList<>(); //dynamic list
		 *   	 }
		 *   
		 *   	 class App() {
		 *   		main() {
		 *   			Store s1 = new Store();
		 *   			s1.items = List.of(1,2,3); // fixed-size, immutable list
		 *   
		 *   			s1.add(4);
		 *   		}
		 *   	 }
		 *   
		 *   + Bên ngoài nên truy cập tăng/giảm/thay đổi giá trị của thuộc tính chứ ko nên biết chính xác giá trị
		 *     nguồn gốc của thuộc tính đó như thế nào
		 *   VD: 
		 */
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
	}
}
