package composite;

import java.util.List;

public interface AutoComponent {
    void print();

    void add(AutoComponent component);

    List<AutoComponent> getAll();
}

