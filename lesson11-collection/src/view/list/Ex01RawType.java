package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {

	public static void main(String[] args) {
		
		/*
		 
		 Nếu gọi, sử dụng class/interface có tham số là generic type
		 
		 --> phải truyền giá trị cho tham số đó: là 1 KDL đối tượng 
		 
		 --> nếu mình không truyền KDL vào --> mặc định Object --> raw type
		 
		 JDK 1.5: auto boxing, auto unboxing
		        : generic type 1.7(enhancement)
		        
		 Raw Types
		 --> dễ bị lỗi casting exception lúc runtime --> không mong muốn
		 
		 */

		List listA = new ArrayList(); // mục đích --> danh sách các số nguyên
		List listB = new ArrayList(); // mục đích --> danh sách các chuỗi

		int a = 1;
		listA.add(a); // *auto-boxing từ JDK 1.5
		listA.add(2);
		listA.add("3");
		listA.add("bốn");

		// duyệt và in ra
		for (Object element : listA) {
			System.out.println(Integer.parseInt(element.toString()) * 2);
		}

	}

}
