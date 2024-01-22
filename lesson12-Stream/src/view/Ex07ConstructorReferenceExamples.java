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
		//constructor reference with constructor 0,1,2,3,4,n parameter
		// Dạng 1
		//có hàm nào, có tham số là supplier<T>, cần truyền supplier cho bất kì đối tượng nào
		//--> khởi tạo supplier để tạo ra đối tượng cho TestCon
		Supplier<TestCon> supplier = () -> new TestCon(); // Không tham số : Supplier: truyền bất kì và trả về gọi hàm khởi tạo rỗng
		System.out.println("1.supplier --> " +supplier.get());
		
		
		supplier = TestCon::new;
		System.out.println("2.supplier  -->"+supplier.get());
		
		// Dạng 2: constructor reference cho hàm khởi tạo 2 tham số ==> BiFunction
		BiFunction<Integer, String, TestCon> bf = (a1, a2 ) -> new TestCon(a1, a2);
		System.out.println("3.BiFunction --> "+bf.apply(1, "BiFunction 1"));
		
		bf = TestCon::new;
		System.out.println("4.BiFunction --> "+bf.apply(1, "BiFunction 2"));
		
		//Dạng 3: Constructor reference cho hàm khởi tạo 1 tham số ==> Function
		Function<BigDecimal, TestCon> f = (a1) -> new TestCon(a1);
		System.out.println("5.Function" +f.apply(BigDecimal.valueOf(20)));
		
		bf = TestCon::new;
		System.out.println("6.Function --> "+ f.apply(BigDecimal.valueOf(20)));
		
		BuFunction<Integer, String, LocalDate, BigDecimal, TestCon> buf = (a1, a2,a3,a4) -> new TestCon(a1, a2,a3,a4);
		System.out.println("7.BuFunction --> " +buf.apply(1, "Duc", LocalDate.now(), BigDecimal.TEN));
		
		buf = TestCon::new;
		System.out.println("8.BuFunction --> " +buf.apply(1, "Duc", LocalDate.now(), BigDecimal.TEN));
		
		//Từ 3 tham số--> phải tự tạo: gợi ý: sử dụng method reference
		
		Function<TestCon, TestCon> ftc = TestCon::convert;
		System.out.println("9.ftc -->"+ftc.apply(new TestCon(1, "Duc", LocalDate.now(), BigDecimal.valueOf(25))));
	}
		
	
	static class TestCon {
		private Integer a1;
		private String a2;
		private LocalDate a3;
		private BigDecimal a4;
		
		public TestCon() {
			
		}
		
		public TestCon(BigDecimal a4) {
			this.a4 = a4;
			
		}
        public TestCon(Integer a1, String a2) {
        	this.a1 = a1;
        	this.a2 = a2;
			
		}

		public TestCon(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
			super();
			this.a1 = a1;
			this.a2 = a2;
			this.a3 = a3;
			this.a4 = a4;
		}
		public static TestCon convert(TestCon source) {
			
			// Truyền 1 trả về 1 
			return new TestCon(source.a1,source.a2,source.a3,source.a4);
		}
		public TestCon(String line) {
			String[] tokens = line.split(", ");
			if(tokens.length == 4) {
				this.a1 = Integer.parseInt(tokens[0]);
				this.a2 = tokens[1];
				this.a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
				this.a4 = new BigDecimal(tokens[3]);
			}
		}
		public static TestCon transfer(String line) {
			String [] tokens = line.split(", ");
			TestCon tc = new TestCon();
			if(tokens.length == 4) {
				Integer a1 = Integer.parseInt(tokens[0]);
				String a2 = tokens[1];
				LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
				BigDecimal a4 = new BigDecimal(tokens[3]);
				tc = new TestCon(a1, a2, a3, a4);	
			}
			return tc;
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
