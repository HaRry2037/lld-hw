package Structural.docratorstruc;

import Structural.docratorstruc.decoration.PattyDecorator;
import Structural.docratorstruc.decorator.AlooTikkiBurger;
import Structural.docratorstruc.decorator.Burger;
import Structural.docratorstruc.decorator.VeggieBurger;

public class Driver {
    public static void main(String[] args){
        Burger alooTikkiBurger= new AlooTikkiBurger();
        Burger veggieBurger= new VeggieBurger();
        Burger extraPattyAlloTikkiBurger= new PattyDecorator(alooTikkiBurger);
        Burger extraPattyVegBurger = new PattyDecorator(veggieBurger);

        System.out.println(extraPattyAlloTikkiBurger.getDescription());
        System.out.println(extraPattyAlloTikkiBurger.getCost());
        System.out.println();
        System.out.println(extraPattyVegBurger.getDescription());
        System.out.println(extraPattyVegBurger.getCost());
    }
}
