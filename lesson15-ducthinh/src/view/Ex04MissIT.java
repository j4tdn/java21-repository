package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ex04MissIT {
    public static void main(String[] args) {
    	
        try {
            // Đọc dữ liệu từ tệp "input.txt"            
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\workspace\\java21\\2.JAVA\\lesson15-ducthinh\\src\\input.txt"));
            int N = Integer.parseInt(bufferedReader.readLine());
            ArrayList<int[]> judgesChoices = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                String[] parts = bufferedReader.readLine().split(" ");
                int numChoices = Integer.parseInt(parts[0]);
                int[] choices = new int[numChoices];
                for (int j = 0; j < numChoices; j++) {
                    choices[j] = Integer.parseInt(parts[j + 1]);
                }
                judgesChoices.add(choices);
            }

            bufferedReader.close();

            // find the winner
            int[] points = calculatePoints(N, judgesChoices);
            ArrayList<Integer> winners = findWinners(points);

            // write results to "output.txt"
            writeWinnersToFile(winners, "output.txt");

        } catch (IOException e) {
            System.err.println("Lỗi khi đọc hoặc ghi tệp: " + e.getMessage());
        }
    }
    	/*
    			2
				3 3 2 1
				3 2 3 1
				N = 2;
				judgesChoices ={[3,2,1], [2,3,1]}
    	 */
    private static int[] calculatePoints(int N, ArrayList<int[]> judgesChoices) {
        int[] points = new int[1000001];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < judgesChoices.get(i).length; j++) {
                int candidate = judgesChoices.get(i)[j];
                points[candidate] += 3 - j;
            }
        }
        return points;
    }

    private static ArrayList<Integer> findWinners(int[] points) {
        int maxPoints = -1;
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