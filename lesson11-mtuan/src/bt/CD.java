package bt;

public class CD {
	private String idOfCD;
	private String typeOfCD;
	private String singer;
	private int numberOfSongs;
	private float price;
	
	public CD(String idOfCD, String typeOfCD, String singer, int numberOfSongs, float price) {
		this.idOfCD = idOfCD;
		this.typeOfCD = typeOfCD;
		this.singer = singer;
		this.numberOfSongs = numberOfSongs;
		this.price = price;
	}

	public String getIdOfCD() {
		return idOfCD;
	}

	public void setIdOfCD(String idOfCD) {
		this.idOfCD = idOfCD;
	}

	public String getTypeOfCD() {
		return typeOfCD;
	}

	public void setTypeOfCD(String typeOfCD) {
		this.typeOfCD = typeOfCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString() {
		return "Mã CD: " + idOfCD + ", Loại CD: " + typeOfCD 
				+ ", Ca sỹ: " + singer + ", số bài hát: " + numberOfSongs 
				+ ", giá thành: " + price; 
	}
}