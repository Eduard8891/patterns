package decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ComponentClass();
        Component decorator = new DecoratorClass(component);
        decorator.method();
    }
}
