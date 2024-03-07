package command;

public class Main {
    public static void main(String[] args) {
        // создаем объект Фары
        HeadLights l = new HeadLights();
        // создаем объекты для всех умений объекта Фары:
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);

        // Переключатель фар:
        Switch s = new Switch(switchUp, switchDown);

        // Включение и выключение фар
        s.flipUp();
        s.flipDown();
    }
}
