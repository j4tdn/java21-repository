package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {

	public static void main(String[] args) {
		
		/*
		 
		 Nếu gọi, sử dụng class/interface có tham số là generic type
		 
		 --> Phải truyền giá trị cho tham số đóL là 1 KDL đối tượng
		 
		 */
		
		List listA = new ArrayList();
		List listB = new ArrayList();
		
		listA.add(1);
		listA.add(2);
		listA.add("3");
		listA.add("bon");
		
		// duyệt
		for (Object element : listA) {
			System.out.println(Integer.parseInt(element.toString()) * 2);
		}
	}
}
