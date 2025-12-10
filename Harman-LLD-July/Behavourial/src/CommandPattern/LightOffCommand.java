package CommandPattern;

public class LightOffCommand implements  Command{
    private Light light;
    @Override
    public void execute() {
        this.light.turnoff();

    }
}
