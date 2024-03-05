package decorator;

public class DecoratorClass extends Decorator{
    public DecoratorClass(Component component) {
        super(component);
    }

    @Override
    public void method() {
        super.method();
        System.out.println("Add operation");
    }
}
