package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Trần Hữu Tài", 9.2d, 7.8d);
		Student sv2 = new Student(1, "Lê Nam", 8.4d, 8.2d);
		Student sv3 = new Student();
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập id: ");
		sv3.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("Nhập họ tên: ");
		sv3.setName(ip.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		sv3.setTheoryPoint(Double.parseDouble(ip.nextLine()));
		System.out.print("Nhập điểm thực hành: ");
		sv3.setPacticePoint(Double.parseDouble(ip.nextLine()));
		
		Student[] students = {sv1, sv2, sv3};
		
		System.out.println("Sinh viên điểm trung bình cao hơn 8.5: ");
		for (Student student : findStudentsWithHighAverage(students)) {
			System.out.println(student);
		}
		
		System.out.println("\n\nSinh viên điểm lý thuyết cao hơn thực hành: ");
		for (Student student : findStudentsTheoryHigherPractice(students)) {
			System.out.println(student);
		}
		
		ip.close();
	}
	
	private static Student[] findStudentsWithHighAverage(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if(student.calAverageP() > 8.5) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] findStudentsTheoryHigherPractice(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if(student.getTheoryPoint() > student.getPacticePoint()) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
