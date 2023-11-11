package view;

import java.util.Arrays;

import bean.Ranked;
import bean.Strategy;
import bean.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = mockStudents();
		
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021:");
		for (Student student:getStudents(students, student -> student.getRank() == Ranked.A))
			System.out.println(student);
		
		System.out.println("Danh sách sinh viên đã tham gia học lại trong năm 2021:");
		for (Student student:findStudentsLearnAgain(students))
			System.out.println("Mã sinh viên: " + student.getId() + ", Họ tên: " + student.getName());
	}
	
	private static Student[] getStudents(Student[] students, Strategy strategy) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (strategy.process(students[i])) {
				result[count++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] findStudentsLearnAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					result[count++] = students[i];
					break;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	/*
	Thử TH tham gia học lại 3 lần:
	private static Student[] findStudentsLearnAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int[] ids = new int[students.length];	// mảng chứa id của tất cả sv tham gia học lại
		int k = 0;
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					int n = 0;
					for (int id:ids) {
						if (id == students[i].getId())
							n++;
					}
					if (n == 0) {
						ids[k++] = students[i].getId();
						result[count++] = students[i];
						break;
					}
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	*/
	
	private static Student[] mockStudents() {
		return new Student[] {
				new Student(102, "Nam", Ranked.C),
				new Student(103, "Bảo", Ranked.F),
				new Student(104, "Hoàng", Ranked.D),
				new Student(105, "Nguyên", Ranked.B),
				new Student(107, "Vũ", Ranked.F),
				new Student(109, "Lan", Ranked.A),
				new Student(202, "Đạt", Ranked.C),
				new Student(103, "Bảo", Ranked.F),
				new Student(107, "Vũ", Ranked.C),
				new Student(104, "Hoàng", Ranked.B)
		};
	}
}
