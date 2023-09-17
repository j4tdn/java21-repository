package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetails[] itemDetails;
	private LocalDateTime orderDate;
	
	public Order() {
	}
	
	public Order(Customer customer, ItemDetails[] itemDetails, LocalDateTime orDateTime) {
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDate = orDateTime;	
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetails[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetails[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOderDate() {
		return orderDate;
	}

	public void setOderDate(LocalDateTime oderDate) {
		this.orderDate = oderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", oderDate="
				+ orderDate + "]";
	}

	
	
}
