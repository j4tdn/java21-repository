package model;

import bean.Student;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("102130183", "Tran Anh", 8.5, "Nam"));
		students.add(new Student("102130182", "Thi Mai", 7.0, "Nữ"));
		students.add(new Student("102130182", "Tuan Anh", 6.9, "Nam"));
		students.add(new Student("102130183", "Van Anh", 8.3, "Nữ"));
		students.add(new Student("102130182", "Hoang Long", 7.5, "Nam"));
		students.add(new Student("102130183", "Thi Thanh", 8.0, "Nữ"));
		students.add(new Student("102130186", "Nguyen Ha", 7.2, "Nữ"));
		students.add(new Student("102130183", "Van Binh", 9.0, "Nam"));
		students.add(new Student("102130186", "Thi Hong", 6.5, "Nữ"));
		students.add(new Student("102130186", "Van Hieu", 8.7, "Nam"));
		students.add(new Student("102130186", "Thi Hien", 7.9, "Nữ"));
		students.add(new Student("102130186", "Van Khoa", 9.2, "Nam"));
		students.add(new Student("102130192", "Thi Lan", 7.3, "Nữ"));
		students.add(new Student("102130192", "Van Luan", 8.4, "Nam"));
		students.add(new Student("102130194", "Thi Ngoc", 6.8, "Nữ"));
		return students;
	}
}
