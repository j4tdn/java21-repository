package persistence;

import java.util.Objects;

public class PaymentMethod {
	
	public static final String PROP_ID = "id";
	public static final String PROP_DESCRIPTION = "description";
	
	private int id;
	private String description;
	
	public PaymentMethod() {
		// TODO Auto-generated constructor stub
	}

	public PaymentMethod(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PaymentMethod)) {
			return false;
		}
		
		PaymentMethod that = (PaymentMethod) obj;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "PaymentMethod [id=" + id + ", description=" + description + "]";
	}
	
	
}
