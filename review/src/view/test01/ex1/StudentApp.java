package view.test01.ex1;


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
		for (Student student : students) {
			if(student.getLevel() == LevelStatus.F) {
				System.out.println(student.toString());
			}
		}
		return students;
	}
	
	private static Student[] mockStudents() {
		return new Student[] {
				new Student(102, "Nam", LevelStatus.C),
				new Student(102, "Bảo", LevelStatus.F),
				new Student(102, "Hoàng", LevelStatus.D),
				new Student(102, "Nguyên", LevelStatus.B),
				new Student(102, "Vũ", LevelStatus.F),
				new Student(102, "Lan", LevelStatus.A),
				new Student(102, "Đạt", LevelStatus.C),
				new Student(102, "Bảo", LevelStatus.F),
				new Student(102, "Vũ", LevelStatus.C),
				new Student(102, "Hoàng", LevelStatus.B),
		};
	}
	
}
