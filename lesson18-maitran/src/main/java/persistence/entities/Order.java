package persistence.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T03_ORDER")
public class Order {

    @Id
    @Column(name = "C03_ORDER_ID")
    private Integer id;

    @Column(name = "C03_ORDER_TIME")
    private Date orderTime;

    @Column(name = "C03_DELIVERY_FEE")
    private BigDecimal deliveryFee;

    @Column(name = "C03_DELIVERY_ADDRESS")
    private String deliveryAddress;

    @Column(name = "C03_RECEIVER_PHONE")
    private String receiverPhone;

    @Column(name = "C03_TOTAL_OF_MONEY")
    private BigDecimal totalOfMoney;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C03_CUSTOMER_ID", referencedColumnName = "C11_CUSTOMER_ID")
    private Customer customer;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
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


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // toString
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderTime=" + orderTime +
                ", deliveryFee=" + deliveryFee +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", totalOfMoney=" + totalOfMoney +
                ", customer=" + customer +
                '}';
    }
}
