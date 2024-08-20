package persistence.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "t02_item_group")

@NamedQueries(
	@NamedQuery(
		name = ItemGroup.GET_ALL_ITEM_GROUP,
		query = "FROM ItemGroup"
	)
)
public class ItemGroup {
	
	/** Defined Query Name*/
	public static final String GET_ALL_ITEM_GROUP = "GET_ALL_ITEM_GROUP";
	
	@Id
	@Column(name = "C02_ITEM_GROUP_ID", nullable = false)
	private Integer id;
	
	@Column(name = "C02_ITEM_GROUP_NAME", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "group")
	private List<Item> items;
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup)) {
			return false;
		}

		ItemGroup that = (ItemGroup) o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	
}