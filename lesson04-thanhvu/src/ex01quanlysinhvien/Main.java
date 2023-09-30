package ex01quanlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Student> arr = new ArrayList<>();
		Scanner ip = new Scanner(System.in);

		Student s1 = new Student("48", "Vu", 10d, 10d);
		Student s2 = new Student("229", "May", 9.9d, 9.9d);
		Student s3 = new Student();
		System.out.println("Enter student id:");
		String id = ip.nextLine();
		System.out.println("Enter student name:");
		String name = ip.nextLine();
		System.out.println("Enter student theory mark:");
		double theoryMark = ip.nextDouble();
		System.out.println("Enter student practice mark:");
		double practiceMark = ip.nextDouble();

		s3.setId(id);
		s3.setName(name);
		s3.setPracticeMark(practiceMark);
		s3.setTheoryMark(theoryMark);

		System.out.println();

		System.out.println("--> Average mark: ");
		System.out.println(StudentManagement.countAvgMark(s1));
		System.out.println(StudentManagement.countAvgMark(s2));
		System.out.println(StudentManagement.countAvgMark(s3));

		StudentManagement.addStudent(arr, s1);
		StudentManagement.addStudent(arr, s2);
		StudentManagement.addStudent(arr, s3);

		System.out.println();

		System.out.println("--> Student have mark greater than 8.5: ");
		StudentManagement.printGoodAvgStudent(arr);

		System.out.println();

		System.out.println("--> Student have theory mark greater than pratice mark: ");
		StudentManagement.printBetterStudent(arr);

	}
}
