package Test01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(102, "Nam", Rank.Ranked.C));
        students.add(new Student(103, "Bảo", Rank.Ranked.F));
        students.add(new Student(104, "Hoàng", Rank.Ranked.D));
        students.add(new Student(105, "Nguyên", Rank.Ranked.B));
        students.add(new Student(107, "Vũ", Rank.Ranked.F));
        students.add(new Student(109, "Lan", Rank.Ranked.A));
        students.add(new Student(202, "Đạt", Rank.Ranked.C));
        students.add(new Student(103, "Bảo", Rank.Ranked.F));
        students.add(new Student(107, "Vũ", Rank.Ranked.C));
        students.add(new Student(104, "Hoàng", Rank.Ranked.B));
        
        Student[] listRankA = getStudents(students, Rank.Ranked.A);
        Student[] listReLearn = getStudents(students, Rank.Ranked.F);
        
        System.out.println("Danh sách sinh viên đạt loại A trong năm 2021:");
        printStudents(listRankA);
        
        System.out.println("Danh sách sinh viên học lại môn cấu trúc dữ liệu trong năm 2021:");
        printStudents(listReLearn);
	}
	
	public static Student[] getStudents(List<Student> students, Rank.Ranked rank) {
		List<Student> result = new ArrayList<>();
		for(Student student : students) {
			if(student.rank == rank) {
				result.add(student);
			}
		}
		return result.toArray(new Student[0]);
	}
	
	public static void printStudents(Student[] students) {
		for(Student student : students) {
			System.out.println("studentId: " + student.getStudentId() + ", name: " + student.getName());
		}
	}
	
}
