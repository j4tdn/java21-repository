package homework;

import java.util.Scanner;

public class Ex06MinMaxInt {
	public static void main(String[] args) {
		
		int a ; int b; int c;
        Scanner number = new Scanner(System.in);
        String str = "";    
        do
        {
            System.out.print("Nhập số nguyên dương a: ");

            str = number.nextLine();
            
            if (isNum(str)) {
            	a = Integer.parseInt(str);
            	if(a<20&&a>=0) {
            		 do
            	        {
            	            System.out.print("Nhập số nguyên dương b: ");

            	            str = number.nextLine();
            	            
            	            if (isNum(str)) {
            	            	b = Integer.parseInt(str);
            	            	if(b<20&&a>=0) {
            	            		 do
            	            	        {
            	            	            System.out.print("Nhập số nguyên dương c: ");

            	            	            str = number.nextLine();
            	            	            
            	            	            if (isNum(str)) {
            	            	            	c = Integer.parseInt(str);
            	            	            	if(c<20&&a>=0) {
            	            	            		int max1 = Math.max(a, b);
            	            	            		int max2 = Math.max(max1, c);
            	            	            		System.out.println("Số nguyên dương lớn nhất là: "+max2);
            	            	            		int min1 = Math.min(a, b);
            	            	            		int min2 = Math.min(min1, c);
            	            	            		System.out.println("Số nguyên dương lớn nhất là: "+min2);
            	            	            		return;
            	            	            	}
            	            	            	else{
            	            	            		System.out.println("Bạn vừa nhập vào không hợp lệ, vui lòng nhập lại !");
            	            	            		continue;}
            	            	            }
            	            	            else
            	            	            { 
            	            	                System.out.println("Bạn vừa nhập vào không hợp lệ, vui lòng nhập lại !");
            	            	            }
            	            	        } while(true);
            	            		
            	            		
            	            	}
            	            	else{
            	            		System.out.println("Bạn vừa nhập vào không hợp lệ, vui lòng nhập lại !");
            	            		continue;}
            	            }
            	            else
            	            { 
            	                System.out.println("Bạn vừa nhập vào không hợp lệ, vui lòng nhập lại !");
            	            }
            	        } while(true);
            		
            		
            	}
            	else{
            		System.out.println("Bạn vừa nhập vào không hợp lệ, vui lòng nhập lại !");
            		continue;}
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



