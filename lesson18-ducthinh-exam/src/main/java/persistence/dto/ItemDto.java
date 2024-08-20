package persistence.dto;

import java.time.LocalDate;

public class ItemDto {
	public static final String ITEM_ID = "id";
	public static final String ITEM_NAME = "name";
	public static final String CREATED_TIME = "createdTime";
	
	private Integer id;
	private String name;
	private LocalDate createdTime;
	
	public ItemDto() {
	}

	public ItemDto(Integer id, String name, LocalDate createdTime) {
		super();
		this.id = id;
		this.name = name;
		this.createdTime = createdTime;
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

	public LocalDate getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDate createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", createdTime=" + createdTime + "]";
	}
	
	
}
