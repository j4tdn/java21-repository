package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import bean.CD;

public class Ex02CDManagement {

    private Set<CD> cdList; // Change to Set for uniqueness

    public Ex02CDManagement() {
        cdList = new LinkedHashSet<>(); // Initialize as LinkedHashSet for uniqueness
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
        return cdList.size(); // Use instance variable cdList
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
        Ex02CDManagement cdManagement = new Ex02CDManagement();

        // Initialize sample data
        cdManagement.mockData();

        // Display the number of CDs in the list
        System.out.println("Number of CDs in the list: " + cdManagement.getNumberOfCDs());

        // Display the total cost of CDs in the list
        System.out.println("Total cost of CDs: " + cdManagement.getTotalCost());

        // Sort the list in descending order by price and display
        cdManagement.sortDescendingByPrice();
        System.out.println("List after sorting in descending order by price:");
        cdManagement.displayCDList();

        // Sort the list in ascending order by CD ID and display
        cdManagement.sortAscendingById();
        System.out.println("List after sorting in ascending order by CD ID:");
        cdManagement.displayCDList();
    }

    // Method mockData to initialize sample data
    public void mockData() {
        cdList.add(new CD(1, "Pop", "Singer A", 10, new BigDecimal("20.5")));
        cdList.add(new CD(2, "Rock", "Singer B", 12, new BigDecimal("25.2")));
        cdList.add(new CD(3, "Jazz", "Singer C", 8, new BigDecimal("18.7")));
    }
}