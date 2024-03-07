package decorator;

// Фары на авто
public class Headlights extends Decorator{
    public Headlights(Component component) {
        super(component);
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Use headlights");
    }
}
