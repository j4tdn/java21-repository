package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
    public static void main(String[] args) {
        String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};

        Arrays.sort(strings, new Coptring());

        System.out.println("Tăng dần: " + Arrays.toString(strings));

        Arrays.sort(strings, new Reverse());

        System.out.println("Giảm dần: " + Arrays.toString(strings));
    }

    static class Coptring implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1 == null && o2 == null) {
                return 0;
            } else if (o1 == null) {
                return 1;
            } else if (o2 == null) {
                return -1;
            }

            boolean special1 = o1.equals("special");
            boolean special2 = o2.equals("special");

            if (special1 && special2) {
                return 0;
            } else if (special1) {
                return -1;
            } else if (special2) {
                return 1;
            }

            boolean negative1 = o1.startsWith("-") && o1.length() > 1;
            boolean negative2 = o2.startsWith("-") && o2.length() > 1;

            if (negative1 && negative2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            } else if (negative1) {
                return -1;
            } else if (negative2) {
                return 1;
            }

            return o1.compareTo(o2);
        }
    }

    static class Reverse implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return new Coptring().compare(o2, o1);
        }
    }
}