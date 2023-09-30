package lesson01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Student sv1 = new Student("A1", "Nguyen Duc Thinh", 8.5, 5.5);
		Student sv2 = new Student("A2", "Le Trong Tan", 8.5, 9.0);
		Student sv3 = new Student();
		System.out.println("Input information sv3: ");
		inputInfo(sv3);
		students.add(sv1);
		students.add(sv2);
		students.add(sv3);
		searchMaxAverage(students);
		findStudentWithHigherTheoryScore(students);
		
	}
	
	public static void inputInfo(Student sv) {
		System.out.println("input id: ");
		String id = ip.nextLine();
		System.out.println("input name: ");
		String name = ip.nextLine();
		System.out.println("input theoryScore: ");
		double theoryScore = Double.parseDouble(ip.nextLine());
		System.out.println("input practiceScore: ");
		double practiceScore = Double.parseDouble(ip.nextLine());
		sv.setId(id);
		sv.setName(name);
		sv.setTheoryScore(theoryScore);
		sv.setPracticeScore(practiceScore);
	}
	
	public static void searchMaxAverage(ArrayList<Student> students) {
		boolean check = false;
		for(Student student : students) {
			if(student.calAverage(student.getTheoryScore(), student.getPracticeScore())>8.5) {
				System.out.println("Sinh viên có điểm trung bình trên 8.5 là : "+student.getName());
				check = true;
			}
		}
		if(!check) {
			System.out.println("Không có sinh viên có điểm trung bình trên 8.5");
		}
	}
	
	public static void findStudentWithHigherTheoryScore(ArrayList<Student> students) {
		boolean check = false;
		for(Student student : students) {
			if(student.getTheoryScore()>student.getPracticeScore()) {
				System.out.println("Sinh viên có điểm lý thuyết lớn hơn điểm thực hành là : "+student.getName());
				check = true;
			}
		}
		if(!check) {
			System.out.println("Không có ai có điểm lý thuyết lớn hơn điểm thực hành");
		}
	}
}
