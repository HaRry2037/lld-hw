package Structural.docratorstruc.decoration;

import Structural.docratorstruc.decorator.Burger;

public abstract class BurgerDecorator implements Burger
{
    protected Burger burger;
    public BurgerDecorator(Burger burger){
        this.burger=burger;
    }

}
