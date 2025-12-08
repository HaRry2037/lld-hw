package Structural.Bridge;

public class ManufactureBikeWorkShop implements Workshop{
    @Override
    public void work() {
        System.out.println("Manufacture a bike");
    }
}
