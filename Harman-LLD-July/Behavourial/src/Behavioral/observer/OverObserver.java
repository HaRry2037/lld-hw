package Behavioral.observer;

import java.util.concurrent.atomic.AtomicInteger;

public class OverObserver implements Observer{
    private final AtomicInteger bowls;
    ;
    public OverObserver(){
        this.bowls=new AtomicInteger();
    }

    @Override
    public void update(BowlingEvent bowlingEvent) {
        synchronized (this.bowls){
            if(bowlingEvent.isValidbowl())
            this.bowls.getAndIncrement();
        }
    }
    @Override
    public void display(){
        System.out.println("current over is "+ (this.bowls.get()/6) + " . " + (this.bowls.get()%6));
    }

}
