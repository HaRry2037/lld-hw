package Structural.docratorstruc.decorator;

public class AlooTikkiBurger implements Burger{
    @Override
    public String getDescription() {
        return "Allo Tikki Burger ";
    }

    @Override
    public Double getCost() {
        return 40.0;
    }


}
