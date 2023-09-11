package homework;

public class Ex09FindNum {
	public static void main(String[] args) {
		int count = 0;
		int k = 0;
		for(int n = 1;;n++) {
			for(int i = 1; i <= n; i++) {
				if(n%i==0) {
					count++;	
				}	
			}	
			if(count==2) {
				k++;	
			}
			if(k==200) {
				System.out.println("Giá trị số nguyên tố thứ 200 là: "+n);
				return;
			}
			count = 0;
		}
		
	}
}
