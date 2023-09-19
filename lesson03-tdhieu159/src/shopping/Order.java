package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemdetail;
	private LocalDateTime orderDate;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemdetail, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemdetail = itemdetail;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemdetail() {
		return itemdetail;
	}

	public void setItemdetail(ItemDetail[] itemdetail) {
		this.itemdetail = itemdetail;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemdetail=" + Arrays.toString(itemdetail) + ", orderDate="
				+ orderDate + "]";
	}
	
	
}
