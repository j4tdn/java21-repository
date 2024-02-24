package bean;

public class Contestant {
    private String name;
    private int votes;

    public Contestant(String name) {
        this.name = name;
        this.votes = 0;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void addVotes(int points) {
        this.votes += points;
    }

    @Override
    public String toString() {
        return name + ": " + votes + " điểm";
    }
}
