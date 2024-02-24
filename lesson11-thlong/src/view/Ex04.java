package view;
import static model.DataModel.mockWords;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Dictionary;
import static utils.CollectionUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		List<Dictionary> words = mockWords();
		
		addCd(words, new Dictionary("rhombus", "hình thoi ", " N", null));
		generate("1. ", words);
		
		System.out.println("Tra từ điển");
		findWord(words, "rhombus");
	}
	public static void addCd(List<Dictionary> dic, Dictionary word) {
		dic.add(word);
	}
	public static void findWord(List<Dictionary> dic, String word ) {
		List<Dictionary> results = new ArrayList<>();
		Iterator<Dictionary> iterator = dic.iterator();
		while(iterator.hasNext()) {
			Dictionary dictionary = iterator.next();
			if (word.equals(dictionary.getWord())) {
				System.out.println(dictionary.toString());
			}
		}
	}
}
