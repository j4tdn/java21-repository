package bean;

import java.util.Objects;

public class Card {
	private String typeCard;
	private String level;
	
	public Card() {
	}

	public Card(String typeCard, String level) {
		this.typeCard = typeCard;
		this.level = level;
	}

	public String getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Card)) {
			return false;
		}
		Card that = (Card)o;
		return getTypeCard().equals(that.getTypeCard());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getTypeCard());
	}

	@Override
	public String toString() {
		return "Card [typeCard=" + typeCard + ", level=" + level + "]";
	}
}
