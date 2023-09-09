package demomain;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Wellcome to class JAVA 21");
		printStarTriangle(); // gọi hàm printStarTriangle()
		System.out.println(".... Finsihed ....");
	}

	// Tạo/ Khai báo 1 chức năng in ra tam giác ngôi sao có 5 dòng
	private static void printStarTriangle() {
		// private : chỉ sử dụng được trong class chứa nó
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
//Muốn chạy được chức năng printStarTriangle()thì phải gọi nó trong hàm main
	}
}
