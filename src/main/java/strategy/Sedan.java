package strategy;

public class Sedan extends Auto {

    public Sedan() {
        super(new StandartFillStrategy());
    }
}