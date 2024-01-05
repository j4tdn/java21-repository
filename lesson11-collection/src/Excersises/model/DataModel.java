package Excersises.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Excersises.bean.CD;
import Excersises.bean.Word;

public class DataModel {

	private DataModel() {
	}
	
	public static List<CD> mockCD() {
		List<CD> cds = new ArrayList<CD>();
		
		cds.add(new CD(1, "Country", "Taylor Swift", 50, bd("100")));
		cds.add(new CD(2, "Jazz", "Miles Davis", 30, bd("50")));
		cds.add(new CD(3, "Pop", "Michael Jackson", 100, bd("200")));
		cds.add(new CD(4, "Rock", "Rolling Stones(band)", 70, bd("70")));
		cds.add(new CD(5, "R&D", "James Brown", 90, bd("90")));
		
		return cds;
	}
	
	public static List<Word> mockWord() {
		return new ArrayList<Word>(
				Arrays.asList(
						new Word("I", "Toi", "noun", "I like you"),
						new Word("I", "Toi", "noun", "He like you"),
						new Word("He", "Anh", "noun", "He like you"),
						new Word("She", "Cô", "noun", "She like you"),
						new Word("They", "Họ", "noun", "They like you")
						));
	}
	
	public static Map<String, Integer> mockDailySpending() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("coffee", 30000);
		map.put("eat", 80000);
		map.put("study", 10000);
		map.put("saving", 20000);
		return map;
	}
	
	public static BigDecimal bd(String value) {
	return new BigDecimal(value);
	}
}
