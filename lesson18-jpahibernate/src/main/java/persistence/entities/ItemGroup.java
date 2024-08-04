package persistence.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Không bắt buộc phải tạo Entity Class mapping với Database Table 100%
 * 
 * Database Table <==> Entity Class
 * Không bắt buộc 100% các column trong Table ra Class
 * 
 * Chỉ khi nào yêu cầu có truy vâbs từ table cần trả về entity thì mình mới mapping
 * 
 */

@Entity
@Table(name = "t02_item_group")
public class ItemGroup {

	@Id
	@Column(name = "C02_ITEM_GROUP_ID", nullable = false)
	private Integer id;
	
	@Column(name = "C02_ITEM_GROUP_NAME", nullable = false)
	private String name;
	
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
