package persistence;

import java.util.Objects;

public class ItemGroup {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	
	private Integer id;
	private String name;
	
	public ItemGroup() {
		
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup) obj;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	
}
