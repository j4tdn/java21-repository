package javacoban;

public class Swap {
    public static void main(String[] args) {
        CustomerInteger ci1 = new CustomerInteger(10);  
        CustomerInteger ci2 = new CustomerInteger(20); 
        
        System.out.println("Truoc khi swap: ");
        System.out.println("ci1---->"+ci1);
        System.out.println("ci2---->"+ci2);
        
        swapCustomerInteger(ci1, ci2);
        System.out.println("Sau khi swap: ");
        System.out.println("ci1---->"+ci1);
        System.out.println("ci2---->"+ci2);
        
    }

	private static void swapCustomerInteger(CustomerInteger a, CustomerInteger b) {
		int temp = a.value;  // khởi tạo biến temp, lấy value a = 10 gán cho temp
		a.value = b.value;  // gán b cho a, lấy value của b = 20 gán cho  a -----> a = 20
		b.value = temp;    // gán temp cho b, lấy value temp = 10 gán cho b -----> b =10
		
	}
}
