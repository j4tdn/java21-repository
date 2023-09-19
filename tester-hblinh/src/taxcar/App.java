package taxcar;

import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);		
	static int count = 0;
	static int n;
	static double tax;
	static int t = 0;
	public static void main(String[] args) {
		
		
		System.out.println(" 1. Nhập kê khai thông tin của xe."+
							"\n 2. Xuất bản kê khai thuế"+
							"\n 3. Thoát"
				);
		System.out.println("Mời bạn chọn 1-3 trong menu: ");
		n = sc.nextInt();

			switch (n) {
			case 1: {
				
				System.out.println("Nhập số lượng xe cần kê khai: ");
				int s0 = sc.nextInt();	
				Info[] arrs = new Info[s0];
				for (int i = 0; i < s0; i++) {
					arrs[i] = new Info("","",0,0);
					pushInfo(arrs[i]);
					
				}
	
			}
			case 2: {
					System.out.printf("%-15s %-10s %-15s %-15s","Chủ sở hữu","Loại xe","Dung tích","Giá trị");
					System.out.println("\n====================================================");
					}
				break;
			default:
				return;
			}
		
		
		
	}
	
	public static void pushInfo(Info info) {
		sc.nextLine(); 
		System.out.println("Nhập thông tin xe thứ "+(count+1)+
				"\n========================");
		
		System.out.println("Nhập tên chủ sở hữu ");
		String s1 = sc.nextLine(); 
		info.setName(s1);
		System.out.println("Nhập loại xe: ");
		String s2 = sc.nextLine(); 
		info.setType(s2);
		System.out.println("Nhập dung tích xe: ");
		double s3 = sc.nextDouble(); 
		info.setCapacity(s3);
		System.out.println("Nhập giá trị xe: ");
		double s4 = sc.nextDouble(); 
		info.setValue(s4);
	}
	public static double tax(double value, double capacity) {
		
		if(capacity < 100){
			tax=value*0.01;
		} else if(capacity >= 100&&capacity <=200) {
			tax=value*0.03;
		} else {
			tax=value*0.05;
		}
		return tax;
	}
	
}
