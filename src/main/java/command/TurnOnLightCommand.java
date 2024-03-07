package command;

public class TurnOnLightCommand implements Command {
    private HeadLights theLight;

    public TurnOnLightCommand(HeadLights light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}