package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Item {
	private Integer id;
	private String name;
	private BigDecimal salesPrice;
	private List<Store> stores; // mặt hàng được bán trong cửa hàng
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, BigDecimal salesPrice, List<Store> stores) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
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

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", stores=" + stores + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Apple)) {
			return false;
		}
		Apple that = (Apple)o;
		return getId().equals(that.getId());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}
