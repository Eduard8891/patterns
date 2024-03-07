package strategy;

public class F1PitstopStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Fill up after other procedures!");
    }
}