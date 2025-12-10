package CommandPattern;

public class LightOnCommand  implements Command{
    private Light light;
    @Override
    public void execute() {
        this.light.turnOn();

    }
}
