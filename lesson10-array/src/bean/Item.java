package bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Item {
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer storeId;
	private LocalDateTime createdAt;
	
	public Item() {
		
	}
	
	public Item(Integer id, String name, BigDecimal price, Integer storeId, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.storeId = storeId;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", storeId=" + storeId + ", createdAt="
				+ createdAt + "]\n";
	}

	@Override
	public int compareTo(Item o) {
		// Khi gọi hàm Arrays.sort(Item[] items)
		// Lúc compile ---> gọi hàm compareTo từ Comparable
		// Lúc runtime ---> gọi hàm compareTo từ Item
		Item i1 = this;  // this là phần tử bên trái, hay phần tử trước
		Item i2 = o;     // o là phần tử bên phải, hay phânf tử đứng sau
		return i1.getPrice().compareTo(i2.getPrice());
	}
}
