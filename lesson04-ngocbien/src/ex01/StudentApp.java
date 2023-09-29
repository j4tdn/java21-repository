package ex01;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Student sv1 = new Student(123, "Tran Ngoc Bien", 7.0f, 6.5f);
		Student sv2 = new Student(234, "To Dong Hien", 9.0f, 8.5f);
		
		Student sv3 = new Student();
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhap thong tin sinh vien 3:");
		
		
		System.out.print("Nhap id: ");
		sv3.setIdStudent(Integer.parseInt(ip.nextLine()));
		
		System.out.print("Nhap ten sinh vien: ");
		sv3.setName(ip.nextLine());
		
		System.out.print("Nhap diem ly thuyet: ");
		sv3.setTheoryPoint(ip.nextFloat());
		
		System.out.print("Nhap diem thuc hanh:");
		sv3.setPracticePoint(ip.nextFloat());
		
		System.out.println("====");
	
		Student[] students = {sv1, sv2, sv3};
		System.out.println("Thong tin 3 sinh vien:\n");
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		
		System.out.println("\nSinh vien co diem >= 8.5\n");
		Utils.findStudent(students);
		System.out.println("\nSinh vien co diem ly thuyet cao hon bai tap\n ");
		Utils.findStudentHasTheoryHigherPractice(students);
	}
	

	
}
