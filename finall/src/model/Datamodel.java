package model;

import bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Datamodel {
    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("102130174", "Le Na", 7.8, "Nu"));
        students.add(new Student("102130125", "Hoang Nam", 8.2, "Nam"));
        students.add(new Student("102130176", "Van Cuong", 9.8, "Nam"));
        students.add(new Student("102130177", "Van Cong", 6.8, "Nam"));
        students.add(new Student("102130178", "Ngoc Nu", 9.1, "Nu"));
        students.add(new Student("102130180", "Hoang Nhung", 7.8, "Nu"));
        return students;
    }
}
