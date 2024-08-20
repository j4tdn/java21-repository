package persistence.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t04_payment_method")
public class PaymentMethod {
	
	@Id
	@Column(name = "C04_PMETHOD_ID")
	private Integer id;
	
	@Column(name = "C04_PMETHOD_DESC")
	private String desc;
	
	public PaymentMethod() {
	}

	public PaymentMethod(Integer id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof PaymentMethod)) {
			return false;
		}

		PaymentMethod that = (PaymentMethod) o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "PaymentMethod [id=" + id + ", desc=" + desc + "]";
	}
	
	
}
