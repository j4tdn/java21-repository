package ex04.hrm;

import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Manager mng = new Manager();
		HeadOfDepartment headDmt = new HeadOfDepartment();
		Staff stff = new Staff();
		System.out.println("***  ỨNG DỤNG QUẢN LÝ NHÂN SỰ ***\n");
		System.out.println(" 1. Nhập thông tin nhân sự.\n"
				+ " 2. In ra thông tin nhân sự.\n"
				+ " 3. Xuất bảng lương nhân sự.\n");
		System.out.println("Vui lòng chọn chức năng (1-3): ");
		Integer n = sc.nextInt();
		switch (n) {
		case 1: {
			System.out.println("NHẬP THÔNG TIN NHÂN SỰ");
			
			
			break;
		}
		case 2: {
			System.out.println("XUẤT THÔNG TIN NHÂN SỰ");
			
			break;
		}
		case 3: {
			System.out.println("XUẤT BẢNG LƯƠNG NHÂN SỰ");
			
			break;
		}
		default:
			System.out.println("Vui lòng chọn lại !");
		}
	
	}
	
	public static void infoManager(Manager mng) {
		
			System.out.println(" * Thông tin của giám đốc");
			System.out.println("1. Họ và tên: ");
			mng.setName(sc.nextLine());sc.nextLine();
			System.out.println("2. Nhập ngày sinh (xx/yy/zzzz): ");
			mng.setDate(sc.nextLine());
			System.out.println("3. Nhập hệ số lương: ");
			mng.setSalary(sc.nextDouble());
			System.out.println("4. Nhập hệ số chức vụ: ");
			mng.setPosition(sc.nextDouble());
	}
	
	public static void infoHeadOfDepartment(HeadOfDepartment headDmt) {
			
			System.out.println(" * Thông tin của giám đốc");
			System.out.println("1. Họ và tên: ");
			headDmt.setName(sc.nextLine());sc.nextLine();
			System.out.println("2. Nhập ngày sinh (xx/yy/zzzz): ");
			headDmt.setDate(sc.nextLine());
			System.out.println("3. Nhập hệ số lương: ");
			headDmt.setSalary(sc.nextDouble());
			System.out.println("4. Nhập số lượng nhân viên quản lý: ");
			headDmt.setNumEmployees(sc.nextInt());
		}
	
	public static void infoStaff(Staff stff) {
		
			System.out.println(" * Thông tin của giám đốc");
			System.out.println("1. Họ và tên: ");
			stff.setName(sc.nextLine());sc.nextLine();
			System.out.println("2. Nhập ngày sinh (xx/yy/zzzz): ");
			stff.setDate(sc.nextLine());
			System.out.println("3. Nhập hệ số lương: ");
			stff.setSalary(sc.nextDouble());
			System.out.println("4. Nhập tên đơn vị: ");
			stff.setDepartment(sc.nextLine());
	}
}
	
