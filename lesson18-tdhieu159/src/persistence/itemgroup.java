package persistence;

import java.util.List;

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
@Table(name = "item_group")

// @NamedNativeQueries // Native Query
public class itemgroup {
	
	public static final String GET_ALL_ITEM_GROUPS = "GET_ALL_ITEM_GROUPS";
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	// Sử dụng @OneToMany tại bảng 1(cha)
	// Yêu cầu: Bảng n(con) có mapping @ManyToOne với bảng 1(cha)
	// Sau đó sử dụng thuộc tính mappedBy = "Tên của thuộc tính bên @ManyToOne"
	
	// mặc định: fetchType = lazy
	
	@OneToMany(mappedBy = "itemGroup")
	private List<item> items;
	
	public itemgroup() {
	}

	public itemgroup(Integer id, String name) {
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
	
	public List<item> getItems() {
		return items;
	}
	
	public void setItems(List<item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}