package beam;

import java.math.BigDecimal;

public class Item {

	int barCode;
	String nameItem;
	BigDecimal price;
	int storeId;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Item(int barCode, String nameItem, BigDecimal price, int storeId) {
		this.barCode = barCode;
		this.nameItem = nameItem;
		this.price = price;
		this.storeId = storeId;
	}



	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [barCode=" + barCode + ", nameItem=" + nameItem + ", price=" + price + ", storeId=" + storeId
				+ "]\n";
	}
	
	
}
