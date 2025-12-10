package Behavioral.observer;

public class WicketObserver implements Observer{
    private  Integer Wickets;
    public WicketObserver(){
        this.Wickets=0;
    }

    @Override
    public void update(BowlingEvent bowlingEvent) {
        Wickets += bowlingEvent.getWickets();
    }
    @Override
    public void display(){
        System.out.println("current Wicket is "+ this.Wickets);
    }



}
