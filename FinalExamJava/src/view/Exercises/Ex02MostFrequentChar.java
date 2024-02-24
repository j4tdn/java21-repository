/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Exercises;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class Ex02MostFrequentChar {

    public static void main(String[] args) {
        String input1 = "aaaababbbddc";
        String input2 = "aaaaccdcec";

        System.out.println("Output 1: " + findMostFrequentChar(input1));
        System.out.println("Output 2: " + findMostFrequentChar(input2));
    }

    public static String findMostFrequentChar(String input) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Đếm số lần xuất hiện của từng ký tự
        for (char ch : input.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        int maxCount = 0;
        StringBuilder result = new StringBuilder();

        // Tìm số lần xuất hiện nhiều nhất
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                result = new StringBuilder(entry.getKey().toString());
            } else if (count == maxCount) {
                result.append(", ").append(entry.getKey());
            }
        }

        return result.toString();
    }
}

