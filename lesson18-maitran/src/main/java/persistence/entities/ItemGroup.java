package persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T02_ITEM_GROUP")
public class ItemGroup {

    @Id
    @Column(name = "C02_ITEM_GROUP_ID")
    private Integer id;

    @Column(name = "C02_ITEM_GROUP_NAME")
    private String name;

    @OneToMany(mappedBy = "itemGroup", fetch = FetchType.LAZY)
    private List<Item> items;

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemGroup itemGroup = (ItemGroup) o;
        return id.equals(itemGroup.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // toString
    @Override
    public String toString() {
        return "ItemGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
