package persistence.entities;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t01_item")
public class Item {
	@Id
	@Column(name = "C01_ITEM_ID")
	private Integer id;
	
	@Column(name = "C01_ITEM_NAME")
	private String name;
	
	@Column(name = "C01_BUY_PRICE")
	private BigDecimal buyPrice;
	
	// MQH
	// getchType LAZY | EAGER
	// @ManyToOne: mặc định EAGER
	// @OneToMany: mặc định LAZY
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C01_ITEM_GROUP_ID", referencedColumnName = "C02_ITEM_GROUP_ID")
	private ItemGroup group;
	/*
	 * Required constructor for JPA
	 */
	public Item() {
	}

	public Item(Integer id, String name, BigDecimal buyPrice) {
		super();
		this.id = id;
		this.name = name;
		this.buyPrice = buyPrice;
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

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}
	
	public ItemGroup getGroup() {
		return group;
	}
	
	public void setGroup(ItemGroup group) {
		this.group = group;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item)) {
			return false;
		}

		Item that = (Item) o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", buyPrice=" + buyPrice + "]";
	}
	
	
}
