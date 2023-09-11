import java.util.Random;

public class Ex02BasicRandomDemo {
public static void main(String[] args) {
	Random rd= new Random()	;
	
	//tạo ra 1 số nguyên ngẫu nhiên
	int rn1 = rd.nextInt(); //Integer.Min -> Integer.Max
	//tạo ra 1 số nguyên ngẫu nhiên từ [0,n] --> inclusive 0, exclusive n
	int rn2 = rd.nextInt(20);
	
	//Tạo ra 1 số ngẫu nhiên từ [a,b]
	int rn3 = rd.nextInt(4,20);
	
	int rn4 = 4 + rd.nextInt(16); // a + nextInt(b - a +)
	System.out.println("rn1 -->" +rn1);
	System.out.println("rn2 -->" +rn2);
	System.out.println("rn3 -->" +rn3);
	System.out.println("rn4 -->" +rn4);
	// VD: random 1 số thực từ 2,2 đến 56,80
	// : Kết quả là 1 số thập phân làm tròn có 2 chữ số
}
}
