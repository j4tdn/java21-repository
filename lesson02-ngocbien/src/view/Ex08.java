package view;

public class Ex08 {
	
    public static void main(String[] args) {
        int number = 3; 
        
        if (checkNumber(number)) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không là số nguyên tố");
        }
    }

    public static boolean checkNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
