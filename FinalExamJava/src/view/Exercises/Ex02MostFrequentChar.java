/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Exercises;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class Ex02MostFrequentChar {

    public static void main(String[] args) {
        String[] array = {"a", "a", "a", "b", "c", "d", "b"};

        var countMap = Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long maxCount = countMap.values().stream().max((a, b) -> Long.compare(a, b)).orElse(null);

        var result = countMap.entrySet().stream().filter(t -> t.getValue() == maxCount).map(t -> t.getKey())
                .collect(Collectors.joining(", "));

        System.out.println("Phần tử xuất hiện nhiều nhất là: " + result);
    }
}
