package com.tiendat;

import java.io.IOException;
import java.util.List;

// Thời gian qua e không chú trọng technical nhiều nên hơi yếu tay bên phần JavaCore
// Nhưng công ty dồn bọn e học ngoại ngữ xong mới bù lại skill technical nên e gắng cải thiện lại ạ..

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        FileHandler fileHandler = new FileHandler();
        DataProcessor dataProcessor = new DataProcessor();

        try {
            List<String> inputLines = fileHandler.readFile(inputFile);
            List<Integer> result = dataProcessor.processData(inputLines);
            fileHandler.writeFile(outputFile, result);
            System.out.println("Đã xử lý và ghi kết quả vào " + outputFile);
        } catch (IOException e) {
            System.err.println("Lỗi đọc/ghi file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Lỗi định dạng số trong file input: " + e.getMessage());
        }
    }
}