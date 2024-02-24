package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class CD {

	private Integer idCD;
	private String typeCD;
	private String singer;
	private Integer numberSong;
	private BigDecimal price;
	
	public CD() {
		
	}

	public CD(Integer idCD, String typeCD, String singer, Integer numberSong, BigDecimal price) {
		super();
		this.idCD = idCD;
		this.typeCD = typeCD;
		this.singer = singer;
		this.numberSong = numberSong;
		this.price = price;
	}

	public Integer getIdCD() {
		return idCD;
	}

	public void setIdCD(Integer idCD) {
		this.idCD = idCD;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getNumberSong() {
		return numberSong;
	}

	public void setNumberSong(Integer numberSong) {
		this.numberSong = numberSong;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [idCD=" + idCD + ", typeCD=" + typeCD + ", singer=" + singer + ", numberSong=" + numberSong
				+ ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof CD)) {
			return false;
		}
		CD that = (CD)o;
		return getIdCD().equals(that.getIdCD());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getIdCD());
	}
}