package entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t01_item")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
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
	private ItemGroup group;
	
	@OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    private List<ItemDetail> itemDetails;
	
	@OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
	private Set<Order> orders;

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", buyPrice=" + buyPrice + ", group=" + group + "OrderItem= ";
	}
}