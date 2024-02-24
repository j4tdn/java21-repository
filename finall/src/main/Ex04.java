package main;

import bean.Contestant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04 extends JFrame {
    private List<Contestant> contestants;
    private JTextArea resultArea;

    public Ex04() {
        super("Đặng Hữu Thanh");

        contestants = new ArrayList<>();
        resultArea = new JTextArea(10, 30);

        JButton voteButton = new JButton("Chấm điểm");
        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteContestants();
            }
        });

        JButton determineWinnerButton = new JButton("Xác định người chiến thắng");
        determineWinnerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                determineWinner();
            }
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        loadContestantsFromFile("miss.txt"); 
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(voteButton);
        buttonPanel.add(determineWinnerButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadContestantsFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            int numContestants = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numContestants; i++) {
                String line = reader.readLine();
                String[] tokens = line.split(" ");

                Contestant contestant = new Contestant("Thí sinh " + (i + 1));

                for (String token : tokens) {
                    int points = Integer.parseInt(token);
                    contestant.addVotes(points);
                }

                contestants.add(contestant);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void voteContestants() {
        for (Contestant contestant : contestants) {
            int points = (int) (Math.random() * 3) + 1;
            contestant.addVotes(points);
        }

        updateResult();
    }

    private void determineWinner() {
        Collections.sort(contestants, (c1, c2) -> Integer.compare(c2.getVotes(), c1.getVotes()));

        StringBuilder result = new StringBuilder("Kết quả:\n");
        for (Contestant contestant : contestants) {
            result.append(contestant).append("\n");
        }

        resultArea.setText(result.toString());

        Contestant winner = contestants.get(0);
        int maxVotes = winner.getVotes();

        for (int i = 1; i < contestants.size(); i++) {
            if (contestants.get(i).getVotes() < maxVotes) {
                break;  
            }

            winner = contestants.get(i);
        }

        resultArea.append("\nNgười chiến thắng: " + winner.getName());
    }

    private void updateResult() {
        StringBuilder result = new StringBuilder("Hiện tại:\n");
        for (Contestant contestant : contestants) {
            result.append(contestant).append("\n");
        }
        resultArea.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex04::new);
    }
}
