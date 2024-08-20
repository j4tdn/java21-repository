package model;

import javax.persistence.*;

@Entity
@Table(name = "t02_item_group")
public class ItemGroup {

    @Id
    @Column(name = "C02_ITEM_GROUP_ID")
    private Long id;

    @Column(name = "C02_ITEM_GROUP_NAME")
    private String name;

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
}
