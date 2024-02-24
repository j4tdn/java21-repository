package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Item {

	private Integer id;
	private String name;
	private BigDecimal salePrice;
	private List<Store> stores; // mặt hàng được bán trong danh sách cửa hàng
	
	public Item() {
	}

	public Item(Integer id, String name, BigDecimal salePrice, List<Store> stores) {
		super();
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
		this.stores = stores;
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

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;
		}
		Item that = (Item) obj;
		return getId().equals(that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salePrice=" + salePrice + ", stores=" + stores + "]";
	}
	
	
	
	
	
}
