package view;

import bean.Car;

public class Ex01CarDemo {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setId("C1");
		c1.setModel("MG5");
		c1.setColor("Yellow");
		c1.setSalesPrice(200d);
		
		Car c2 = new Car("C2", "Toyata", "Black", 800);
		Car c3 = new Car("C3", "Honda CRV", "White", 880);
		Car c4 = new Car("C4", "Huyndai", "Red", 620);
		/* phân biệt , khi nào sẽ sử dụng constructor và get set
		--> + Khi tạo ra một đối tượng ( tạo ô nhớ mứi ở HEAP)                     : constructor
		 	+ Khí muốn cập nhập giá trị (cập nhập lại giá trị tại ô nhớ trên HEAP) : setter
		 	+ Khi muốn lấu giá trị từng thuộc tính                                 : getter
		tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng get set để truy cập
		mà k khai báo thẳng thuộc tính là public để code ngắn gọn hơn.
		+ public 
			--> được phép truy cập từ bất kì class nào --> giống FOP
			--> k quản lý dữ liệu riêng của từng đối tượng (class)
		+private
			--> đc phép truy cập từ class hiện tại
			--> bên ngoài chỉ có thể truy cập thông qua getter, setter để thao tác với giá trị
				
				+ bên ngoài k thể thay đổi cấu trúc dữ liệu của thuộc tính bên trong class
				 VD: class Store {
				 	public List<Item> items = new ArrayList<>(); //dynamic list
				 	}
				 	
				 	class App {
				 		main() {
				 			Store s1 = new Store();
				 			s1.items = List.of(1,2,3); // fixed-size list, immutable list
				 			
				 			s1.add(4); // internal errol
				 			}
				 		}
				 + Bên ngoài nên truy cập tăng/ giảm / thay đổi giá trị của thuộc tính chứ k nên 
				 	biết chính xác giá trị nguồn gốc của thuộc tính đó ntn.
				 	VD:  class Company {
				 			public double balance ; // quỹ lương
				 			
				 			public void payment(int employeeId, double salary) {
				 			balance = balance - salary;
				 			employee.plusIncome(salary);
				 			}
				 		}
				 		
				 		class Employee {
				 			public double income; // thu nhập
				 			public void plusIncome(double salary){
				 			thí.income = this.income + salary;
				 			}
				 		}
		  */
		 
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		
	}
}
