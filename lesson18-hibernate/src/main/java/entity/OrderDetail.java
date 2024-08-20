package entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t14_order_detail")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetail {

	@EmbeddedId
	private Id id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C14_ORDER_ID", referencedColumnName = "C03_ORDER_ID", insertable = false, updatable = false)
	private Order order;

	@Column(name = "C14_AMOUNT")
	private Integer amount;

	@Embeddable
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode
	private static class Id implements Serializable {
		@Column(name = "C14_ORDER_ID", insertable = false, updatable = false)
		private Integer orderId;
		@Column(name = "C14_ORDER_DETAIL_ID", insertable = false, updatable = false)
		private Integer itemDetailId;

		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

		public Integer getItemDetailId() {
			return itemDetailId;
		}

		public void setItemDetailId(Integer itemDetailId) {
			this.itemDetailId = itemDetailId;
		}

//		@Override
//		public boolean equals(Object o) {
//			if (this == o) {
//				return true;
//			}
//			if (!(o instanceof Id)) {
//				return false;
//			}
//
//			Id that = (Id) o;
//			return getOrderId() == that.getOrderId() && getItemDetailId() == that.getItemDetailId();
//		}
//
//		@Override
//		public int hashCode() {
//			return Objects.hash(getOrderId(), getItemDetailId());
//		}
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Id)) {
			return false;
		}

		OrderDetail that = (OrderDetail) o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", amount=" + amount + "]";
	}
}
