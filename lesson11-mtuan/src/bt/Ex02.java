package bt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.*;

public class Ex02 {
	public static void main(String[] args) {
		List<CD> cds = mockCd();
		
		addNewCd(cds, new CD("K99", "US/UK", "Donal Trump", 5, 100f));
		showNumberOfCdsInList(cds);
		showTotalPriceOfCds(cds);
		reverseSortCdsByPrice(cds);
		sortCdsByType(cds);
		
	}
	
	private static void show(List<CD> cds) {
		cds.forEach(cd -> System.out.println(cd));
	}
	private static void sortCdsByType(List<CD> cds) {
		System.out.println("Sắp xếp theo kiểu CD");
		cds.sort(comparing(CD::getTypeOfCD));
		show(cds);
	}

	private static void reverseSortCdsByPrice(List<CD> cds) {
		System.out.println("Sắp xếp theo giá giảm dần");
		cds.sort(comparing(CD::getPrice).reversed());
		show(cds);
	}

	private static void showTotalPriceOfCds(List<CD> cds) {
		int totalPrice = 0;
		for (CD cd : cds) {
			totalPrice += cd.getPrice();
		}
		
		System.out.println("Tổng giá thành của các CD: " + totalPrice);
	}

	private static void showNumberOfCdsInList(List<CD> cds) {
		System.out.println("Số lượng CD trong danh sách: " + cds.size());
	}

	private static void addNewCd(List<CD> cds, CD newCd) {
		if(!isContain(cds, newCd)) {
			cds.add(newCd);
		}
		show(cds);
	}

	private static boolean isContain(List<CD> cds, CD newCd) {
		for (CD cd : cds) {
			if(cd.getIdOfCD().equals(newCd.getIdOfCD())) {
				return true;
			}
		}
		
		return false;
	}

	private static List<CD> mockCd() {
		List<CD> temp = new ArrayList<>();
		
		temp.add(new CD("B11", "Remix", "Châu Khải Phong", 12, 6.0f));
		temp.add(new CD("A09", "Nhạc Đỏ", "Tuấn Hưng", 15, 10.0f));
		temp.add(new CD("E43", "Nhạc vàng", "Ngọc Sơn", 12, 6.5f));
		temp.add(new CD("G65", "Nhạc trẻ", "Noo Phước Thịnh", 14, 6.0f));
		temp.add(new CD("N80", "Nhạc trẻ", "Quân AP", 15, 10.0f));
		temp.add(new CD("P14", "Nhạc đỏ", "Trọng Tấn", 20, 5.5f));
		
		return temp;
	}
}