package Structural.Facade.services;

public class VegRestaurants implements  Hotel{
    @Override
    public String getMenu() {
        return "Service Veg Menus";
    }
}
