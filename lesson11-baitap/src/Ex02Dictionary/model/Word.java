package Ex02Dictionary.model;

public class Word {
	private String meaning;
	private String wordType;
	private String note;

	public Word() {

	}

	public Word(String meaning, String wordType, String note) {
		super();
		this.meaning = meaning;
		this.wordType = wordType;
		this.note = note;
	}

	public String getMeaning() {
		return meaning;
	}

	public String getWordType() {
		return wordType;
	}

	public String getNote() {
		return note;
	}

}
