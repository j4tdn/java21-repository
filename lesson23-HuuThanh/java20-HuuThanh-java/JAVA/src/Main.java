import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            int n = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                extractNumbers(line, numbers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(numbers);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            for (int number : numbers) {
                bw.write(String.valueOf(number));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void extractNumbers(String line, List<Integer> numbers) {
        StringBuilder n = new StringBuilder();
        for (char ch : line.toCharArray()) {
            if (Character.isDigit(ch)) {
                n.append(ch);
            } else {
                if (n.length() > 0) {
                    numbers.add(Integer.parseInt(n.toString()));
                    n.setLength(0);
                }
            }
        }
        if (n.length() > 0) {
            numbers.add(Integer.parseInt(n.toString()));
        }
    }
}
