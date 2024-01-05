package bt;

public class Card<T> {
	public enum Type{
		HEART,
		DIAMOND,
		CLUB,
		SPADE,
	}
	
	private Type type;
	private T symbol;
	
	public Card(Type type, T symbol) {
		super();
		this.type = type;
		this.symbol = symbol;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public T getSymbol() {
		return symbol;
	}

	public void setSymbol(T symbol) {
		this.symbol = symbol;
	}
	
	
	public String toString() {
		return "lá " + symbol + " " + type;
	}
}