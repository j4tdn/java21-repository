package entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t03_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
	
	public static String PROP_ORDER_TIME = "orderTime";
	
	@Id
	@Column(name = "C03_ORDER_ID")
	private Integer id;
	
	@Column(name = "C03_ORDER_TIME")
	private LocalDateTime orderTime;
	
	@Column(name = "C03_DELIVERY_FEE")
	private BigDecimal deliveryFee;
	
	@Column(name = "C03_DELIVERY_ADDRESS")
	private String deliveryAddress;
	
	@Column(name = "C03_RECEIVER_PHONE")
	private String receiverPhone;
	
	@Column(name = "C03_TOTAL_OF_MONEY")
	private BigDecimal totalOfMoney;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C03_ITEM_ID", referencedColumnName = "C01_ITEM_ID")
	private Item item;
		
	public static String getPROP_ORDER_TIME() {
		return PROP_ORDER_TIME;
	}

	public static void setPROP_ORDER_TIME(String pROP_ORDER_TIME) {
		PROP_ORDER_TIME = pROP_ORDER_TIME;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
	
	public BigDecimal getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(BigDecimal deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public BigDecimal getTotalOfMoney() {
		return totalOfMoney;
	}

	public void setTotalOfMoney(BigDecimal totalOfMoney) {
		this.totalOfMoney = totalOfMoney;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderTime=" + orderTime + ", deliveryFee=" + deliveryFee + ", deliveryAddress="
				+ deliveryAddress + ", receiverPhone=" + receiverPhone + ", totalOfMoney=" + totalOfMoney + "]";
	}
	
}