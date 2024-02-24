package view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import common.BuFunction;

public class Ex07ConstructorReferenceExamples {

	public static void main(String[] args) {
		
		//constructor reference with constructor 0, 1, 2, 3, 4, n parametter
		//khởi tạo đối tượng supplier để tạo ra đối tượng cho TestCon
		
		//Dạng 1: Constructor reference cho hàm khởi tạo rổng
		// có hàm nào, có tham số làm Supplier <T>, cần truyền supplileer cho bất kỳ đối tượng
		// --> khởi tạo supplier để tạo ra đối tượng cho TestCon
		Supplier<TestCon> supplier = () -> new TestCon();
		System.out.println("Supplier1 -->" + supplier.get());
		
	
		supplier = TestCon::new;
		System.out.println("Supplier2 -->" + supplier.get());
		
		System.out.println("\n\n");
		
		//Dạng 2: Constructor reference cho hàm khởi tạo có 2 tham số
		BiFunction<Integer, String, TestCon> bf = (a1, a2)	-> new TestCon(a1, a2);
		System.out.println("bf1 -->" +bf.apply(1, "TC1"));
		
		bf = TestCon::new;
		System.out.println("bf2 -->" +bf.apply(1, "TC2"));
		
		System.out.println("\n\n");
		
		//Dạng 3: Constructor reference cho hàm khởi tạo có 1 tham số
		Function<BigDecimal, TestCon> f = (a4) -> new TestCon(a4);
		System.out.println("f1 --> " +f.apply(BigDecimal.valueOf(20)));
		
		f = TestCon::new;
		System.out.println("f2 --> " +f.apply(BigDecimal.valueOf(20)));
		
		System.out.println("\n\n");
		// Dạng 4 : Constructor reference cho hàm khởi tạo có 1 tham số
		BuFunction<Integer, String, LocalDate, BigDecimal, TestCon> buf = 
							(a1, a2, a3, a4) -> new TestCon(a1, a2, a3, a4);
		
		// static method reference 
		buf = Ex07ConstructorReferenceExamples::test;
							
		// constructor reference 					
		buf = TestCon::new;
		
		//type infrerence
		
		//data_ type var_name = value;
		//để biết chính xác var_name KDL gì thì nhờ valie lúc runtime
		
	
		//bfz= TestCon::new;
		//Muốn biết bên phải gọi đến chính xác code, hàm nào --> dựa vào thằng bên trái
		
		System.out.println("buf --> " +buf.apply(1, "TC11", LocalDate.now(), BigDecimal.TEN));
		
		//Suplier<T> : không có tham số
		//Function <T,R> 1 tham số
		//BiFunction<T,U, R> 2 tham số
		
		// >2 Từ 3 tham số k có hàm, phải tự tạo thêm FunctionalInterface
		
		//Gợi ý: chuyển sang dùng static method reference 
	}
	
	public static TestCon test(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
		return new TestCon(a1, a2, a3, a4); //
	}
	
	
	static class TestCon {
		private Integer a1;
		private String a2;
		private LocalDate a3;
		private BigDecimal a4;
		
		public TestCon() {
		}
		
		public TestCon(String line) {
			String[] tokens = line.split(", ");
			if (tokens.length == 4) {
				this.a1 = Integer.parseInt(tokens[0]);
				this.a2 = tokens[1];
				this.a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
				this.a4 = new BigDecimal(tokens[3]);
			}
		}
		
		
		public static TestCon transfer (String line) {
			String[] tokens = line.split(", ");
			TestCon tc = new TestCon();
			if (tokens.length ==4 ) {
				Integer a1 = Integer.parseInt(tokens[0]);
				String a2 = tokens[1];
				LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
				BigDecimal a4 = new BigDecimal(tokens[3]);
				tc = new TestCon(a1, a2, a3, a4);
			}
			return tc;
		}
		
		public TestCon( BigDecimal a4) {
			this.a4 = a4;
		}
		
		public TestCon( Integer a1, String a2) {
			this.a1= a1;
			this.a2= a2;
		}
		
		public TestCon(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
			this.a1 = a1;
			this.a2 = a2;
			this.a3 = a3;
			this.a4 = a4;
		}

		public Integer getA1() {
			return a1;
		}

		public void setA1(Integer a1) {
			this.a1 = a1;
		}

		public String getA2() {
			return a2;
		}

		public void setA2(String a2) {
			this.a2 = a2;
		}

		public LocalDate getA3() {
			return a3;
		}

		public void setA3(LocalDate a3) {
			this.a3 = a3;
		}

		public BigDecimal getA4() {
			return a4;
		}

		public void setA4(BigDecimal a4) {
			this.a4 = a4;
		}

		@Override
		public String toString() {
			return "TestCon [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + "]";
		}
		
		
	}
		
}
