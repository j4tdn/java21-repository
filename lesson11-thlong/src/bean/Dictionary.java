package bean;

import java.util.Objects;

public class Dictionary {
	private String word;
	private String explain;
	private String type;
	private String note;
	
	public Dictionary() {
		// TODO Auto-generated constructor stub
	}

	public Dictionary(String word, String explain, String type, String note) {
		super();
		this.word = word;
		this.explain = explain;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", explain=" + explain + ", type=" + type + ", note=" + note + "]";
	}
	@Override
	public boolean equals(Object o) {
		
		if (this == o) {
			return true;
		}
		if (o instanceof Dictionary) {
			return false;
		}
		Dictionary that = (Dictionary)o;
		return this.getWord().equals(that.getWord());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getType());
	}
}
