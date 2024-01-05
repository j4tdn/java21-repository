package view;

import static utils.CollectionUtils.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import bean.CD;
import model.DataModel;

public class Ex02ManageCD {
	private static List<CD> listCD = DataModel.mockCDs();

	public static void main(String[] args) {

		CD cd1 = new CD(8, "R&B", "Robert Aliz", bd(100));
		addCds(cd1);
		generate("List", listCD);

		generate("\n2. Size: ", Arrays.asList(listCD.size()));

		generate("\n3. Total: ", totalPrice());

		sortDescByPrice();
		generate("\n4. Sorted Desc By Price ", listCD);
		sortAscById();
		generate("\n5. Sorted Asc By Id ", listCD);

	}

	private static void addCds(CD cdAdded) {
		for (CD cd : listCD) {
			if (cd.getId() == cdAdded.getId()) {
				System.out.println("The CD id already exists");
				return;
			}
		}
		listCD.add(cdAdded);
	}

	private static BigDecimal totalPrice() {
		BigDecimal total = BigDecimal.ZERO;
		for (CD cd : listCD) {
			total = total.add(cd.getPrice());
		}
		return total;
	}

	private static BigDecimal bd(int value) {
		return new BigDecimal(value);
	}

	private static void sortDescByPrice() {
		listCD.sort(Comparator.comparing(CD::getPrice).reversed());
	}

	private static void sortAscById() {
		listCD.sort(Comparator.comparing(CD::getId));
	}
}
