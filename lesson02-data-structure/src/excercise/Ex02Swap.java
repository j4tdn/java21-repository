package excercise;


public class Ex02Swap {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 8;

        swapInt(x1, x2);

        System.out.println("x1 --› " + x1);
        System.out.println("x2 --> " + x2);

        System.out.println("\n==============================\n");

        CustomInteger xo1 = new CustomInteger(17);
        CustomInteger xo2 = new CustomInteger(91);

        swapCustomInteger(xo1, xo2);

        System.out.println("xo1 --› " + xo1.value);
        System.out.println("xo2 --> " + xo2.value);
    }

    private static void swapInt(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    private static void swapCustomInteger(CustomInteger a, CustomInteger b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}

