package StatePattern;

public class ErasingMode implements EditingMode{
    @Override
    public void handleKeyClick() {
        System.out.println("Key Clicked in ERASING Mode");

    }

    @Override
    public void handleKeyPress() {
        System.out.println("Key Clicked in ERASING Mode");


    }
}
