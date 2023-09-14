package exercises;

import java.util.Random;

public class exercises04 {
	public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(11) + 10;
        int b = random.nextInt(11) + 10;
        int c = random.nextInt(11) + 10;
        int d = random.nextInt(11) + 10;

        long sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("Tổng của các giải thừa: " + sum);
    }

    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
