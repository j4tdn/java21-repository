package Ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App01 {
	public static void main(String[] args) {

		Student[] students = mocStudents();

		displayStudent(students);

		System.out.println("\n===================\n");

		// Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
		getStudentRankA(students);
		System.out.println("\n===================\n");
		// Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm
		// 2021.
		getStudentRankF(students);

	}

	public static Student[] mocStudents() {
		return new Student[] { new Student(102, "Nam", Rank.C), new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), new Student(105, "Nguyên", Rank.B), new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A), new Student(202, "Đạt", Rank.C), new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C), new Student(104, "Hoàng", Rank.B) };
	}

	private static void displayStudent(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private static Student[] getStudentRankF(Student[] students) {
		Student[] result = new Student[students.length];
		int i = 0;
		for (Student student : students) {
			if (student.getRank() == Rank.F) {
				result[i] = student;
				System.out.println(student);
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}

	private static Student[] getStudentRankA(Student[] students) {
		Student[] result = new Student[students.length];
		int i = 0;
		for (Student student : students) {
			if (student.getRank() == Rank.A) {
				result[i] = student;
				System.out.println(student);
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}

}
