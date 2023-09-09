package homework;

import java.util.Scanner;

public class Ex08Element {
	public static void main(String[] args) {
		int n ;
		int count=0;
        Scanner number = new Scanner(System.in);
        String str = "";    
        do
        {
            System.out.print("Nhập số dương N: ");

            str = number.nextLine();
            
            if (isNum(str)) {
            	n = Integer.parseInt(str);
            	for(int i = 1; i <= n; i++) {
            		if(n%i==0) {
            			count++;
            		}		
            	}
            	if(count==2) {
            		System.out.println(n+ " là số nguyên tố");
            		count = 0;
            	} else {
            		System.out.println(n+ " không phải là số nguyên tố");
            		count = 0;
            	}
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
	}



