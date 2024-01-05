package bt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import bt.Word.Type;

public class Dictionary {
	private Map<String, Word> dictionary = new HashMap<>();
	
	public void createNew() {
		dictionary.put("I", new Word("I", "Tôi", Type.N, "là 1 đại từ nhân xưng"));
		dictionary.put("go", new Word("go", "đi", Type.V, ""));
		dictionary.put("Vietnamese", new Word("Vietnamese", "Người Việt Nam", Type.N, "tui là người Việt Nam!"));
		dictionary.put("communism", new Word("communism", "Cộng Sản", Type.N, "là một chế độ chính trị"));
		dictionary.put("learn", new Word("learn", "học", Type.V, ""));
		dictionary.put("exactly", new Word("exactly", "1 cách chính xác", Type.ADV, ""));
		dictionary.put("beautiful", new Word("beautiful", "xinh đẹp", Type.ADJ, ""));
		dictionary.put("better", new Word("better", "tốt hơn", Type.ADJ, ""));
	};
	
	public void add(String key, Word value) {
		dictionary.put(key, value);
	}
	
	public void lookup(String word) {
		Set<String> keys = dictionary.keySet();
		
		for (String key : keys) {
			if(key.equalsIgnoreCase(word)) {
				System.out.println(dictionary.get(key));
				return;
			}
		}
		
		System.out.println("Không có dữ liệu của từ này");
	}
}