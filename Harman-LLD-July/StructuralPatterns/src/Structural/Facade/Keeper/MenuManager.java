package Structural.Facade.Keeper;

import Structural.Facade.services.Hotel;

public class MenuManager {
    private final Hotel VegRestaurants;
    private final  Hotel NonVegRestaurants;
    public  MenuManager(Hotel VegRestaurants, Hotel NonVegRestaurants){
        this.NonVegRestaurants= NonVegRestaurants;
        this.VegRestaurants=VegRestaurants;
    };
    public String getVegMenu(){
        return this.VegRestaurants.getMenu();
    }
    public String getNonVegMenu(){
        return this.NonVegRestaurants.getMenu();
    }
    public String getBothMenu(){
        return this.getVegMenu() + " " + this.getNonVegMenu();
    }
}
