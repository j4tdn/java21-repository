package ex04.hrm;

public class App {
	public static void main(String[] args) {
		Manager mng = new Manager("Nguyễn Văn An", "11/03/1996", 4.6, 3.8);
		
		HeadOfDepartment[] headsDm = {
				new HeadOfDepartment("Nguyễn Bính", "15/03/1998", 4.2, 3),
				new HeadOfDepartment("Hoàng Hân", "10/08/1997", 4.2, 3)	
		};
		Staff[] stfs = {
				new Staff("Nguyễn Thị Duyên", "15/03/1998", 3.2, "b2c1"),
				new Staff("Vũ Triệu Vỹ", "15/04/2003", 2.2, "b2c1"),
				new Staff("Lê Văn Dũng", "19/06/2004", 2.7, "b2c1"),
				new Staff("Hồ Bảo Linh", "25/07/2001", 3.2, "b2c2"),
				new Staff("Trần Văn Thành", "02/03/2000", 3.5, "b2c2"),
				new Staff("Hoàng Thanh Hiền", "07/11/1998", 2.7, "b2c2"),
				
		};
		
			// Xuất thông tin nhân sự trong công ty
			System.out.printf("%50s","XUẤT THÔNG TIN NHÂN SỰ");
			System.out.printf("\n%40s","***  GIÁM ĐỐC  ***\n");
			System.out.printf("%-20s %-20s %-20s %-10s","Họ và tên","Ngày sinh","Hệ số lương","Hệ số chức vụ\n");
			System.out.printf("%-20s %-20s %-20s %-20s\n",mng.getName(),mng.getDate(),mng.getSalary(),mng.getPosition());
			
			printHead(headsDm);
			printStaff(stfs);
			// Thống kê số lượng nhân viên quản lý bởi trưởng phòng
			countEmployees(stfs, headsDm);
			
			// Xuất bảng lương nhân sự trong công ty
			System.out.printf("%50s", "XUẤT BẢNG LƯƠNG NHÂN SỰ");
			System.out.printf("\n%40s","***  GIÁM ĐỐC  ***\n");
			System.out.printf("%-20s %-20s %-20s %-10s","Họ và tên","Ngày sinh","Hệ số lương","Lương");
			System.out.printf("\n%-20s %-20s %-20s %-10s\n",mng.getName(),mng.getDate(),mng.getSalary(),Math.round( mng.totalSalaryManager(mng)),1);
			printSalaryHead(headsDm);
			printSalaryStaff(stfs);

	}
	public static void printHead(HeadOfDepartment[] headsDm) {
		System.out.printf("\n%44s","***  TRƯỞNG PHÒNG  ***\n");
		System.out.printf("%-20s %-20s %-20s %-10s","Họ và tên","Ngày sinh","Hệ số lương","Số lượng NV quản lý\n");
		for(HeadOfDepartment headDm : headsDm ) {
			System.out.printf("%-20s %-20s %-20s %-10s\n",headDm.getName(), headDm.getDate(), headDm.getSalary(), headDm.getNumEmployees());
		}
		
	}
	public static void printSalaryHead(HeadOfDepartment[] headsDm) {
		System.out.printf("\n%44s","***  TRƯỞNG PHÒNG  ***\n");
		System.out.printf("%-20s %-20s %-20s %-10s\n","Họ và tên","Ngày sinh","Hệ số lương","Lương");
		for(HeadOfDepartment headDm : headsDm ) {
			System.out.printf("%-20s %-20s %-20s %-10s\n",headDm.getName(), headDm.getDate(), headDm.getSalary(), headDm.totalSalary(headDm));
		}
		
	}
	
	public static void printStaff(Staff[] stfs) {
		System.out.printf("\n%41s","***  NHÂN VIÊN  ***\n");
		System.out.printf("%-20s %-20s %-20s %-5s","Họ và tên","Ngày sinh","Hệ số lương","Đơn vị\n");
		for(Staff staf : stfs ) {
			System.out.printf("%-20s %-20s %-20s %-10s\n",staf.getName(), staf.getDate(), staf.getSalary(), staf.getDepartment());
		}
		
	}
	public static void printSalaryStaff(Staff[] stfs) {
		System.out.printf("\n%41s","***  NHÂN VIÊN  ***\n");
		System.out.printf("%-20s %-20s %-20s %-5s","Họ và tên","Ngày sinh","Hệ số lương","Lương\n");
		for(Staff staf : stfs ) {
			System.out.printf("%-20s %-20s %-20s %-10s\n",staf.getName(), staf.getDate(), staf.getSalary(), staf.totalSalary(staf));
		}

	}
	public static void countEmployees(Staff[] stfs, HeadOfDepartment[] headsDm) {
		int count1 = 0;
		int count2 = 0;
		for(Staff staf : stfs ) {
			if(staf.getDepartment()=="b2c1") {
				count1++;
			} else if(staf.getDepartment()=="b2c2") {
				count2++;
			}
		}
		System.out.println("\nTHỐNG KÊ SỐ LƯỢNG NHÂN VIÊN ĐƯỢC QUẢN LÝ BỞI TỪNG TRƯỞNG PHÒNG\n");
		System.out.println(" 1. "+headsDm[0].getName()+" quản lý "+ count1 + " nhân viên.\n");
		System.out.println(" 2. "+headsDm[1].getName()+" quản lý "+ count2 + " nhân viên.\n");
	}
}
	
