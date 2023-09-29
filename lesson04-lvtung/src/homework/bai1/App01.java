package homework.bai1;

import java.util.Scanner;

public class App01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student(1, "Lưu Văn Tùng", 8.5d, 8.9d);
		Student st2 = new Student(2, "Trần Trúc Mai", 8.2d, 9.5d);
		Student st3 = enterInfo(sc);
		
		Student[] students = {st1, st2, st3};
		
		// thông tin sv có điểm TB lớn hơn 8.5
		findStudentAvgPoint85(students);
		
		// thông tin sv có điểm LT lớn hơn điểm TH
		theoryPointGreaterThanPracticePoint(students);
	}
	
	public static Student enterInfo(Scanner sc) {
		Student student = new Student();
		
		System.out.print("Nhập mã sinh viên: ");
		student.setId(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhập họ và tên: ");
		student.setFullName(sc.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		student.setTheoreticalPoint(Double.parseDouble(sc.nextLine()));
		System.out.print("Nhập thực hành: ");
		student.setPracticePoint(Double.parseDouble(sc.nextLine()));
		sc.close();
		
		return student;
	}
	
	public static void findStudentAvgPoint85(Student[] students) {
		System.out.println("Thông tin sinh viên có điểm trung bình lớn hơn 8.5");
		for(Student student: students) {
			if (student.calAverage() > 8.5) {
				System.out.println(student.toString());
			}
		}
	}
	
	public static void theoryPointGreaterThanPracticePoint(Student[] students) {
		System.out.println("Thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành");
		for(Student student: students) {
			if (student.getTheoreticalPoint() > student.getPracticePoint()) {
				System.out.println(student.toString());
			}
		}
	}
}
