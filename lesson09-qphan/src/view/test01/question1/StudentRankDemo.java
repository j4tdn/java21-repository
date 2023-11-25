package view.test01.question1;

import static view.test01.question1.Rank.*;

import java.util.Arrays;

public class StudentRankDemo {
	public static void main(String[] args) {
		Student[] students = mockData();
		
		// Câu 1
		Student[] resultByRank = getStudents(students, student -> {
			return student.getRank() == B;
		});
		
		System.out.println(
				"1. Danh sách sinh viên từng đạt lại A {\n"
				+ Arrays.toString(resultByRank)
				+ "\n}");
		
		System.out.println("===========================");
		
		// Câu 2
		Student[] failedLectureStudents = getStudents(students, testingStudent -> {
			// closure
			boolean isRankF = testingStudent.getRank() == F;
			return isRankF && isDuplicated(students, testingStudent);
		});
		
		Student[] result = distinct(failedLectureStudents);
		
		System.out.println(
				"1. Danh sách sinh viên tham gia học lại {\n"
				+ Arrays.toString(result)
				+ "\n}");
		
		
	}
	
	private static Student[] distinct(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (!contains(result, student)) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean contains(Student[] students, Student testingStudent) {
		for (Student student: students) {
			if (student != null && student.equals(testingStudent)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isDuplicated(Student[] students, Student testingStudent) {
		int count  = 0;
		for (Student student: students) {
			if (student.equals(testingStudent)) {
				count++;
			}
		}
		return count > 1;
	}
	
	// strategy: student --> boolean
	
	private static Student[] getStudents(Student[] students, StudentStrategy studentStrategy) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (studentStrategy.test(student)) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] mockData() {
		return new Student[] {
			new Student(102, "Nam", A),
			new Student(103, "Bảo", F),
			new Student(104, "Hoàng", D),
			new Student(105, "Nguyên", B),
			new Student(107, "Tèo", F),
			new Student(109, "Lan", A),
			new Student(202, "Đạt", C),
			new Student(103, "Bảo", F),
			new Student(107, "Tèo", C),
			new Student(104, "Hoàng", A)
		};
	}
}
