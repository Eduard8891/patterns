package command;

public class TurnOffLightCommand implements Command {
    private HeadLights theLight;

    public TurnOffLightCommand(HeadLights light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOff();
    }
}