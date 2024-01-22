package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {

		/*
		 * Nếu gọi, hay sử dụng class/interface có tham số là generic type --> phải
		 * truyền giá trị cho tham số đó: phải là 1 KDL đối tượng
		 * 
		 * --> Nếu mình không truyền KDL vào --> thì nó mặc định là Object --> Raw type
		 * 
		 * raw type --> dễ bị lỗi catting exception lúc runtime
		 * 
		 * 
		 * JDK 1.5: auto boxing, auto unboxing
		 * 
		 */

		@SuppressWarnings("rawtypes")
		List listA = new ArrayList();// mục đích --> danh sách các số nguyên
		List listB = new ArrayList();// mục đích --> danh sách các chuỗi

		listA.add(1);
		listA.add(2);
		listA.add("3");
		listA.add("bon");
		
		
		//duyệt và in 
		for (Object element : listA) {
			System.out.println(Integer.parseInt(element.toString()) * 2);
		}
	}
}
