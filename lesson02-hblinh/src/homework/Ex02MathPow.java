package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02MathPow {
	public static void main(String[] args) {
		int n ;
        int t = 0;
        int count = 0;
        Scanner number = new Scanner(System.in);
        String str = "";
        
        do
        {
            System.out.print("Nhập số dương N: ");

            str = number.nextLine();
          
            if (isNum(str)&&!isNone(str)) {
            	int kq = 1;
            	n = Integer.parseInt(str);
            	for(int i = 0;;i++) {
            		kq*=2;
            		if(kq==n) {
            			System.out.println(n+ " là lũy thừa của 2");
            			t = 1;
            			break;
            		}
            		else if(kq > n) {
            			System.out.println(n + " không là lũy thừa của 2");
            			break;
            		}
            	}  
            }
            else
            { 
                count++;
                if(count > 4) {
                	System.out.println("Bạn đã nhập sai quá lượt cho phép");
                	break;
                }
                System.out.println("Bạn vừa nhập vào không hợp lệ, vui lòng nhập lại !");
            }
        } while(true);
        	
       
	
}
	public static boolean isNum(String str) {
		  return str.matches("\\d*"); 
		}
	public static boolean isNone(String str) {
		  return str.matches("[0]"); 
		}
}
