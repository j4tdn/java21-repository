package persistence.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Không bắt buộc phải tạo Entity Class mapping với Database Table 100%
 * 
 * Database Table <==> Entity Class
 * Không bắt buộc mapping 100% các column trong Table ra Class
 * 
 * Chỉ khi nào yêu cầu có truy vấn từ table cần trả về entity thì mình mới mapping 
 *
 */

@Entity
@Table(name = "t02_item_group")
/*
@NamedNativeQueries(
	@NamedNativeQuery(
		name = ItemGroup.GET_ALL_ITEM_GROUP,
		query = "SELECT * FROM t02_item_group",
		resultClass = ItemGroup.class
	)
)
*/
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
	
	/**
	 * JPA/Hibernate required constructor
	 */
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
