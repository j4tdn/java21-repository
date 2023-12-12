package bean;

import java.math.BigDecimal;

public class Item {
	private Integer id;
	private char name;
	private BigDecimal salesPrices;
	private Integer storeId;
	
	public Item () {
	}

	public Item(Integer id, char name, BigDecimal salesPrices, Integer storeId) {
		this.id = id;
		this.name = name;
		this.salesPrices = salesPrices;
		this.storeId = storeId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	public BigDecimal getSalesPrices() {
		return salesPrices;
	}

	public void setSalesPrices(BigDecimal salesPrices) {
		this.salesPrices = salesPrices;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrices=" + salesPrices + ", storeId=" + storeId + "]";
	}
	
	
	
}
