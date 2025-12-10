package StatePattern;

public class WritingMode implements EditingMode{
    @Override
    public void handleKeyClick() {
        System.out.println("key clicked in Writing mode");

    }

    @Override
    public void handleKeyPress() {
        System.out.println("key clicked in Writing mode");


    }
}
