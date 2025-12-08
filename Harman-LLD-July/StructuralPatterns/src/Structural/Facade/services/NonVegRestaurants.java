package Structural.Facade.services;

public class NonVegRestaurants implements Hotel{
    @Override
    public String getMenu() {
        return "Service Non Veg Menu's";
    }
}
