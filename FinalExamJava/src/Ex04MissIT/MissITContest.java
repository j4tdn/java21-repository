/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04MissIT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author PC
 */
public class MissITContest {

    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ tệp "missIt.txt"            
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\JAVA21_OOP\\FinalExamJava\\src\\Ex04MissIT\\missIt.txt"));
            int N = Integer.parseInt(bufferedReader.readLine());
            ArrayList<int[]> judgesChoices = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                String[] parts = bufferedReader.readLine().split(" ");
                int Choices = Integer.parseInt(parts[0]);
                int[] choices = new int[Choices];
                for (int j = 0; j < Choices; j++) {
                    choices[j] = Integer.parseInt(parts[j + 1]);
                }
                judgesChoices.add(choices);
            }

            bufferedReader.close();

           
            int[] points = score(N, judgesChoices);
            ArrayList<Integer> winners = findWinners(points);

            writeWinnersToFile(winners, "C:\\JAVA21_OOP\\FinalExamJava\\src\\Ex04MissIT\\result.txt");

        } catch (IOException e) {
            System.err.println("Lỗi khi đọc hoặc ghi tệp: " + e.getMessage());
        }
    }

    private static int[] score(int N, ArrayList<int[]> chooser) {
        int[] points = new int[1000001];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < chooser.get(i).length; j++) {
                int candidate = chooser.get(i)[j];
                points[candidate] += 3 - j;
            }
        }

        System.out.println("Points array: " + Arrays.toString(points));
        return points;
    }

    private static ArrayList<Integer> findWinners(int[] points) {
        int maxPoints = 0;
        ArrayList<Integer> winners = new ArrayList<>();
        for (int i = 1; i < points.length; i++) {
            if (points[i] > maxPoints) {
                maxPoints = points[i];
                winners.clear();
                winners.add(i);
            } else if (points[i] == maxPoints) {
                winners.add(i);
            }
        }

        System.out.println("Winners: " + winners);
        return winners;
    }

    private static void writeWinnersToFile(ArrayList<Integer> winners, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("The Winner is : ");
            for (int winner : winners) {
                fileWriter.write(winner + " ");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
