package exam01;

import java.util.Scanner;

public class Ex03 {
	public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
    	System.out.println("Nhap so: ");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = isHappyNumber(result);  
        }  
          
        if(result == 1)  
            System.out.println(num + "la so hanh phuc");  
        else if(result == 4)  
            System.out.println(num + " khong phai so hanh phuc");     
    }  
}  
