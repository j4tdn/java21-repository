package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.CD;
import bean.Dictionary;

public class DataModel {

	public static List<CD> mockCDs() {

		List<CD> cds = new ArrayList<>();

		cds.add(new CD(4, "C", "Đan Trường", 30, bd("500000")));
		cds.add(new CD(1, "A", "Lam Trường", 10, bd("100000")));
		cds.add(new CD(2, "B", "Dương Thùy Linh", 12, bd("200000")));
		cds.add(new CD(5, "D", "Lâm Chấn Huy", 18, bd("800000")));
		cds.add(new CD(3, "A", "Trọng Lân", 20, bd("300000")));

		return cds;

	}

	public static List<Dictionary> mockWords() {

		List<Dictionary> words = new ArrayList<>();

		words.add(new Dictionary("triangle", "hình tam giác ", " N", null));
		words.add(new Dictionary("rectangular", "hình chữ nhật", " N", null));
		words.add(new Dictionary("circle", "hình tròn ", " N", null));
		words.add(new Dictionary("square", "hình tròn ", " N", null));

		return words;

	}

	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	
	public static Map<String, BigDecimal> mockSpending() {
		var spending = new HashMap<String, BigDecimal>();
		
		spending.put("Mua gạo", bd("250000"));
		spending.put("Mua áo", bd("350000"));
		spending.put("Mua bàn", bd("700000"));
		spending.put("Tiền điện", bd("1000000"));
		
		return spending;
		
	}

}
