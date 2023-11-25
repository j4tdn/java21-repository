package day04;

import java.util.Arrays;
import static day04.Rank.*;

public class App {

	public static void main(String[] args) {
		Student[] students = mockData();
		
		Student[] result = getStudent(students, student -> {
			return student.getRank() == A;
		});
		
		System.out.println("Danh sach sinh vien duoc loai A:" + Arrays.toString(result));
	}
	
	private static Student[] mockData(){
		return new Student[] {
				new Student(102, "Nam", C),
				new Student(103, "Bảo", F),
				new Student(104, "Hoàng", D),
				new Student(105, "Nguyên", B),
				new Student(107, "Vũ", F),
				new Student(109, "Lan", A),
				new Student(202, "Đạt", C),
				new Student(103, "Bảo", F),
				new Student(107, "Vũ", C),
				new Student(104, "Hoàng", B),
				};
	}
	
	private static Student[] getStudent(Student[] students, StudentStrategy studentStrategy) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student:students) {
			if(studentStrategy.test(student)) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
