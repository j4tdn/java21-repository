package model;

import javax.persistence.*;

@Entity
@Table(name = "t01_item")
public class Item {

    @Id
    @Column(name = "C01_ITEM_ID")
    private Long id;

    @Column(name = "C01_ITEM_NAME")
    private String name;

    @Column(name = "C01_BUY_PRICE")
    private Double price;

    @Column(name = "C01_ITEM_GROUP_ID")
    private Long groupId;

    // Getters và Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    // Override phương thức toString()
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", groupId=" + groupId +
                '}';
    }
}
