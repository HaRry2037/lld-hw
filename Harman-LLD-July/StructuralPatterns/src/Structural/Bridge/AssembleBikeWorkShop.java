package Structural.Bridge;

public class AssembleBikeWorkShop  implements Workshop{
    @Override
    public void work() {
        System.out.println("Assemble a bike");
    }
}
