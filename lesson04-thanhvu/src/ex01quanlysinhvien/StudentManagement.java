package ex01quanlysinhvien;

import java.util.List;

public class StudentManagement {
	
	public static double countAvgMark(Student st) {
		double avg = 0;
		avg = (st.getTheoryMark() + st.getPracticeMark()) / 2;
		return avg;
	}
	
	public static void addStudent(List<Student> arr, Student st) {
		arr.add(st);
	}
	
	public static void printGoodAvgStudent(List<Student> arr) {
		for (Student st : arr) {
			if (countAvgMark(st) > 8.5) {
				System.out.println(st + " Average mark: " + countAvgMark(st));
			}
		}
	}
	
	public static void printBetterStudent(List<Student> arr) {
		for (Student st : arr) {
			if (st.getTheoryMark() > st.getPracticeMark()) {
				System.out.println(st);
			}
		}
	}

}
