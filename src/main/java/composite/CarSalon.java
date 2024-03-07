package composite;

import java.util.ArrayList;
import java.util.List;

public class CarSalon implements AutoComponent {
    List<AutoComponent> components;

    public CarSalon() {
        components = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("This is a salon of car");
    }

    @Override
    public void add(AutoComponent component) {
        components.add(component);
    }

    @Override
    public List<AutoComponent> getAll() {
        return components;
    }
}
