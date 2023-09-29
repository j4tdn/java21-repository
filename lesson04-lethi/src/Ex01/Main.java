package Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();

        Student s1 = new Student(1, "Võ Lê Thi", 8.7, 7.5);

        Student s2 = new Student(2, "Nguyễn Ngọc Tú", 9.2, 8.9);

        Student s3 = new Student();
        
        System.out.print("Nhập mã sinh viên cho sv3: ");
        s3.setStudentId(ip.nextInt());
        ip.nextLine(); 
        
        System.out.print("Nhập họ tên cho sv3: ");
        s3.setName(ip.nextLine());
        
        System.out.print("Nhập điểm lý thuyết cho sv3: ");
        s3.setTheoryPoint(ip.nextDouble());
        
        System.out.print("Nhập điểm thực hành cho sv3: ");
        s3.setPracticePoint(ip.nextDouble());

        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);

        for (Student st : listStudent) {
            System.out.println(st);
        }

        System.out.println("\nSinh viên có điểm trung bình lớn hơn 8.5:");
        for (Student st : listStudent) {
            if (st.avgPoint() > 8.5) {
                System.out.println(st);
            }
        }

        System.out.println("\nSinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
        for (Student st : listStudent) {
            if (st.getPracticePoint() < st.getTheoryPoint()) {
                System.out.println(st);
            }
        }
    }
}

