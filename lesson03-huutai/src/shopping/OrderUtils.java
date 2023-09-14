package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils() {
	}
	
	public static double export(Order order) {
		double totalMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail itemDetail : ids) {
			Item item = itemDetail.getItem();
			int quantity = itemDetail.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalMoney += idCost;
		}
		return totalMoney;
	}
}
