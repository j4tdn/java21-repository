package generic.class_interface;

import java.util.Scanner;


public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();

        
        while (sc.hasNext()) {
            String s = sc.next();
            int num = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, num);
        }

        sc.close();
    }
}