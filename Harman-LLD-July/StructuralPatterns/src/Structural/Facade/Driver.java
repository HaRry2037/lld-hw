package Structural.Facade;

import Structural.Facade.Keeper.MenuManager;
import Structural.Facade.services.NonVegRestaurants;
import Structural.Facade.services.VegRestaurants;

public class Driver {
    public static void main(String[] args){
        MenuManager menuManager= new MenuManager(
                new VegRestaurants(), new NonVegRestaurants()
        );
        System.out.println(menuManager.getVegMenu());
        System.out.println(menuManager.getNonVegMenu());
        System.out.println(menuManager.getBothMenu());

    }
}
