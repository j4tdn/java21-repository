package ex01shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils() {
	}
	public static double export(Order order) {
		double totalOfMoeny = 0;
			ItemDetail[] ids = order.getItemDitails();
			 // Duyệt từng phần tử;
			for (ItemDetail id:ids) {
				Item item = id.getItem();
				int quantity = id.getQuantity();
				double idCost = item.getCost();
				
				if(item.getCost()>590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getDatetime().toLocalDate())) {
					idCost*=0.9;
				} 
				totalOfMoeny += idCost;
		
			}
		
		return totalOfMoeny;
	}

}
