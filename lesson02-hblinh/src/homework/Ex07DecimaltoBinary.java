package homework;

import java.util.Scanner;

public class Ex07DecimaltoBinary {
	public static void main(String[] args) {
		int n ; int result = 0; int exp = 1;
        Scanner number = new Scanner(System.in);
        String str = "";    
        do
        {
            System.out.print("Nhập số dương N: ");

            str = number.nextLine();
            
            if (isNum(str)) {
            	n = Integer.parseInt(str);
            	int num = n;
            	while(n!=0) {
            		int residual = n%2;
            		result = result+residual*exp;
            		exp = exp*10;
            		n=n/2;
            	}
            	System.out.println("Chuyển số hệ thập phân "+num+
            			" sang hệ nhị phân là: "+result);
            	result = 0;
            	exp = 1;
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


