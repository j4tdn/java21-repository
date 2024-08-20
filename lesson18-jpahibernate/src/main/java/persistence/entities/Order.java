package persistence.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t03_order")
public class Order {

	@Id
	@Column(name = "C03_ORDER_ID")
	private Integer id;

	@Column(name = "C03_ORDER_TIME")
	private LocalDateTime time;

	@Column(name = "C03_DELIVERY_FEE")
	private BigDecimal deliveryFee;

	@Column(name = "C03_DELIVERY_ADDRESS")
	private String address;

	@Column(name = "C03_RECEIVER_PHONE")
	private String phone;

	@Column(name = "C03_TOTAL_OF_MONEY")
	private BigDecimal totalOfMoney;

	public Order() {
	}

	public Order(Integer id, LocalDateTime time, BigDecimal deliveryFee, String address, String phone,
			BigDecimal totalOfMoney) {
		this.id = id;
		this.time = time;
		this.deliveryFee = deliveryFee;
		this.address = address;
		this.phone = phone;
		this.totalOfMoney = totalOfMoney;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public BigDecimal getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(BigDecimal deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getTotalOfMoney() {
		return totalOfMoney;
	}

	public void setTotalOfMoney(BigDecimal totalOfMoney) {
		this.totalOfMoney = totalOfMoney;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Order)) {
			return false;
		}

		Order that = (Order) o;
		return getId().equals(that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", time=" + time + ", deliveryFee=" + deliveryFee + ", address=" + address
				+ ", phone=" + phone + ", totalOfMoney=" + totalOfMoney + "]";
	}
}