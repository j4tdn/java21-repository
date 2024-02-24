package view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import common.BuFunction;

public class Ex07ConstructorReferenceExamples {

	public static void main(String[] args) {
		// constructor reference with constructor 0,1,2,3,4, n parameters

		// Dạng 1: Constructor reference cho hàm khởi tạo rỗng

		// có hàm nào, có tham số là Supplier<T>, cần truyền supplier cho bất kỳ đối
		// tượng
		// --> khởi tạo supplier để tạo ra đối tượng cho TestCon
		Supplier<TestCon> supplier = () -> new TestCon();

		System.out.println("supplier1 --> " + supplier.get());

		supplier = TestCon::new;
		System.out.println("supplier2 --> " + supplier.get());
		System.out.println("\n\n");

		// Dạng 2: Constructor reference cho hàm khởi tạo có 2 tham số
		BiFunction<Integer, String, TestCon> bf = (a1, a2) -> new TestCon(a1, a2);

		System.out.println("bf1 ==> " + bf.apply(1, "TC1"));

		bf = TestCon::new;
		System.out.println("bf2 ==> " + bf.apply(1, "TC1"));

		System.out.println("\n\n");

		// Dạng 3: Constructor reference cho hàm khởi tạo có 1 tham số
		Function<BigDecimal, TestCon> f = (a4) -> new TestCon(a4);
		System.out.println("f1 ---> " + f.apply(BigDecimal.valueOf(20)));

		f = TestCon::new;
		System.out.println("f1 ---> " + f.apply(BigDecimal.valueOf(20)));

		System.out.println("\n\n");

		// Dạng 4: Constructor reference cho hàm khởi tạo có 4 tham số
		
		BuFunction<Integer, String, LocalDate, BigDecimal, TestCon> buf = (a1, a2, a3, a4) -> new TestCon(a1, a2, a3,
				a4);

		//static method reference
		buf = Ex07ConstructorReferenceExamples::test;
		
		// constructor reference
		buf = TestCon::new;
		
		System.out.println("buf --> " + buf.apply(1, "TC11", LocalDate.now(), BigDecimal.TEN));
		
		//Không có tham số : Dùng Supplier<T>
		// 1 tham số: Function
		// 2 tham số: BiFunction
		// 3 tham số trở lên: tự tạo
	}

	public static TestCon test(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
		return new TestCon(a1,a2,a3,a4);
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
