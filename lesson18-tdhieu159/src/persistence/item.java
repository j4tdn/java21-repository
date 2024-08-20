package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_detail")
public class item_detail {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_ID")
	private item item;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIZE_ID")
	private size size;
	
	@Column(name = "AMOUNT")
	private Integer amount;
	
	@Column(name = "BUY_PRICE")
	private Double buyPrice;
	
	@Column(name = "SELL_PRICE")
	private Double sellPrice;
	
	public item_detail() {
	}

	public item_detail(Integer id, item item, size size, Integer amount, Double buyPrice, Double sellPrice) {
		this.id = id;
		this.item = item;
		this.size = size;
		this.amount = amount;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public item getItem() {
		return item;
	}

	public void setItem(item item) {
		this.item = item;
	}

	public size getSize() {
		return size;
	}

	public void setSize(size size) {
		this.size = size;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", item=" + item + ", size=" + size + ", amount=" + amount + ", buyPrice="
				+ buyPrice + ", sellPrice=" + sellPrice + "]";
	}
}