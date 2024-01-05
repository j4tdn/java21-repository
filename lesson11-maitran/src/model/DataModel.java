package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import bean.CD;

public class DataModel {
	private DataModel() {
		
	}
    public static List<CD> mockCDs() {
        return new ArrayList<>(
            List.of(
                new CD(1, "Pop", "Jason Michale", bd(100)),
                new CD(2, "Rock", "Allizabet", bd(250)),
                new CD(3, "Jazz", "Alex Billy", bd(300)),
                new CD(4, "Rhythm", "Romeo Juliet", bd(150)),
                new CD(5, "Reggae", "Alan Walked", bd(1000)),
                new CD(6, "Country", "John Smith", bd(890))
            )
        );
    }
    
    public static Map<String,BigDecimal> mockData() {
    	var data = new TreeMap<String, BigDecimal>();
    	data.put("Eat", bd(200));
    	data.put("Water", bd(100));
    	data.put("Electric", bd(150));
    	data.put("Shopping", bd(600));
    	data.put("Tax", bd(800));
    	data.put("Other", bd(200));
    	return data;
    }
    
	private static BigDecimal bd(int value) {
		return new BigDecimal(value);
	}
	
}
