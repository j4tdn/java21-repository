package view.Ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ex05 {
	public static void main(String[] args) {
		String filename = "student.txt";
		
		List<Student> students = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                Double score = Double.parseDouble(parts[2].trim());
                String gender = parts[3];      
                
                Student student = new Student(id, name, score, gender);
                students.add(student);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
	
}
