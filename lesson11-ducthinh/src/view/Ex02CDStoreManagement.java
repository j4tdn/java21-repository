package view;

import static utils.CollectionUtils.bd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator. *;
import java.util.Set;

import bean.CD;
import datamodel.MockData;
import static utils.CollectionUtils. *;

public class Ex02CDStoreManagement {
	public static void main(String[] args) {
		Set<CD> listCD = MockData.mockCDs();
		
		listCD.add(new CD(222, "Loại 5", "Ca sĩ F", 4, bd(60.3d)));
		listCD.add(new CD(222, "Loại 6", "Ca sĩ H", 4, bd(66.3d)));
		generate("1. List CD after add new CD", listCD);
		// count CD quatities
		System.out.println("2. CD quantities in list --> " + countCDs(listCD));
		// sum of price
		System.out.println("3. Sum of Prices in list --> " + sumPrice(listCD));
		// sort descending by price
		List<CD> listCDs = new ArrayList<>(listCD);
		Collections.sort(listCDs, comparing(CD::getPrice).reversed());;
		generate("4. List was sorted descending by price", listCDs);
		
		Collections.sort(listCDs, comparing(CD :: getId));
		generate("5. List was sorted descending by id", listCDs);
	}
	
	public static <E> int countCDs(Set<E> elements) {
		int count = 0;
		for(E element : elements) {
			count++;
		}
		return count;
	}
	
	public static double sumPrice(Set<CD> cds) {
		BigDecimal sum = new BigDecimal(0);
		for(CD cd : cds) {
			sum = sum.add(cd.getPrice());
		}
		return sum.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
