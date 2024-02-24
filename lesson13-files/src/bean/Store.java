package bean;

import java.util.Objects;

public class Store {
	
	private Integer id;
	private String name;
	public Store() {
	}
	public Store(Integer id, String name) {
		super();
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
	public String toString() {
		return "Store [id=" + id + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Store)) {
			return false;
		}
		Store that = (Store) obj;
		return getId().equals(that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	
}
