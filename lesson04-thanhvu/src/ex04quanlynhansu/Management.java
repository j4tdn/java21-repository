package ex04quanlynhansu;

import java.util.List;

public class Management {

	public static void addStaff(Staff st, List<Staff> arr) {
		arr.add(st);
	}
	
	public static void countStaff(Manager mn, List<Staff> arr) {
		int count = 0;
		for (Staff st : arr) {
			if (st.getManager().getName().equalsIgnoreCase(mn.getName())) {
				count++;
			}
		}
		System.out.println("The number staff of manager " + mn.getName() + " : " + count);
	}
	

}
