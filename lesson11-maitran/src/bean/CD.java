package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class CD {
	private Integer id;
	private String type;
	private String singer;
	private BigDecimal price;

	public CD() {
	}

	public CD(Integer id, String type, String singer, BigDecimal price) {
		super();
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "id: " + id + "\ttype: " + type + "\tsinger: " + singer + "\tprice: " + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof CD)) {
			return false;
		}

		CD that = (CD) o;
		return getId().equals(that.getId());
	}

}
