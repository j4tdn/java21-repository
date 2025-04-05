package lesson23;
import java.io.*;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ExtractNumberFromString {
	
	public static void main(String[] args) throws IOException {
		List<BigInteger> numbers = Files.lines(Paths.get("input.txt"))
	            .skip(1)
	            .flatMap(s -> Stream.of(s.split("\\D+")))
	            .filter(str -> !str.isEmpty())
	            .map(BigInteger::new)
	            .sorted()
	            .collect(Collectors.toList());
	        
	        Files.write(Paths.get("output.txt"),
	            numbers.stream()
	                .map(BigInteger::toString)
	                .collect(Collectors.toList()));
	}
	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//        int n = Integer.parseInt(br.readLine());
//        List<BigInteger> numbers = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine();
//            processString(s, numbers);
//        }
//        br.close();
//
//        Collections.sort(numbers);
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
//        for (BigInteger num : numbers) {
//            bw.write(num.toString());
//            bw.newLine();
//        }
//        bw.close();
//	}
	
//	private static void processString(String s, List<BigInteger> numbers) {
//        StringBuilder currentDigits = new StringBuilder();
//        for (char c : s.toCharArray()) {
//            if (Character.isDigit(c)) {
//                currentDigits.append(c);
//            } else {
//                addNumber(currentDigits, numbers);
//                currentDigits.setLength(0);
//            }
//        }
//        addNumber(currentDigits, numbers);
//    }
//
//    private static void addNumber(StringBuilder currentDigits, List<BigInteger> numbers) {
//        if (currentDigits.length() > 0) {
//            String numStr = currentDigits.toString();
//            numbers.add(new BigInteger(numStr));
//            currentDigits.setLength(0);
//        }
//    }

}
