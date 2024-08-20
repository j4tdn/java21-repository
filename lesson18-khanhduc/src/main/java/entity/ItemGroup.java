package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "t02_item_group")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ItemGroup {
	
	@Id
	@Column(name = "C02_ITEM_GROUP_ID", nullable = false)
	Integer id;
	
	@Column(name = "C02_ITEM_GROUP_NAME", nullable = false)
	String name;
	
	@OneToMany(mappedBy = "group")
	@ToString.Exclude
	List<Item> items;

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}