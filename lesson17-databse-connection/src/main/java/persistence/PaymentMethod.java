package persistence;

import java.util.Objects;

public class PaymentMethod {
	
	public static final String PROD_ID = "id";
	public static final String PROD_DESCRIPTION = "description";
	
	private Integer id;
	
	private String description;
	
	public PaymentMethod() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PaymentMethod [id=" + id + ", description=" + description + "]";
	}

	public PaymentMethod(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if (!(o instanceof PaymentMethod)) {
			return false;
		}
		PaymentMethod that = (PaymentMethod)o;
		return getId().equals(that.getId());
	}

}
