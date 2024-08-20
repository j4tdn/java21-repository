package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {

	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT = "amount";

	private Integer id;
	private String name;
	private Integer amount;

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}