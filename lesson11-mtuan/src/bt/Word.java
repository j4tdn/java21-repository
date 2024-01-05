package bt;

public class Word {
	public enum Type{
		ADJ,
		ADV,
		V,
		N,
	};
	private String word;
	private String meaningOfWord;
	private Type type;
	private String note;
	
	public Word(String word, String meaningOfWord, Type type, String note) {
		this.word = word;
		this.meaningOfWord = meaningOfWord;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaningOfWord() {
		return meaningOfWord;
	}

	public void setMeaningOfWord(String meaningOfWord) {
		this.meaningOfWord = meaningOfWord;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String toString() {
		return "Từ: " + word + ", nghĩa: " + meaningOfWord + ", loại từ: " + type + " (ghi chú: " + note + ")";
	}
	
	public boolean compareTo(Object o) {
		if(this.equals(o)) {
			return true;
		}
		
		if(!(o instanceof Word)) {
			return false;
		}
		
		Word newWord = (Word) o;
		return this.word.compareToIgnoreCase(newWord.word) > 0;
	}
}