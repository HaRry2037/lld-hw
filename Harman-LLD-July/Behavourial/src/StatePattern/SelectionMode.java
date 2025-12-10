package StatePattern;

public class SelectionMode implements EditingMode{
    @Override
    public void handleKeyClick() {
        System.out.println("key clicked in selection mode");

    }

    @Override
    public void handleKeyPress() {
        System.out.println("key clicked in selection mode");


    }
}
