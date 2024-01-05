package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class StoreCD {
	private Integer id;
	private String type;
	private String singer;
	private Integer numberOfSongs;
	private BigDecimal price;
	
	public StoreCD() {
	}

	public StoreCD(Integer id, String type, String singer, Integer numberOfSongs, BigDecimal price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberOfSongs = numberOfSongs;
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

	public Integer getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(Integer numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof StoreCD)) {
			return false;
		}
		StoreCD that = (StoreCD) o;
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "StoreCD [id=" + id + ", type=" + type + ", singer=" + singer + ", numberOfSongs=" + numberOfSongs
				+ ", price=" + price + "]";
	}
	
}
