package persistance.dto;

import java.time.LocalTime;

public class ItemOrderDTO {
	
	public static final String PROP_ID = "id";
	public static final String PROP_ITEM_NAME = "itemName";
	public static final String PROP_TIME = "time";
	
	private Integer id;
	
	private String itemName;
	
	private LocalTime time;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "ItemOrderDTO [id=" + id + ", itemName=" + itemName + ", time=" + time + "]";
	}
	
	
}
