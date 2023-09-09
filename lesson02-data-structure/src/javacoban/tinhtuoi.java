package javacoban;

import java.util.Calendar;
import java.util.Scanner;

public class tinhtuoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nam sinh:");
		int namSinh = sc.nextInt();

		// int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
		
		// Calendar: cung cấp các chức năng làm việc với ngày, tháng, năm
		// không thể khởi tạo bằng từ khóa new, mà sử dụng phương thức tĩnh getInstance
		// để nhận một thể hiện của lớp Calendar
		//Calender.YEAR ---> lấy thông tin năm 
		
		
		System.out.println("Nhap năm hiện tại: ");
		int namHienTai = sc.nextInt();
		int tuoi = namHienTai - namSinh;
		System.out.println("Tuổi của bạn là:" + tuoi);
	}
}
