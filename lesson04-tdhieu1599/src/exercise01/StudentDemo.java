package exercise01;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		
		Student s1 = new Student(1599, "Hieu", 3f, 4f);
		Student s2 = new Student(2599, "Dao", 9f, 8.7f);

		Student s3 = new Student();
		
		Scanner ip = new Scanner(System.in);
		System.out.print("name s3 : ");
		String name = ip.nextLine();
		s3.setName(name);
		System.out.print("id s3 : ");
		int id = ip.nextInt();
		s3.setId(id);
		
		System.out.print("Theory Mark s3: ");
		float theoryMark = ip.nextFloat();
		s3.setTheoryMark(theoryMark);
		System.out.print("Pratice Mark s3: ");
		float practiceMark = ip.nextFloat();
		s3.setPracticeMark(practiceMark);
		Student[] students = {s1, s2, s3};
		
		findAverageMarkMoreThan85(students);
		findTheoryMoreThanPracticeMark(students);
	}
	
	private static void findAverageMarkMoreThan85(Student[] students){
		System.out.println("Sinh vien co diem lon hon 8.5: ");
		for(Student s : students) {
			float averageMark = s.calAverageMark(s.getTheoryMark(), s.getPracticeMark());
			if(averageMark > 8.5) {
				System.out.println(s);
			}
		}
	}
	
	private static void findTheoryMoreThanPracticeMark(Student[] students){
		System.out.println("Sinh vien co diem ly thuyet hon thuc hanh: ");
		for(Student s : students) {
			if(s.getTheoryMark() > s.getPracticeMark()) {
				System.out.println(s);
			}
		}
	}
}