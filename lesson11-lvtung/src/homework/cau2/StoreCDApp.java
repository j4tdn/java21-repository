package homework.cau2;

import static java.util.Comparator.comparing;
import static utils.HomeworkUtils.bd;
import static utils.HomeworkUtils.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import bean.StoreCD;

public class StoreCDApp {

	public static void main(String[] args) {
		var storeCDs = new ArrayList<StoreCD>();

		storeCDs.add(new StoreCD(1, "Nhạc Pop", "Sơn Tùng M-TP", 10, bd(150000)));
		storeCDs.add(new StoreCD(2, "Nhạc Rap", "Đen Vâu", 8, bd(120000)));

		generate("0. Data", storeCDs);

		// yêu cầu 1
		StoreCD newCD = new StoreCD(3, "Nhạc Rock", "Linkin Park", 6, bd(200000));
		addCD(storeCDs, newCD);
		generate("1. Data after add", storeCDs);

		// yêu cầu 2
		generate("2. Number of CDs listed: " + storeCDs.size(), storeCDs);

		// yêu cầu 3
		System.out.println("3. Total price list CD: " + totalPrice(storeCDs));

		// yêu cầu 4
		Collections.sort(storeCDs, comparing(StoreCD::getPrice).reversed());
		generate("\n4. Sorted by price[DESC]", storeCDs);

		// yêu cầu 5
		Collections.sort(storeCDs, comparing(StoreCD::getId));
		generate("5. Sorted by id[ASC]", storeCDs);
	}

	// Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã
	// CD.
	private static boolean addCD(ArrayList<StoreCD> storeCDs, StoreCD storeCD) {
		boolean success = true;

		for (StoreCD existingCD : storeCDs) {
			if (existingCD.getId().equals(storeCD.getId())) {
				System.err.println("Mã CD bị trùng, không thể thêm CD mới.");
				return !success;
			}
		}
		System.out.println("Thêm CD thành công!");
		storeCDs.add(storeCD);

		return success;
	}

	// Tình tổng giá thành của các CD.
	private static BigDecimal totalPrice(ArrayList<StoreCD> storeCDs) {
		BigDecimal total = BigDecimal.ZERO;

		for (StoreCD cd : storeCDs) {
			total = total.add(cd.getPrice());
		}
		return total;
	}

}
