package test09.ex1;

import java.util.HashSet;
import java.util.Set;

public class StudentApp {

	public static void main(String[] args) {
		System.out.println("\n---List of students who achieved grade A ---\n");
		listStudentGetLevelA(mockStudents());
		System.out.println("\n---List of students re-taking the data structures course ---\n");
		listStudentRetake(mockStudents());
	}
	
	private static Student[] listStudentGetLevelA(Student[] students) {
		for (Student student : students) {
			if(student.getLevel() == LevelStatus.A) {
				System.out.println(student.toString());
			}
		}
		return students;
	}
	
	private static Student[] listStudentRetake(Student[] students) {
		Set<Integer> studentIds = new HashSet<>();
		for (Student student : students) {
			if(!studentIds.add(student.getId())) {
				System.out.println(student.toString());
			}
		}
		return students;
	}
	
	private static Student[] mockStudents() {
		return new Student[] {
				new Student(102, "Nam", LevelStatus.C),
				new Student(103, "Bảo", LevelStatus.F),
				new Student(104, "Hoàng", LevelStatus.D),
				new Student(105, "Nguyên", LevelStatus.B),
				new Student(107, "Vũ", LevelStatus.F),
				new Student(109, "Lan", LevelStatus.A),
				new Student(202, "Đạt", LevelStatus.C),
				new Student(103, "Bảo", LevelStatus.F),
				new Student(107, "Vũ", LevelStatus.C),
				new Student(104, "Hoàng", LevelStatus.B),
		};
	}
}
