package ex02;

import java.util.Scanner;

import bean.Vehicle;

public class tax {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("tên : ");
		String fn = ip.nextLine();
		System.out.println("loại xe : ");
		String name = ip.nextLine();
		System.out.println("dung tích : ");
		int capa = Integer.parseInt(ip.nextLine());
		System.out.println("trị giá : ");
		double pri = Double.parseDouble(ip.nextLine());
		
		
		Vehicle v1 = new Vehicle( fn, name, capa, pri);
		
		
		System.out.println("tên chủ xe     " + "     loại xe     " + "     dung tích     " + "     trị giá     " + "     thuế phải nộp     ");
		System.out.println("=====================================================================================================");
		System.out.println( fn + "		    " + name + "		    "+ capa+"		    " + pri+"		    " + v1.tax());
	}
}
