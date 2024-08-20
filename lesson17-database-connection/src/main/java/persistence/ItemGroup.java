package persistence;

import java.util.Objects;

public class ItemGroup {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	
	private int id;
	private String name;
	
	public ItemGroup() {
	}

	public ItemGroup(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroup [id= " + id + ", name= " + name + "]";
	}
}
