package Structural.Bridge;

public class Driver {
    public static void main(String[] args){
        Car car = new Car(new ManufactureCarWorkshop(), new AssembleCarWorkShop());
        car.create();
    }
}
