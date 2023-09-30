package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// khởi tạo giá trị cho 3 đối tượng student 1 -> 3
		Student st1 = new Student(170256, "Alex Sandro", 9, 7);
		Student st2 = new Student(170985, "Roberto Fimirno", 7.5, 9);
		Student st3 = new Student();

		// nhập các giá trị thuộc tính của đối tượng sinh viên 3 từ bàn phím
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the information for student 3rd");
		System.out.println("Enter the ID: ");
		int id = sc.nextInt();
		st3.setID(id);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		st3.setName(name);
		System.out.println("Enther the theory GPA: ");
		double theory = sc.nextDouble();
		st3.setTheoryGPA(theory);
		System.out.println("Enter the practice GPA");
		double practice = sc.nextDouble();
		st3.setPracticeGPA(practice);

		// Đưa danh sách 3 sinh viên vào mảng một chiều
		Student[] listStudent = { st1, st2, st3 };

		// Tìm sinh viên có điểm trung bình lớn hơn 8.5
		System.out.println("List of student has the average GPA above 8.5: ");
		for (Student st : listStudent) {
			if (st.calculateAverageGPA() > 8.5) {
				System.out.println(st);
			}
		}

		// Tìm sinh viên có điểm lý thuyết lớn hơn điểm thực hành
		System.out.println("List of student has theory GPA above practice GPA:");
		for (Student st : listStudent) {
			if (st.getTheoryGPA() > st.getPracticeGPA()) {
				System.out.println(st);
			}
		}

	}

}
