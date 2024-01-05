package Excersises.bean;

import java.util.Objects;

public class Word {
    private String word, mean, type, note;
    
    public Word() {
	}

	public Word(String word, String mean, String type, String note) {
		this.word = word;
		this.mean = mean;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
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
		return "Word [word=" + word + ", mean=" + mean + ", type=" + type + ", note=" + note + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Word))
			return false;
		Word that = (Word)o;
		return getWord().equals(that.getWord());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getWord());
	}
    
    

}
