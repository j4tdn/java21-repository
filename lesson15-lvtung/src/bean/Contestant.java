package bean;

public class Contestant {
	private Integer id;
	private Integer totalPoints;

	public Contestant() {
	}

	public Contestant(Integer id, Integer totalPoints) {
		this.id = id;
		this.totalPoints = totalPoints;
	}
	
	public Contestant(int id) {
        this.id = id;
        this.totalPoints = 0;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}

	@Override
	public String toString() {
		return "Contestant [id=" + id + ", totalPoints=" + totalPoints + "]";
	}
	
	public void addPoints(int points) {
        this.totalPoints += points;
    }
}
