package ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", AcademicRank.C), new Student(103, "Bảo", AcademicRank.F),
				new Student(104, "Hoàng", AcademicRank.D), new Student(105, "Nguyên", AcademicRank.B),
				new Student(107, "Vũ", AcademicRank.F), new Student(109, "Lan", AcademicRank.A),
				new Student(202, "Đạt", AcademicRank.C), new Student(103, "Bảo", AcademicRank.F),
				new Student(107, "Vũ", AcademicRank.C), new Student(104, "Hoàng", AcademicRank.B) };

		Student[] rankAStudents = getStudents(students, AcademicRank.A);
		System.out.println("Danh sách sinh viên đạt loại A trong năm 2021:");
		for (Student student : rankAStudents) {
			System.out.println(student.getFullName());
		}

		Student[] retakeStudents = getStudents(students, AcademicRank.F);
		System.out.println("\nDanh sách sinh viên học lại môn cấu trúc dữ liệu trong năm 2021:");
		for (Student student : retakeStudents) {
			System.out.println(student.getFullName());
		}
	}

	public static Student[] getStudents(Student[] students, AcademicRank rank) {
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getRank() == rank) {
				result.add(student);
			}
		}
		return result.toArray(new Student[0]);
	}
}
