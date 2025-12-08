package Structural.docratorstruc.decoration;

import Structural.docratorstruc.decorator.Burger;

public class PattyDecorator  extends  BurgerDecorator{

    public PattyDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return " Extra Petty " + this.burger.getDescription();
    }

    @Override
    public Double getCost() {
        return 5.0+ this.burger.getCost();
    }
}
