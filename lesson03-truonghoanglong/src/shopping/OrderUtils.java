package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utilitt of Order Class
 * Normarlly: Utility is place where contains utility methods
 * No care created class's objects
 */
public class OrderUtils {
	
	// Cấm kh cho tạo đối tượng thêm thừa
	private OrderUtils () {
	}
	
	public static double export(Order order) {
		double totalOfmoney = 0;
		
		ItemDetails[] ids =  order.getItemDetails();	
		//for (int i = 0; i < ids.length; i++) {
		//	ItemDetails id = ids[i];
		//}
		// Write method export in Order class: không có parameter
		//for each
		for (ItemDetails id: ids) {
			Item item = id.getItem();
			//System.out.println(item);
			int quantity = id.getQuantity();
			//System.out.println("quantity" + quantity);
			double idCost = item.getCost() * quantity;
			
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfmoney += idCost;
		}			
		return totalOfmoney;
	}
}
