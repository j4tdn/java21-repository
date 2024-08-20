package dto;

import java.time.LocalDate;

public class OrderItemDto {

	public static final String PROP_ITEM_ID = "id";
	public static final String PROP_ITEM_NAME = "name";
	public static final String PROP_ORDER_TIME = "date";
	
	private Integer id;
	private String name;
	private LocalDate date;
	
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "OrderItemDto [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
}
