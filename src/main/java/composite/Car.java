package composite;

import java.util.ArrayList;
import java.util.List;

public class Car implements AutoComponent {
    List <AutoComponent> components;

    public Car() {
        components = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("This is a car!");
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
