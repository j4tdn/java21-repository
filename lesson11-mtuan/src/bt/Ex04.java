package bt;

import bt.Word.Type;

public class Ex04 {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.createNew();
		
		add("Euro", new Word("World Cup", "giải bóng đá Euro", Type.N, "là giải bóng đá lớn nhất TG, tổ chức 4 năm 1 lần"), dictionary);
		get("Vietnamese", dictionary);
	}

	private static void get(String key, Dictionary dictionary) {
		dictionary.lookup(key);
	}

	private static void add(String key, Word value, Dictionary dictionary) {
		dictionary.add(key, value);
	}
}