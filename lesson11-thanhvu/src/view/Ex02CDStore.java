package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import bean.CD;

public class Ex02CDStore {
	private Set<CD> cdList;

	public Ex02CDStore() {
		cdList = new LinkedHashSet<>();
	}

	public void addCD(CD cd) {
		if (!cdList.contains(cd)) {
			cdList.add(cd);
			System.out.println("CD added to the list.");
		} else {
			System.out.println("CD with the given ID already exists. Cannot add to the list.");
		}
	}

	public int getNumberOfCDs() {
		return cdList.size();
	}

	public BigDecimal getTotalCost() {
		BigDecimal totalCost = BigDecimal.ZERO;
		for (CD cd : cdList) {
			totalCost = totalCost.add(cd.getPrice());
		}
		return totalCost;
	}

	public void sortDescendingByPrice() {
		List<CD> sortedList = new ArrayList<>(cdList);
		Collections.sort(sortedList, Comparator.comparing(CD::getPrice).reversed());
		cdList = new LinkedHashSet<>(sortedList);
	}

	public void sortAscendingById() {
		List<CD> sortedList = new ArrayList<>(cdList);
		Collections.sort(sortedList, Comparator.comparingInt(CD::getId));
		cdList = new LinkedHashSet<>(sortedList);
	}

	public void displayCDList() {
		for (CD cd : cdList) {
			System.out.println(cd);
		}
	}

	public static void main(String[] args) {
		Ex02CDStore cd = new Ex02CDStore();

		cd.mockData();

		System.out.println("Number of CDs in the list: " + cd.getNumberOfCDs());

		System.out.println("Total cost of CDs: " + cd.getTotalCost());

		cd.sortDescendingByPrice();
		System.out.println("List after sorting in descending order by price:");
		cd.displayCDList();

		cd.sortAscendingById();
		System.out.println("List after sorting in ascending order by CD ID:");
		cd.displayCDList();
	}

	public void mockData() {
		cdList.add(new CD(1, "Pop", "Singer A", 10, new BigDecimal("20.5")));
		cdList.add(new CD(2, "Rock", "Singer B", 12, new BigDecimal("25.2")));
		cdList.add(new CD(3, "Jazz", "Singer C", 8, new BigDecimal("18.7")));
	}
}
