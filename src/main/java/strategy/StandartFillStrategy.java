package strategy;

public class StandartFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Just fill up with gas!");
    }
}