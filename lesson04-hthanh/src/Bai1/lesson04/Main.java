package Bai1.lesson04;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("ngu");
		ArrayList<Attribute> attribute = new ArrayList<>();
		Attribute sv1 = new Attribute(Bi(170795), "Thanh", Bd(9), Bd(10));
		attribute.add(sv1);
		Attribute sv2 = new Attribute(Bi(170795), "Thanh", Bd(9), Bd(10));
		attribute.add(sv2);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao MSSV: ");
		BigInteger id = sc.nextBigInteger();
		sc.nextLine();
		
		System.out.println("Nhap ten: ");
		String name = sc.nextLine();
		
		System.out.println("Diem ly thuyet: ");
		BigDecimal pointTheory = sc.nextBigDecimal();
		sc.nextLine();
		
		System.out.println("Diem thuc hanh: ");
		BigDecimal pointPractice = sc.nextBigDecimal();
		sc.nextLine();
		
		Attribute sv3 = new Attribute();
		sv3.setMSSV(id);
		sv3.setName(name);
		sv3.setPointTheory(pointTheory);
		sv3.setPointPractice(pointPractice);
		attribute.add(sv3);
		
		System.out.println("Diem trung binh hon 8.5: ");
		for(Attribute attribute2 : attribute) {
			if (pointFinal(attribute2.getPointTheory(), attribute2.getPointPractice())) System.out.println(attribute2.toString());
		}
		System.out.println("Diem ly thuyet honw diem thuc hanh: ");
		for(Attribute attribute2 :  attribute) {
			if(compare2Point(attribute2.getPointTheory(), attribute2.getPointPractice())) System.out.println(attribute2.toString());
		}
	}
	
	private static Boolean pointFinal(BigDecimal a, BigDecimal b) {
		if(((a.add(b)).divide(Bd(2))).doubleValue() > 8.5) return true;
		else return false;
	}

	private static Boolean compare2Point(BigDecimal a, BigDecimal b) {
		if(a.doubleValue()>b.doubleValue()) return true;
		else return false;
	}
	
	private static BigDecimal Bd(int i) {
		BigDecimal a = new BigDecimal(i);
		return a;
	}

	private static BigInteger Bi(int i) {
		BigInteger a = new BigInteger(String.valueOf(i));
		return a;
	}
}
