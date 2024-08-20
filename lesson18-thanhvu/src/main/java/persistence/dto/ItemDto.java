package persistence.dto;

import java.time.LocalTime;

public class ItemDto {
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_CREATED_AT = "created_time";

	private Integer id;
	private String name;
	private LocalTime created_time;

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

	public LocalTime getCreated_at() {
		return created_time;
	}

	public void setCreated_at(LocalTime created_at) {
		this.created_time = created_at;
	}

	public ItemDto(Integer id, String name, LocalTime created_time) {

		this.id = id;
		this.name = name;
		this.created_time = created_time;
	}

	public ItemDto() {
	}

	@Override
	public String toString() {
		return "ItemByDateDto [id=" + id + ", name=" + name + ", created_time=" + created_time + "]";
	}

}
