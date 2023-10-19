package a.validation_try_catch_throw_throws;
import java.util.Scanner;
import java.time.Year;
public class Ex01 {
public static void main(String[] args) {

		// Enter year of birth --> calculate age of candidate
			
			
			//System.out.print("Enter year of birth:");
			
			//Validation
			// String yobAsText = ip.nextLine();
			Scanner ip = new Scanner(System.in);
			int a;
			int b;
			do {
				try {
					System.out.print("Enter a:");
					a = Integer.parseInt(ip.nextLine());
					
					System.out.print("Enter b:");
					b = Integer.parseInt(ip.nextLine());
					
					break;
				} catch (NumberFormatException | ArithmeticException e) {
					System.out.println("Vui lòng nhập lại:");
				}
				
			} while (true);
			//if (a==0) {
				//throw new ArithmeticException("e -> / by zero");
			//}
			try {
				System.out.println("X= :" +divide(a, b));
			} catch (ArithmeticException e) {
				System.out.println("" +e.getMessage());
			}			ip.close();
		}
private static float divide(int a, int b) {
	float x = (float)-b/a;
	if (a==0) {
			throw new ArithmeticException("Vui lòng nhập lại a khác 0");
	}
		return (float) x;
	}
}
