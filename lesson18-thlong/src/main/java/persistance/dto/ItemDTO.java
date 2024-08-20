package persistance.dto;

import java.time.LocalTime;

public class ItemDTO {
	
	private  Integer itemId;
	private String itemName;
	private String color;
	private String material;
	private String image01;
	private String image02;
	private LocalTime timeUpdated;
	private Integer itemGroupId;
	private Integer providerId;
	private String itemGroupName;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getImage01() {
		return image01;
	}
	public void setImage01(String image01) {
		this.image01 = image01;
	}
	public String getImage02() {
		return image02;
	}
	public void setImage02(String image02) {
		this.image02 = image02;
	}
	public LocalTime getTimeUpdated() {
		return timeUpdated;
	}
	public void setTimeUpdated(LocalTime timeUpdated) {
		this.timeUpdated = timeUpdated;
	}
	public Integer getItemGroupId() {
		return itemGroupId;
	}
	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}
	public Integer getProviderId() {
		return providerId;
	}
	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}
	public String getItemGroupName() {
		return itemGroupName;
	}
	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}
	@Override
	public String toString() {
		return "ItemDTO [itemId=" + itemId + ", itemName=" + itemName + ", color=" + color + ", material=" + material
				+ ", image01=" + image01 + ", image02=" + image02 + ", timeUpdated=" + timeUpdated + ", itemGroupId="
				+ itemGroupId + ", providerId=" + providerId + ", itemGroupName=" + itemGroupName + "]";
	}
	
	
}
