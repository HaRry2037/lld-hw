package Behavioral.observer;

public class BowlingEvent {
    private int scores;
    private int wickets;

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public BowlingEvent(int scores, int wickets, boolean isValidbowl) {
        this.scores = scores;
        this.wickets = wickets;
        this.isValidbowl = isValidbowl;
    }

    public boolean isValidbowl() {
        return isValidbowl;
    }

    public void setValidBowling(boolean validBowling) {
        isValidbowl = validBowling;
    }

    private  boolean isValidbowl;

}
