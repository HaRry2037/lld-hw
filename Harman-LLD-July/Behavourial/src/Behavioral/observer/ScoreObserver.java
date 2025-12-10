package Behavioral.observer;

public class ScoreObserver implements Observer {
    private  Integer scores;
    public ScoreObserver(){
        this.scores=0;
    }

    @Override
    public void update(BowlingEvent bowlingEvent) {
        scores += bowlingEvent.getScores();
    }
    @Override
    public void display(){
        System.out.println("current score is "+ this.scores);
    }
}
