package lesson01_ducthinh;

public class Main {
	public static void main(String[] args) {
		Vehicle x1 = new Vehicle("Nguyễn Thu Loan", "Future Neo ",  100, 35000000);
		Vehicle x2 = new Vehicle("Lê Minh Tính   ", "Ford Ranger", 100, 250000000);
		Vehicle x3 = new Vehicle("Nguyễn Thu Loan", "Future Neo ",  100, 1000000000);
		System.out.println("Tên chủ xe"+"            "+"Loại xe"+"           "+"Dung tích"+
							 "    "+"Trị giá"+"     "+"Thuế phải nộp");
		System.out.println("===============================================================================");
		System.out.println(""+x1+x1.calTax());
		System.out.println(""+x2+x2.calTax());
		System.out.println(""+x3+x3.calTax());

	}
}
