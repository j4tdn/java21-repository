package view.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	
	public static void main(String[] args) {
		try {
			findFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void findFile() throws FileNotFoundException {
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}
}
