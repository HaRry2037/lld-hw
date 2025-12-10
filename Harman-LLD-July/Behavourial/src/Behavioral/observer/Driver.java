package Behavioral.observer;

public class Driver {
    public static void main(String[] args){
        Scoreboard scoreboard= new Scoreboard();
        Observer scoreObserver = new ScoreObserver();
        Observer wickertObserver= new WicketObserver();
        Observer overObserver= new OverObserver();

        scoreboard.addObserver(scoreObserver);
        scoreboard.addObserver(wickertObserver);
        scoreboard.addObserver(overObserver);

        scoreboard.notifyObserver(new BowlingEvent(1,0,true));
        scoreboard.display();

        scoreboard.notifyObserver(new BowlingEvent(6,0,true));
        scoreboard.display();

        scoreboard.notifyObserver(new BowlingEvent(0,1,true));
        scoreboard.display();
    }

}
