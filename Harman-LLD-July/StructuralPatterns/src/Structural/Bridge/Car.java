package Structural.Bridge;

public class Car extends Vehicle{
    protected Car(Workshop manufacturingWorkshop, Workshop assemblyWorkshop) {
        super(manufacturingWorkshop, assemblyWorkshop);
    }

    @Override
    public void create() {
        System.out.println("We are creating a car");
        manufacturingWorkshop.work();
        assemblyWorkshop.work();

    }
}
