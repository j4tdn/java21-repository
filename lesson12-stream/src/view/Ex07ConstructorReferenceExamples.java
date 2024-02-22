package view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import common.BuFunction;
import view.Ex07ConstructorReferenceExamples.TestCon;

public class Ex07ConstructorReferenceExamples {
	static class TestCon{
		private Integer a1;
		private String a2;
		private LocalDate a3;
		private BigDecimal a4;
		
		
		public TestCon(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
			this.a1 = a1;
			this.a2 = a2;
			this.a3 = a3;
			this.a4 = a4;
		}
		public TestCon(Integer a1, String a2) {
			this.a1 = a1;
			this.a2 = a2;
		}
		public TestCon() {
			
		}
		public TestCon(BigDecimal a4) {
			this.a4 = a4;
		}
		public TestCon(String line) {
			String[] tokens = line.split(", ");
			if(tokens.length==4) {
				Integer a1 = Integer.parseInt(tokens[0]);
				String  a2 = tokens[1];
				LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
				BigDecimal a4 = new BigDecimal(tokens[3]);
			}
		}
		public static TestCon transfer(String line) {	
				String[] tokens = line.split(", ");
				TestCon tc = new TestCon();
				if(tokens.length==4) {
					Integer a1 = Integer.parseInt(tokens[0]);
					String  a2 = tokens[1];
					LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
					BigDecimal a4 = new BigDecimal(tokens[3]);		
					tc = new TestCon(a1, a2, a3, a4);
				}
			return tc;
		}
		
		@Override
		public String toString() {
			return "TestCon [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + "]";
		}
		public static void main(String[] args) {
			//Dạng 1: constructor reference cho hàm khởi tạo ko có tham số
			Supplier<TestCon> sp = ()-> new TestCon();
			sp = TestCon::new;
			System.out.println("sp --> " + sp.get());
			//Dạng 2: constructor reference cho hàm khởi tạo có 2 tham số
			BiFunction<Integer, String, TestCon> bf = (a1, a2) -> new TestCon(a1, a2);
			System.out.println("bf1 --> " + bf.apply(1, "TC1"));
			
			bf = TestCon::new;
			System.out.println("bf2 --> " + bf.apply(1, "TC1"));
			System.out.println("\n=\n");
			
			//Dạng 3: constructor reference cho hàm khởi tạo có 1 tham số
			Function<BigDecimal, TestCon> f = a4 -> new TestCon(a4);
			System.out.println("f1 --> " + f.apply(BigDecimal.valueOf(20)));
			
			BuFunction<Integer, String, LocalDate, BigDecimal, TestCon> buf 
			= (a1, a2, a3, a4) -> new TestCon(a1, a2, a3, a4);
			buf = TestCon::new;
			System.out.println("buf --> " + buf.apply(1, "TC1", LocalDate.now(), BigDecimal.TEN));
			
			//Supplier<T>
			//Function<T, R>
			//BiFunction
			
		}
		
	}
	
	
	
	
	
	
	

}


