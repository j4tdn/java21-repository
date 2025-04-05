package part2;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class ExtractAndSortNumbers {
	
	public static void main(String[] args) {
        try {
            List<Integer> numbersList = Files.lines(Paths.get("E:\\JAVA21\\4. Database Connection\\lesson23-thanhvu\\java21-thanhvu-java\\java21-thanhvu-java\\input.txt"))
                    .skip(1) 
                    .flatMap(ExtractAndSortNumbers::extractNumbers)
                    .sorted()
                    .toList();

            Files.write(Paths.get("E:\\JAVA21\\4. Database Connection\\lesson23-thanhvu\\java21-thanhvu-java\\java21-thanhvu-java\\output.txt"), 
                         numbersList.stream()
                                    .map(String::valueOf) 
                                    .collect(Collectors.toList())); 
            
            System.out.println("Result saved to output.txt successfully !");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Stream<Integer> extractNumbers(String line) {
        return Arrays.stream(line.split("\\D+"))
                     .filter(s -> !s.isEmpty())
                     .map(Integer::parseInt);
    }
}

