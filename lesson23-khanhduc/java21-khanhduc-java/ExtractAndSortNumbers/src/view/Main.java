package view;

import utils.FileUtils;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        readFile("src/data/input.txt");
    }

    private static void readFile(String filename) {
        File file = new File(filename);

        if(!file.exists()) {
            System.out.println(">>> File '" + file.getName() + "' is not existed yet !!");
        }

        try {
            List<String> elements = Files.readAllLines(file.toPath());
            if(!elements.isEmpty()) {
                List<String> numbers = elements.stream()
                        .flatMap(line -> Stream.of(line.split("[a-zA-Z]+")))
                        .filter(number -> !number.isEmpty())
                        .map(Integer::parseInt)
                        .sorted()
                        .map(String::valueOf)
                        .toList();

                File target = FileUtils.createNewFile("src/data/output.txt");
                Files.write(target.toPath(), numbers);

                Desktop.getDesktop().open(target);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
