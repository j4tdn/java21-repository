package view;

import bean.Car;

public class Ex01CarDemo {

	public static void main(String[] args) {
		//tạo n đối tượng car
		Car c1 = new Car();
		c1.setId("C1");			//c1.id = "C1";
		//c1.setModel("MG5");		//c1.model = "MG5";
		c1.setColor("yellow");	//c1.color = "yellow";
		c1.setSalesPrice(550d);	//c1.salesPrice = 550d;
		
		Car c2 = new Car("C2", "Black", 800);
		Car c3 = new Car("C3", "White", 880);
		Car c4 = new Car("C4", "Red", 620);
		/*
		 1.phân biệt, khi nào sẽ sử dụng constructor và setter, getter
		 
		 	+Khi tạo ra một đối tượng (tạo ô nhớ mới ở HEAP)						: constructor
		 	+khi muốn cập nhật giá trị (cập nhật lại giá trị tại ô nhớ trên HEAP)	: setter
		 	+khi muốn lấy giá trị từng thuộc tính 									: getter
		 	
		 2.tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng getter, setter để truy cập
		   mà không khai báo thẳng thuộc tính là public để code ngắn gọn
		   
		 	+ public 
		 		--> được phép truy cập từ bất kỳ class nào --> giống FOP
		 		
		 		--> không quản lý dữ liệu riêng của từng đối tượng (class)
		 	+ private 
		 		--> được phép truy cập từ class hiện tại
		 		--> bên ngoài chỉ có thể truy cập thông qua getter, setter để thao tác với giá trị của nó 
		 
		 		+ bên ngoài không thể thay đổi cấu trúc dữ liệu của thuộc tính bên trong class
		 			VD: class Store{
		 					public List<Item> items = new ArrayList<>(); // dynamic list
		 				}
		 				
		 				class App {
		 					main(){
		 						Store s1 = new Store();
		 						s1.items = List.of(1,2,3); // fixed-size list, immutable list
		 					}
		 				}
		 		+ bên ngoài nên truy cập tăng/giảm/thay đổi giá trị của thuộc tính chứ ko nên
		 		  biết chính xác giá trị nguồn gốc của thuộc tính đó như thế nào
		 		  
		 			VD: class Company{
		 					private double balance;    //quỹ lương
		 					
		 					public void payment(Employee employee, double slary){
		 						balance = balance - salery;
		 						employee.plusIncome(salery);
		 					}
		 				}
		 				class Employee{
		 						private double income; //thu nhập 
		 						
		 						public void plusIncome(double salery){
		 							income = this.income + salery;
		 						}
		 				}
		 */
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
	}
}
