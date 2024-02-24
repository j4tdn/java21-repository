package bean;

import java.util.Objects;

public class Word {
    private String word;
    private String meaning;
    private String wordType;
    private String note;
    
    public Word() {
	}

	public Word(String word, String meaning, String wordType, String note) {
		this.word = word;
		this.meaning = meaning;
		this.wordType = wordType;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getWordType() {
		return wordType;
	}

	public void setWordType(String wordType) {
		this.wordType = wordType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Word)) {
			return false;
		}
		Word that = (Word)o;
		return getWord().equals(that.getWord());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getWord());
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", meaning=" + meaning + ", wordType=" + wordType + ", note=" + note + "]";
	}
    
}
