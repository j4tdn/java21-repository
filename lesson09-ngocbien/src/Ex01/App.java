package Ex01;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Student[] students = mock();
		
		System.out.println("List of student with rank A in 2021: ");
		studentWithRankA(students);
		
		System.out.println("List of student who have retaken the data structures: ");
		studentWithRankF(students);
		
	}
	
	private static Student[] mock() {
		return new Student[] {
		new Student(102, "Nam", Rank.C),
		new Student(103, "Bảo", Rank.F),
		new Student(104, "Hoàng", Rank.D),
		new Student(105, "Nguyên", Rank.B),
		new Student(107, "Vũ", Rank.F),
		new Student(109, "Lan", Rank.A),
		new Student(202, "Đạt", Rank.C),
		new Student(103, "Bảo", Rank.F),
		new Student(107, "Vũ", Rank.C),
		new Student(104, "Hoàng", Rank.B),
		};
	}
	
	private static void studentWithRankA(Student[] students) {
		for(Student student:students) {
			if(student.getRank() == Rank.A) {
				System.out.println(student);
			}
		}
	}
	
	private static void studentWithRankF(Student[] students) {
		for(Student student:students) {
			if(student.getRank() == Rank.F) {
				System.out.println(student);
			}
		}
	}
	
	
	
}
