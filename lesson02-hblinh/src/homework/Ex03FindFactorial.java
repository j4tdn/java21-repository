package homework;

import java.util.Scanner;

public class Ex03FindFactorial {
	public static void main(String[] args) {
		int n ;
        Scanner number = new Scanner(System.in);
        String str = "";    
        do
        {
            System.out.print("Nhập số dương N: ");

            str = number.nextLine();
            
            if (isNum(str)&&!isNone(str)) {
            	n = Integer.parseInt(str);
            	long kq = n;
            	for(int i = n-1;i>0;i--) {
            		kq*=i;
            	}  
            	System.out.println("Giai thừa của "+ n + " là:"+kq);
            }
            else
            { 
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

