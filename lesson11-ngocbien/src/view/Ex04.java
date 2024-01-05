package view;

import static model.DataModel.mockWord;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bean.Word;
public class Ex04 {

	public static void main(String[] args) {
		List<Word> words = mockWord();
		
		boolean needAdd = addWord(words, new Word("We", "Chúng ta", "noun", "We need love"));
		
		if(needAdd) {
			System.out.println("add successful");
		}else {
			System.out.println("add failed");
		}
		
		for(Word word:words) {
			System.out.println(word);
		}
		
		Map<String, Word> wordMap = createWord(words);
		
		System.out.println("SearchWord -> " );
		searchWord("I", wordMap);
		
	}
	
	private static boolean addWord( List<Word> words, Word newWord) {
		if(words.contains(newWord)) {
			return false;
		}
		
		return words.add(newWord);
	}
	
	private static Map<String, Word> createWord(List<Word> words){
		Map<String, Word> wordMap = new LinkedHashMap<>();
		for(Word word: words) {
			wordMap.put(word.getWord(), word);
		}
		
		return wordMap;
	}

	private static void searchWord(String key, Map<String, Word> word) {
		if(word.get(key) == null) {
			System.out.println("This Word is not in dictionary");
		}else {
			System.out.println(word.get(key));
		}
		
	}
}
