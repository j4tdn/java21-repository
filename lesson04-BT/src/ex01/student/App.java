package ex01.student;

import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Student s1 = new Student(01,"Hồ Bảo Linh",9.5f,8.5f);
		Student s2 = new Student(02,"Nam Trân",8.4f,8.0f);
		Student s3 = new Student();
		Student[] arrs = {s1, s2, s3};
		inputInfo(s3);
		System.out.println("Vui lòng chọn chức năng: \n"
				+ "1. Sinh viên có điểm trung bình trên 8.5 \n"
				+ "2. Sinh viên có điểm lý thuyết lớn hơn thực hành");
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			avg1Point(arrs);
			break;
		}
		case 2: {
			avg2Point(arrs);
			break;
		}
		default:
			System.out.println("Vui lòng nhập lại !");;
		}
	
	}
	public static void inputInfo(Student sv) {
		
		
		System.out.println("Thông tin của sinh viên thứ 3");
		System.out.println("------------------------");
		System.out.println("Nhập mã sinh viên: ");
		sv.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập họ và tên sinh viên ");
		sv.setName(sc.nextLine());
		System.out.println("Nhập điểm trung bình lý thuyết sinh viên ");
		sv.setPointTheory(sc.nextFloat());
		System.out.println("Nhập điểm trung bình thực hành sinh viên ");
		sv.setPointPractice(sc.nextFloat());
		
	}
	public static void avg1Point(Student[] arrs) {
		System.out.println("Sinh viên có điểm trung bình trên 8.5 là: ");
		System.out.printf("%-15s %-15s %-20s %-20s","Mã sinh viên","Họ và tên","Điểm lý thuyết","Điểm thực hành");
		for(Student arr : arrs) {
			float avgPoint = (arr.getPointPractice()+arr.getPointTheory())/2;
			if(avgPoint>=8.5) {
				System.out.printf("\n%-15s %-15s %-20s %-20s",arr.getId(),arr.getName(),arr.getPointTheory(),arr.getPointPractice());
			}
		}
	}
	
	public static void avg2Point(Student[] arrs) {
		System.out.println("Sinh viên có điểm lý thuyết lớn hơn thực hành là: ");
		System.out.printf("%-15s %-15s %-20s %-20s","Mã sinh viên","Họ và tên","Điểm lý thuyết","Điểm thực hành");
		for(Student arr : arrs) {
			if(arr.getPointTheory()> arr.getPointPractice()) {
				System.out.printf("\n%-15s %-15s %-20s %-20s",arr.getId(),arr.getName(),arr.getPointTheory(),arr.getPointPractice());
			}
		}
	}
}
