package bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Item implements Comparable<Item> {
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer storedId;
	private LocalDateTime createdAt;
	
	public Item() {
		
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
	public Integer getStoredId() {
		return storedId;
	}
	public void setStoredId(Integer storedId) {
		this.storedId = storedId;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public Item(Integer id, String name, BigDecimal price, Integer storedId, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.storedId = storedId;
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", storedId=" + storedId + ", createdAt="
				+ createdAt + "]";
	}
	



	@Override
	public int compareTo(Item o) {
		Item i1 =  this;
		Item i2 = o;
		return i1.getPrice().compareTo(i2.getPrice());
	}
}
