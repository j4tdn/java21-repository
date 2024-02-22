package lap1;

public class Fibonacci {
    public static void printFibonacciSequence(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
