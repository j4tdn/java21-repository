package persistence.entities;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "T01_ITEM")
public class Item {

    @Id
    @Column(name = "C01_ITEM_ID")
    private Integer id;

    @Column(name = "C01_ITEM_NAME")
    private String name;
    
	@Column(name = "C01_BUY_PRICE")
	private BigDecimal buyPrice;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C01_ITEM_GROUP_ID", referencedColumnName = "C02_ITEM_GROUP_ID")
    private ItemGroup itemGroup;

    // Getters and Setters
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

    public void setBuyPrice(String buyPrice) {
        this.name = buyPrice;
    }

    public ItemGroup getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(ItemGroup itemGroup) {
        this.itemGroup = itemGroup;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // toString
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                 ", buyPrice='" + buyPrice + '\'' +
                ", itemGroup=" + itemGroup +
                '}';
    }
}
