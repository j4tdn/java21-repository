package demomain;

public class Ex01TestMainMethod {

	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Welcome to Java21 class");
		
		// In ra tam giác ngôi sao
		// Gọi hàm printStarTriangle
		
		printStarTriangle();
		
		System.out.println("... Main Finished...");

	}

	// Tạo ra/khai báo 1 hàm để in ra tam giác ngôi sao có 5 dòng
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
}
