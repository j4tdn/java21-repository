package persistence;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class item_detail {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "MATERIAL")
	private String meterial;
	
	@Column(name = "IMAGE_01")
	private String image1;
	
	@Column(name = "IMAGE_02")
	private String image2;
	
	@Column(name = "LAST_UPDATED_AT")
	private LocalDateTime lastUpdatedAt;
	@Column(name = "PROVIDER_ID")
	private Integer providerId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private itemgroup itemgroup;
	

	public item_detail() {
	}

	public item(Integer id, String name, String color, String meterial, String image1, String image2,
			LocalDateTime lastUpdatedAt, itemgroup itemgroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.meterial = meterial;
		this.image1 = image1;
		this.image2 = image2;
		this.lastUpdatedAt = lastUpdatedAt;
		this.itemgroup = itemgroup;
	}
	
	public static item_detail of() {
		return new item_detail();
	}

	public Integer getId() {
		return id;
	}

	public item_detail withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public item_detail withName(String name) {
		this.name = name;
		return this;
	}

	public String getColor() {
		return color;
	}

	public item_detail withColor(String color) {
		this.color = color;
		return this;
	}

	public String getMeterial() {
		return meterial;
	}

	public item_detail withMeterial(String meterial) {
		this.meterial = meterial;
		return this;
	}

	public String getImage1() {
		return image1;
	}

	public item_detail withImage1(String image1) {
		this.image1 = image1;
		return this;
	}

	public String getImage2() {
		return image2;
	}

	public item_detail withImage2(String image2) {
		this.image2 = image2;
		return this;
	}

	public LocalDateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public item_detail withLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
		return this;
	}

	public itemgroup getitemgroup() {
		return itemgroup;
	}

	public item_detail withitemgroup(itemgroup itemgroup) {
		this.itemgroup = itemgroup;
		return this;
	}
	
	
	public Integer getProviderId() {
		return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	@Override
	public String toString() {
		return "item [id=" + id + ", name=" + name + ", color=" + color + ", meterial=" + meterial + ", image1="
				+ image1 + ", image2=" + image2 + ", lastUpdatedAt=" + lastUpdatedAt + ", providerId=" + providerId
				+ ", itemgroup=" + itemgroup + "]";
	}

	
	
}