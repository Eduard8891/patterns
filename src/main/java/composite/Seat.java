package composite;

import java.util.List;

public class Seat implements AutoComponent {
    @Override
    public void print() {
        System.out.println("This is a seat");
    }

    @Override
    public void add(AutoComponent component) {
        System.out.println("We cant add in Seat");
    }

    @Override
    public List<AutoComponent> getAll() {
        throw new RuntimeException("We cans getAll from Seat");
    }
}
