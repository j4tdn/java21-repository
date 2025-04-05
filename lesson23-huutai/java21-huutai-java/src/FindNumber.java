import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumber {
	
	public static void main(String[] args) {
		
		File file = new File("data/input.txt");
		try {
			List<String> elements = Files.readAllLines(file.toPath());
			if (elements.size() != 0) {
				elements.remove(0);
			}
			
			List<String> numbers = elements.stream()
				.map(e -> e.split("[a-z]+"))
				.flatMap(aof -> Arrays.stream(aof)) 
				.filter(e -> !e.isEmpty())
				.map(Integer::parseInt)
				.sorted()
				.map(String::valueOf)
				.collect(Collectors.toList());
			
			File target = createNewFile("data/output.txt");
			Files.write(target.toPath(), numbers);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static File createNewFile(String path) {
		File file = new File(path);
		
		if (file.exists()) {
			System.out.println(">>> File '" + path + "' is existed");
		} else {
			createNewDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File '" + path + "' is created successful ? " + isSuccess);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	
	public static File createNewDir(String path) {
		File root = new File(path);
		if (!root.exists()) {
			root.mkdirs();
		}
		return root;
	}
}