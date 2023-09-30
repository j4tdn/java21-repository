package Ex01ManageStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01Demo {
	public static void main(String[] args) {
		
		List<Student> listStudent = new ArrayList<>();
		
		listStudent.add(new Student(1,"Trúc Mai",8.5d,9d));
		listStudent.add(new Student(2,"Hồng Nga",6d,7.5d));
		Student student3 = input();
		listStudent.add(student3);
		findAverage(listStudent);
		findStudentHigherTheoryMark(listStudent);
	}
		
	
	public static Student input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		System.out.println("Enter theory mark: ");
		double theoryMark = scanner.nextDouble();
		System.out.println("Enter practice mark: ");
		double practiceMark = scanner.nextDouble();
		scanner.close();
		return new Student(id, name, theoryMark, practiceMark);
	}
	
	public static void findAverage(List<Student> students) {
		System.out.println("\nList of students with an average score greater than 8.5");
		System.out.println("-----------------------------------------------------------");
		students.stream().filter(student -> student.calAverage() > 8.5)
		                 .forEach(System.out::println);
	}
	
	public static void findStudentHigherTheoryMark(List<Student> students) {
		System.out.println("\nList of students with higher theory scores than practice scores");
		System.out.println("-----------------------------------------------------------");
		students.stream().filter(student -> student.getTheoryMark() > student.getPracticeMark())
		                 .forEach(System.out::println);
	}
}
