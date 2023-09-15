package lesson03_OOP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer khachHang;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;

	public Order() {

	}

	public Order(Customer khachHang, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		super();
		this.khachHang = khachHang;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
	}

	public Customer getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(Customer khachHang) {
		this.khachHang = khachHang;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [khachHang=" + khachHang + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDate="
				+ orderDate + "]";
	}

	public double export() {
		double tongTien = 0;
		ItemDetail[] ids = getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getId();
			int soLuong = id.getSoLuong();
			tongTien += item.getGia() * soLuong;
		}
		return tongTien;
	}
}
