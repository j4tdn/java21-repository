package file.text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02FileReader {

	public static void main(String[] args) {
		
		File f = new File("data/input.txt");
		
		if(!f.exists()) {
			System.out.println(">>> File '" + f.getName() + "' is not existed yet!!");
			System.exit(0);
		}
		
		try {			
			List<String> lines = Files.readAllLines(f.toPath());
			int size = lines.size();
			if(size !=0) {
				lines.remove(0);
			}
		List<String> number=lines.stream()
				.map(e -> e.split("[a-z]+"))
				.flatMap(aos -> Arrays.stream(aos))
				.filter(e -> !e.isEmpty())
				  .map(Integer::parseInt)
				  .sorted()
				  .map(String::valueOf)
				  .toList();
		
		File target = FileUtils.createNewFile("data/output.txt");
		Files.write(target.toPath(), number);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
		
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
