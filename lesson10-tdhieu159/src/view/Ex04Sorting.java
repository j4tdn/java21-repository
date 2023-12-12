package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04Sorting {
    public static void main(String[] args) {
        String[] strings = {"-2", "-6", "-10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
        Arrays.sort(strings, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        // Speical
                        if("Special".equals(o1)){
                            return -1;
                        }
                        if("Special".equals(o2)){
                            return 1;
                        }
                        if(o1 != null){
                            if(o2 != null){
                                if(!isString(o1) && isString(o2)){
                                    return -1;
                                }
                                return o1.compareTo(o2);
                            }
                            return -1;
                        }
                        return 1;
                    }
                }

        );
        System.out.println(Arrays.toString(strings));
    }

    public static boolean isString(String s){
        return s.matches("[a-zA-Z]+");
    }
}