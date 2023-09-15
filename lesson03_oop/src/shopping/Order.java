package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	// Order: customer, item_details[], datetime
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime dateTime;
	
	public Order() {
		
	}


	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime dateTime) {
		this.customer = customer;
		this.itemDetail = itemDetail;
		this.dateTime = dateTime;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", dateTime=" + dateTime
				+ "]";
	}


	public double export() {
		double totalOfMoney = 0;
		ItemDetail[] ids = getItemDetail();
		//for index
//		for(int i = 0;i < ids.length; i++) {
//			ItemDetail id = ids[i];
//		}
		//for each
		for(ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).equals(getDateTime().toLocalDate())) {
				idCost = idCost * 0.9;
			}
			totalOfMoney += idCost;
		}
		
		return totalOfMoney;
		
	}
	
}
