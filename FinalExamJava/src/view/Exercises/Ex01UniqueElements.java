/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Exercises;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class Ex01UniqueElements {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6};

        var uniqueElements = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toArray(Integer[]::new);

        System.out.println("Các Phần Tử Chỉ Xuất Hiện 1 Lần Là: " + Arrays.toString(uniqueElements));

        Map<Integer, Long> elementCount = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Các Phần Tử Xuất Hiện Nhiều Hơn Một Lần Là:");
        elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
