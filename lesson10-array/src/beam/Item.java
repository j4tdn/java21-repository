package beam;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Item implements Comparable<Item>{

	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer storeId;
	private LocalDateTime createAt;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, BigDecimal price, Integer storeId, LocalDateTime createAt) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.storeId = storeId;
		this.createAt = createAt;
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

	public void setPrive(BigDecimal prive) {
		this.price = prive;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", storeId=" + storeId + ", createAt="
				+ createAt + "]\n";
	}

	@Override
	public int compareTo(Item o) {
		// khi gọi hàm Arays.sort(Item[] items)
		// lúc compile --> hàm compareTo từ Comparable
		// lúc runtime --> gọi hàm compareTo từ Item
		Item i1= this;
		Item i2= o;
		
		// tang dan theo price
		return i1.getPrice().compareTo(i2.getPrice());
	}
	
	
	
}
