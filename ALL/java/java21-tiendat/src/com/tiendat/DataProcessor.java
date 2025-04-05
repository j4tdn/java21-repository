package com.tiendat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;

public class DataProcessor {

    public List<Integer> processData(List<String> inputLines) {
        if (inputLines == null || inputLines.isEmpty()) {
            return new ArrayList<>();
        }

        int n = Integer.parseInt(inputLines.get(0));
        List<String> xauKyTu = inputLines.subList(1, n + 1);
        Set<Integer> uniqueNumbers = new HashSet<>();
        Pattern pattern = Pattern.compile("\\d+"); // Tìm một hoặc nhiều chữ số liên tiếp

        for (String xau : xauKyTu) {
            Matcher matcher = pattern.matcher(xau);
            while (matcher.find()) {
                String numberStr = matcher.group();
                if (!numberStr.startsWith("0") || numberStr.equals("0")) { // Loại bỏ số 0 vô nghĩa ở đầu, giữ lại số 0 đơn lẻ
                    try {
                        uniqueNumbers.add(Integer.parseInt(numberStr));
                    } catch (NumberFormatException e) {
                        // Xảy ra nếu chuỗi số quá lớn để chuyển đổi thành Integer, bỏ qua
                    }
                }
            }
        }

        List<Integer> sortedUniqueNumbers = new ArrayList<>(uniqueNumbers);
        Collections.sort(sortedUniqueNumbers);
        return sortedUniqueNumbers;
    }
}
