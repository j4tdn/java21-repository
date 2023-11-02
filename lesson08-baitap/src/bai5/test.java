package bai5;

import org.apache.commons.lang.StringUtils; 

public class test {
    public static String timChuoiChung(String chuoi1, String chuoi2) {
        return StringUtils.getCommonPrefix(chuoi1, chuoi2);
    }

    public static void main(String[] args) {
        String chuoi1 = "abcdef";
        String chuoi2 = "bcde";
        String chuoiChung = timChuoiChung(chuoi1, chuoi2);
        System.out.println("Chuỗi chung: " + chuoiChung); 
    }
}