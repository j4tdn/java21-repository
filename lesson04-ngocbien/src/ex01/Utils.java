package ex01;

public class Utils {

	public static float averagePoint(Student student) {
		float averagePoint = 0;
		averagePoint = (student.getTheoryPoint() + student.getPracticePoint()) / 2;

		return averagePoint;
	}

	public static void findStudent(Student[] students) {
		for (Student student : students) {
			if (averagePoint(student) >= 8.5) {
				System.out.println(student);
			}
		}
	}

	public static void findStudentHasTheoryHigherPractice(Student[] students) {
		for (Student student : students) {
			if (student.getTheoryPoint() > student.getPracticePoint()) {
				System.out.println(student);
			}
		}
	}
}
