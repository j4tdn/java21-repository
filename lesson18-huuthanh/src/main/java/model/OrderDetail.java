package model;

import javax.persistence.*;

@Entity
@Table(name = "t14_order_detail")
public class OrderDetail {

    @Id
    @Column(name = "C14_ORDER_ID")
    private Long orderId;

    @Column(name = "C14_ITEM_DETAIL_ID")
    private Long itemDetailId;

    @Column(name = "C14_AMOUNT")
    private Integer amount;

    // Getters và Setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getItemDetailId() {
        return itemDetailId;
    }

    public void setItemDetailId(Long itemDetailId) {
        this.itemDetailId = itemDetailId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
