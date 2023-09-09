package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
 
public class Ex01FindMultiples {
	public static void main(String[] args) {
		int n = 0;
        int t = 0;
        int count = 0;
        int mul;
        Scanner number = new Scanner(System.in);
        String str = "";
        
        do
        {
            System.out.print("Nhập số dương N: ");

            str = number.nextLine();
          
            if (isNum(str)&&!isNone(str)) {
                n = Integer.parseInt(str);
                mul = n%2;
                count = 0;
                if(mul != 1) {
                	System.out.println(n+"  là bội số của 2");
                	} else {
                		System.out.println(n+"  không phải là bội số của 2");
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
