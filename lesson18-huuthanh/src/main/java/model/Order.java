package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t03_order")
public class Order {

    @Id
    @Column(name = "C03_ORDER_ID")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "C03_ORDER_TIME")
    private Date orderTime;

    // Getters và Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}
