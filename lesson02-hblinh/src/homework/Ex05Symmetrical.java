package homework;

import java.util.Scanner;

public class Ex05Symmetrical {
	public static void main(String[] args) {
		int n ;
        Scanner number = new Scanner(System.in);
        String str = "";  
        int result = 0;
        do
        {
            System.out.print("Nhập số dương N: ");

            str = number.nextLine();
            
            if (isNum(str)&&!isNone(str)) {
            	n = Integer.parseInt(str);
            	int numCheck = n;
            	while(n!=0) {
            		int residual = n%10;
            		result = result*10 + residual;
            		n=n/10;
            	}
            	if(result==numCheck) {
            		System.out.println(numCheck+" là số đối xứng");
            	} else {
            		System.out.println(numCheck+" không phải là số đối xứng");
            	}
            	result = 0;
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
		  return str.matches("\\d{1}"); 
		}

	}


