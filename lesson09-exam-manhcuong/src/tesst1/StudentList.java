package tesst1;

	import java.util.ArrayList;
	import java.util.List;

	public class StudentList {
	    public static void main(String[] args) {
	        Student[] students = {
	                new Student(102, "Nam", Grade.C),
	                new Student(103, "Bảo", Grade.F),
	                new Student(104, "Hoàng", Grade.D),
	                new Student(105, "Nguyên", Grade.B),
	                new Student(107, "Vũ", Grade.F),
	                new Student(109, "Lan", Grade.A),
	                new Student(202, "Đạt", Grade.C),
	                new Student(103, "Bảo", Grade.F),
	                new Student(107, "Vũ", Grade.C),
	                new Student(104, "Hoàng", Grade.B)
	        };

	        List<Student> studentsWithGradeA = getStudentsWithGrade(students, Grade.A);
	        System.out.println("List of students achieving grade A:");
	        displayStudentNames(studentsWithGradeA);

	        List<Student> studentsRetakingCourse = getStudentsRetakingCourse(students);
	        System.out.println("List of students registered for course structure data:");
	        displayStudentNames(studentsRetakingCourse);
	    }

	    private static List<Student> getStudentsWithGrade(Student[] students, Grade targetGrade) {
	        List<Student> result = new ArrayList<>();
	        for (Student student : students) {
	            if (student.getGrade() == targetGrade) {
	                result.add(student);
	            }
	        }
	        return result;
	    }

	    private static List<Student> getStudentsRetakingCourse(Student[] students) {
	        List<Student> result = new ArrayList<>();
	        for (Student student : students) {
	            if (student.getGrade() == Grade.F) {
	                result.add(student);
	            }
	        }
	        return result;
	    }

	    private static void displayStudentNames(List<Student> students) {
	        for (Student student : students) {
	            System.out.println(student.getName());
	        }
	    }
	}

	class Student {
	    private int studentId;
	    private String name;
	    private Grade grade;

	    public Student(int studentId, String name, Grade grade) {
	        this.studentId = studentId;
	        this.name = name;
	        this.grade = grade;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public String getName() {
	        return name;
	    }

	    public Grade getGrade() {
	        return grade;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "studentId=" + studentId +
	                ", name='" + name + '\'' +
	                ", grade=" + grade +
	                '}';
	    }
	}

	enum Grade {
	    A, B, C, D, E, F
	}
