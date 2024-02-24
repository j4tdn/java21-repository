package view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import common.BuFunction;
import view.Ex07ConstructorReferenceExamples.TestCon;

public class Ex07ConstructorReferenceExamples {

    public static <T> void main(String[] args) {
    	
    	// constructor.
    	// Dạng 1: CR cho hàm khởi tạo rỗng
    	//
    	// khởi tạo supplier để tạo ra đối tượng cho TestCon
    	
    	Supplier<TestCon> supplier = () -> new TestCon();
    	System.out.println("supplier 1: "+ supplier.get());
    	
    	supplier = TestCon::new;
    	System.out.println("supplier 2: "+ supplier.get());
    	
		// Dạng 2: CR cho hàm khởi tạo có hai tham số
		BiFunction<Integer, String, TestCon> bf = (a1, a2) -> new TestCon(a1, a2);
    	System.out.println("bf1: --> "+ bf.apply(1, "TC1"));
    	
    	bf = TestCon::new;
    	System.out.println("bf2: --> "+ bf.apply(1, "TC1"));
    	
    	// Dạng 3: CR cho hàm khởi tạo có 1 tham số
		Function<BigDecimal, TestCon> f = (a4) -> new TestCon(a4);
		System.out.println("f1 --> "+ f.apply(BigDecimal.valueOf(20)));
		
		f = TestCon::new;
		System.out.println("f2 --> "+ f.apply(BigDecimal.valueOf(20)));
		
		// Dạng 4: CR cho hàm khởi tạo có 4 tham số --> tự tạo functional interface
		BuFunction<Integer, String, LocalDate, BigDecimal, TestCon> buf = (a1, a2, a3, a4) -> new TestCon(a1, a2, a3,
				a4);
		System.out.println("buf 1 --> " + buf.add(null, null, null, null));

		buf = TestCon::new;
		System.out.println("buf 2 --> " + buf.add(null, null, null, null));
		
		// Supplier<T>
		// Function<T, R>
		// BiFunction<T, U, R>
		
		// Từ 3 tham số: phải từ tạo ra || --> (*) chuyển sang dùng method reference
		
	}	
    
    static class TestCon {
    	private Integer a1;
    	private String a2;
    	private LocalDate a3;
    	private BigDecimal a4;
    	
    	
    	
    	private TestCon() {
    		
    	}
    	
		public TestCon(Integer a1, String a2) {
			this.a1 = a1;
			this.a2 = a2;
		}
		
		public TestCon(BigDecimal a4) {
			this.a4 = a4;
		}

		public TestCon(Integer a1, String a2, LocalDate a3, BigDecimal a4) {
			super();
			this.a1 = a1;
			this.a2 = a2;
			this.a3 = a3;
			this.a4 = a4;
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

		public static TestCon transfer(String line) {
			String[] tokens = line.split(", ");
			TestCon tc = new TestCon();
			if (tokens.length == 4) {
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
