package persistence.entities;

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

@Entity
@Table(name = "t14_order_detail")
public class OrderDetail {
	
	@EmbeddedId
	private Id id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C14_ORDER_ID", referencedColumnName = "C03_ORDER_ID", insertable = false, updatable = false)
	private Order order;
	
	@Column(name = "C14_AMOUNT")
	private Integer amount;
	
	public OrderDetail() {
	}
	
	public OrderDetail(Id id, Integer amount) {
		this.id = id;
		this.amount = amount;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
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

		if (!(o instanceof OrderDetail)) {
			return false;
		}

		OrderDetail that = (OrderDetail) o;
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", amount=" + amount + "]";
	}

	@Embeddable
	public static class Id implements Serializable {

		@Column(name = "C14_ORDER_ID", insertable = false, updatable = false)
		private Integer orderId;

		@Column(name = "C14_ITEM_DETAIL_ID", insertable = false, updatable = false)
		private Integer itemDetailId;

		public Id() {
		}

		public Id(Integer orderId, Integer itemDetailId) {
			this.orderId = orderId;
			this.itemDetailId = itemDetailId;
		}

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

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}

			if (!(o instanceof Id)) {
				return false;
			}

			Id that = (Id) o;
			return getOrderId() == that.getOrderId() 
			    && getItemDetailId() == that.getItemDetailId();
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(getOrderId(), getItemDetailId());
		}

		@Override
		public String toString() {
			return "Id [orderId=" + orderId + ", itemDetailId=" + itemDetailId + "]";
		}
	}

}
