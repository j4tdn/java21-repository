package bean;

import java.util.Objects;

public class Card {
	private String type;
	private String rank;

	public Card() {
	}

	public Card(String type, String rank) {
		super();
		this.type = type;
		this.rank = rank;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return rank + " " + type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Card)) {
			return false;
		}

		Card that = (Card) o;
		return type.equals(that.type) && rank.equals(that.rank);
	}
	
	  @Override
	    public int hashCode() {
	        return Objects.hash(getType()) + Objects.hash(getRank());
	    }
}