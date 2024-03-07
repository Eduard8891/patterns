package decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new HeadlightsBulbs();
        Component decorator = new Headlights(component);
        decorator.use();
    }
}
