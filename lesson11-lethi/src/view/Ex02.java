package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import bean.CD;
import model.DataModel;

public class Ex02 {

	public static void main(String[] args) {

		var cdList = mockCDs();

		addCD(cdList, new CD(6, "Hip hop", "Singer8", 4, 33.53d));
		addCD(cdList, new CD(5, "Pop", "Singer7", 9, 23.33d));

		System.out.println("1. Danh sách sau khi thêm CD mới(nếu không trùng ID):");
		for (CD cd : cdList) {
			System.out.println(cd.toString());
		}
		
		System.out.println("\n=========================================");

		System.out.println("2. Số lượng CD có trong danh sách: " + cdList.size());

		System.out.println("3. Tổng giá thành: " + calcPrice(cdList));
		
		System.out.println("\n=========================================");
		
		System.out.println("4. Sắp xếp danh sách giảm dần theo giá thành: ");
		sort(cdList, Comparator.comparingDouble(CD::getPrice).reversed());
        for (CD cd : cdList) {
            System.out.println(cd.toString());
        }
        
        System.out.println("\n=========================================");

        System.out.println("5. Sắp xếp danh sách tăng dần theo Id: ");
        sort(cdList, Comparator.comparingInt(CD::getId));
        for (CD cd : cdList) {
            System.out.println(cd.toString());
        }

	}

	private static void addCD(Set<CD> cdList, CD cd) {
		boolean added = cdList.add(cd);
		if (added) {
			System.out.println("Đã thêm thành công!");
		} else {
			System.out.println("Mã CD đã tồn tại. Không thể thêm vào!");
		}
	}

	private static double calcPrice(Set<CD> cdList) {
		double cost = 0;
		for (CD cd : cdList) {
			cost += cd.getPrice();
		}
		return cost;
	}

	private static void sort(Set<CD> cdList, Comparator<CD> comparator) {
        List<CD> sortedList = new ArrayList<>(cdList);
        sortedList.sort(comparator);
        cdList.clear();
        cdList.addAll(sortedList);
    }

	private static Set<CD> mockCDs() {
		var cdList = new LinkedHashSet<CD>();
		cdList.add(new CD(1, "Rock", "Singer1", 12, 15.99d));
		cdList.add(new CD(2, "Jazz", "Singer2", 5, 10d));
		cdList.add(new CD(3, "Rap", "Singer3", 8, 13.33d));
		cdList.add(new CD(4, "Bolero", "Singer4", 10, 12d));
		cdList.add(new CD(5, "Classical", "Singer5", 15, 14.56d));
		return cdList;
	}

}
