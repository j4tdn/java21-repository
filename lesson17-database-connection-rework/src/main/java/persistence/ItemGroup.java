package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ItemGroup {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	
	private Integer id;
	private String name;
	private List<Item> items = new ArrayList<Item>();
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ItemGroup(Integer id, String name, List<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.items = items;
	}
	
	public ItemGroup of() {
		return new ItemGroup();
	}

	public Integer getId() {
		return id;
	}

	public ItemGroup withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ItemGroup withName(String name) {
		this.name = name;
		return this;
	}

	public List<Item> getItems() {
		return items;
	}

	public ItemGroup withItems(List<Item> items) {
		this.items = items;
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ItemGroup))
			return false;
		
		ItemGroup that = (ItemGroup) o;
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", items=" + items + "]";
	}
	
	
}
