package ex01shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {

	private Customer customer;
	private ItemDetail[] itemDitails;
	private LocalDateTime datetime;
	public Order(Customer customer, ItemDetail[] itemDitails, LocalDateTime datetime) {
		super();
		this.customer = customer;
		this.itemDitails = itemDitails;
		this.datetime = datetime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ItemDetail[] getItemDitails() {
		return itemDitails;
	}
	public void setItemDitails(ItemDetail[] itemDitails) {
		this.itemDitails = itemDitails;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDitails=" + Arrays.toString(itemDitails) + ", datetime="
				+ datetime + "]";
	}
	
	
}
