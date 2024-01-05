package Excersises.view;

import static Excersises.model.DataModel.mockWord;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Excersises.bean.Word;
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
		
		System.out.println("SearWord -> \n" + searchWord("mui", wordMap));
		
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

	private static Word searchWord(String key, Map<String, Word> word) {
		return word.get(key);
	}
}

